package oop;

public class MethodTest {
    public static void main(String[] args) {
//        Person ming = new Person();
//        ming.name = "Xiao Ming"; // 对字段name赋值
//        ming.age = 12; // 对字段age赋值


//        Group g = new Group();
//        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
//        g.setNames("Xiao Ming", "Xiao Hong"); // 传入2个String
//        g.setNames("Xiao Ming"); // 传入1个String
//        g.setNames();
    }
}

class Person {
    //    public String name;
//    public int age;
    private String name;
    private int age;

//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setAge(int age) {
//        if (age < 0 || age > 100) {
//            throw new IllegalArgumentException("invalid age value");
//        }
//        this.age = age;
//    }
}

class Group{
    private String[] names;
    public void setNames(String... names) {
        this.names = names;
    }
}