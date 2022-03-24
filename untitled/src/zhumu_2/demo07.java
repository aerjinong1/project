package zhumu_2;
class person{

//    public static int a = 2;
    public static int a;
    static{
        a = 2;
    }
    public static int b;
    static {
        a = 3;
        b = 4;
    }
}
public class demo07 {
    public static void main(String[] args) {
        System.out.println(person.a);
        System.out.println(person.b);
    }
}
