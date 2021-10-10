package OrderByAge;

public class People {
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    private int id;
    private int age;

    public People(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


}
