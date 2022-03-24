package oop;

public class StaticTest {

    public static void main(String[] args) {
        Person1 ming = new Person1("Xiao Ming", 12);
        Person1 hong = new Person1("Xiao Hong", 15);
        ming.number = 88;
        ming.run();
        System.out.println(hong.number);
        hong.number = 99;
        hong.run();
        System.out.println(ming.number);

        System.out.println(Person1.number);


        Person1.setNumber(199);
        System.out.println(Person1.number);
    }
}


class Person1 {
    //成员变量、属性
    public String name;
    public int age;
    // 定义静态字段number: (类变量)
    public static int number;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法，实例方法
    public void run(){
    }

    public static void setNumber(int value) {
        number = value;
    }
}


interface Person2 {
    public static final int MALE = 1;
    public static final int FEMALE = 2;
}