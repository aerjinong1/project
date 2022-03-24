package oop;

public class ExtendTest {

//    public static final int A = 162;

    protected String a1 = "aaa";

    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);
        s.run();
//        A=123;

        Person p = s; // upcasting, ok
//        Object o1 = p; // upcasting, ok
//        Object o2 = s; // upcasting, ok

        Person p1 = new Student(); // upcasting, ok
//        Person p2 = new Person();
        Student s1 = (Student) p1; // ok
//        if (p2 instanceof Student) {
//            Student s2 = (Student) p2; // runtime error! ClassCastException!
//        }

        PrimaryStudent primaryStudent = new PrimaryStudent(4, "abc", 10, 100);

//        Person p = new Person();
//        System.out.println(p instanceof Person); // true
//        System.out.println(p instanceof Student); // false

//        Student s = new Student();
//        System.out.println(s instanceof Person); // true
//        System.out.println(s instanceof Student); // true
//
//        Student n = null;
//        System.out.println(n instanceof Student); // false

//        Person p = new Student();
//        if (p instanceof Student) {
//            // 只有判断成功才会向下转型:
//            Student s = (Student) p; // 一定会成功
//        }
        A a =new A();
        Student student = a.getStudent();


    }
}


class Student extends Person {

    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:

    public Student() {

    }

    public Student(String name, int age, int score) {
//        super(); //自动调用父类无参构造方法，但是此处，Person并没有定义该方法
        super(name, age);
        this.score = score;
    }

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void hello() {
        System.out.println("hello" + name);
    }

    @Override //方法的覆写（重写） annotation(注解)
    public void run() {
        System.out.println("student.run");
    }
}


class A {
    protected String a;

    public Student getStudent() {
        return new Student();
    }
}

final class A1 {

}

class PrimaryStudent extends Student {
    private int grade;

    public PrimaryStudent(int grade, String name, int age, int score) {
        super(name, age, score);
        this.grade = grade;
    }

    @Override
    public void run() {
        System.out.println("primary.run");
    }
}
