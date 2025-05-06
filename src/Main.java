import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Mariya");
        student1.setGender(Gender.FEMALE);
        student1.setSurname("Ivanova");
        student1.setGroup(102);
        student1.setAge(22);

        var file = new File("data.txt");

        save(student1, file);

        var student2 = load(file, Student.class);
        System.out.println(student2);
    }

    public static <T> void save(T object, File file){
        var mapper = new ObjectMapper();
        try {
            //String s = mapper.writeValueAsString(object);
            mapper.writeValue(file, object);
            //System.out.println(s);
        } catch (JsonProcessingException e) {
            System.out.println("JSON Error");
        } catch (IOException e) {
            System.out.println("Save Error");
        }
    }

    public static <T> T load(File file, Class<T> type) {
        var mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        try {
            return mapper.readValue(file, type);
        } catch (IOException e) {
            System.out.println("Error reading");
            return null;
        }
    }
}

