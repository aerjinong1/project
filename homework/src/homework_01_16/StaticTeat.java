package homework_01_16;

public class StaticTeat {
    public static void main(String[] args) {
//        Person p = new Person();
        Person p1 = new Person(18,"wxz");
        System.out.println(Person.getcount());
        Person p2 = new Person();
        System.out.println(Person.getcount());
        Person p3 = new Person(19,"wxz");
    }
}
class Person {
    private int age;
    private String name;
    private static int count=0;
    public Person(){
        count++;
    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
        count++;
    }
    public static int getcount(){
    return count;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}