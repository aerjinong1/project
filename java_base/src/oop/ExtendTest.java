public class ExtendTest {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);

        Person p = s; // upcasting, ok
        Object o1 = p; // upcasting, ok
        Object o2 = s; // upcasting, ok

//        Person p1 = new Student(); // upcasting, ok
//        Person p2 = new Person();
//        Student s1 = (Student) p1; // ok
//        Student s2 = (Student) p2; // runtime error! ClassCastException!

//        Person p = new Person();
//        System.out.println(p instanceof Person); // true
//        System.out.println(p instanceof Student); // false
//
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
    }
}

class Student extends Person {

    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:

    public Student(String name, int age, int score) {
        super(name, age); // 调用父类的构造方法Person(String, int)
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
        System.out.println("hello" + super.name);
    }
}
