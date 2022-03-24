public class StaticTest {

    public static void main(String[] args) {
        Person1 ming = new Person1("Xiao Ming", 12);
        Person1 hong = new Person1("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);


        Person1.setNumber(199);
        System.out.println(Person1.number);
    }
}



class Person1 {
    public String name;
    public int age;
    // 定义静态字段number:
    public static int number;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setNumber(int value) {
        number = value;
    }
}


interface Person2{
    public static final int MALE = 1;
    public static final int FEMALE = 2;
}