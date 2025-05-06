enum Gender {
    MALE, FEMALE
}

public class Student {
    private String name;
    private String surname;
    private int age;
    private int group;
    private Gender gender;

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname +
                " Age: " + age + " Group: " + group +
                " Gender: " + gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getGroup() {
        return group;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
