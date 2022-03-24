package base;

public class BreakAndContinueTest {

    public static void main(String[] args) {
//        int sum = 0;
//        for (int i=1; ; i++) {
//            sum = sum + i;
//            if (i == 100) {
//                break;
//            }
//        }
//        System.out.println(sum);


//        for (int i=1; i<=10; i++) {
//            System.out.println("i = " + i);
//            for (int j=1; j<=10; j++) {
//                System.out.println("j = " + j);
//                if (j >= i) {
//                    break;
//                }
//            }
//            System.out.println("breaked");
//        }

        int sum = 0;
        for (int i=1; i<=10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; // continue语句会结束本次循环
            }
            sum = sum + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum); // 25
    }
}
