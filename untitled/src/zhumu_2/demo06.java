package zhumu_2;
interface Iperson{
    void dis();
};
class Person implements Iperson{
    @Override
    public void dis() {
        System.out.println("person");
    }
}
class Stu extends Person{
    @Override
    public void dis() {
        System.out.println("student");
    }
}
class uin_stu extends Stu{
    @Override
    public void dis() {
        System.out.println("uin_stu");
    }
}
public class demo06 {
    public static void doit(Person pe){
        pe.dis();
    }
    public static void main(String[] args) {
        demo06.doit(new Stu());
    }
}
