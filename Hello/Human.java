package Hello;

public class Human {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + "]";
    }
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}