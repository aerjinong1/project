package base;

/**
 * @author jiangwei10
 */
public class Condition {
    public static void main(String[] args) {
//        int n = 50;
//        if (n >= 60) {
//            System.out.println("及格了");
//        }
//        System.out.println("END");

//        int n = 70;
//        if (n >= 60) {
//            System.out.println("及格了");
//            System.out.println("恭喜你");
//        }
//        System.out.println("END");

//        int n = 70;
//        if (n >= 60)
//            System.out.println("及格了");
//        System.out.println("END");


//        int n = 70;
//        if (n >= 60) {
//            System.out.println("及格了");
//        } else {
//            System.out.println("挂科了");
//        }
//        System.out.println("END");


//        int n = 30;
//        if (n >= 90) {
//            System.out.println("优秀");
//        } else if (n >= 60) {
//            System.out.println("及格了");
//        } else {
//            System.out.println("挂科了");
//        }
//        System.out.println("END");


        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        String s3 = null;
        if ("hello".equals(s3)) {
            System.out.println("hello");
        }
    }
}
