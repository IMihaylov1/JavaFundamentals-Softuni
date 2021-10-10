public class Student {
    private String name;
    private String lastName;
    private int age;
    private String town;

    public Student(String name, String lastName, int age, String town) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.town = town;


    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}

