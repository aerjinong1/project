package oop;


/**
 * final:
 * 加在类上：当前类无法被继承
 * 加在方法上：当前方法无法被重写
 * 加在变量上：当前变量无法被二次赋值（相当于C当中的常量）
 */
public class ConstructorTest {
    public static void main(String[] args) {
//        Person p = new Person("Xiao Ming", 15);
//        System.out.println(p.getName());
//        System.out.println(p.getAge());
//        System.out.println(p.getClass());

//        Person p = new Person();
    }
}

//没有明确定义extends类，都继承自Object
//一个protected字段或者方法，可以被其子类，及其子类的子类访问。


//抽象类：不能被实例化（即不能通过该类直接创建对象）
abstract class Person {
    protected String name;
    protected int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + lastName;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public abstract void run();
}
