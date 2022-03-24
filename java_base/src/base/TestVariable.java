package base;

/**
 * @author jiangwei10
 * 大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
 * 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
 * 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
 * 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
 * 主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。
 */
public class TestVariable {

    private static final int staticIntVal = 1;

    private final int memberIntVal = 2;

//    static byte byteVal;
//    static int intVal;
//    static short shortVal;
//    static long longVal;
//    static float floatVal;
//    static double doubleVal;
//    static boolean boolVal;
//    static char charVal;

    public static void main(String[] args) {
//        byte byteVal;
//        int intVal;
//        short shortVal;
//        long longVal;
//        float floatVal;
//        double doubleVal;
//        boolean boolVal;
//        char charVal;
//
//        byteVal = 0;
//        intVal = 1;
//        shortVal = 2;
//        longVal = 3L;
//        floatVal = 1.1f;
//        doubleVal = 1.1d;
//        boolVal = true;
//        charVal = 'a';
//        System.out.println(byteVal);
//        System.out.println(intVal);
//        System.out.println(shortVal);
//        System.out.println(longVal);
//        System.out.println(floatVal);
//        System.out.println(doubleVal);
//        System.out.println(boolVal);
//        System.out.println(charVal);


        int i = (100 + 200) * (99 - 88);
        int n = 7 * (5 + (i - 9));
        System.out.println(i);
        System.out.println(n);
        int i1 = 12345 / 67;
        System.out.println(i1);
        int i2 = 12345 % 67;
        System.out.println(i2);


        int x = 2147483647;    //0111 1111 1111 1111 1111 1111 1111 1000
        int y = 10;            //0000 0000 0000 0000 0000 0000 0000 1010
        //1000 0000 0000 0000 0000 0000 0000 0010
        System.out.println(x + y); //可以把x、y变成long

        int n1 = 100;
        n1 += 100;   //n1=n1+100
        n1 *= 100;
        n1 -= 100;
        n1 /= 100;


        n1++;
        ++n1;
        n1--;
        --n1;

        int n2 = 7;  // 0000 0000 0000 0000 0000 0000 0000 0111
        int n3 = n2 << 1;  //0000 0000 0000 0000 0000 0000 0000 1110
        int n4 = n2 >> 1;  // 0000 0000 0000 0000 0000 0000 0000 0011


        int n5 = 0 & 0; //0
        int n6 = 0 & 1; //0
        int n7 = 1 & 1; //1
        int n8 = 1 & 0; //0


        int n9 = 0 | 0; //0
        int n10 = 0 | 1; //1
        int n11 = 1 | 1; //1
        int n12 = 1 | 0; //1

        int n13 = 0 ^ 0; //0
        int n14 = 0 ^ 1; //1
        int n15 = 1 ^ 1; //0
        int n16 = 1 ^ 0; //1


        char c1 = '\u0041';
        int cn1 = c1;
        System.out.println(cn1);
        char c2 = '中';
        int cn2 = c2;
        System.out.println(cn2);

        String s = "";
        String s1 = "a";
        String s2 = "abcdefg";
        String s3 = "abc中国";
        String s4 = s1 + s2 + s3;

        int[] ns = new int[5];
        ns[0] = 1;
        ns[1] = 2;
        ns[2] = 3;
        ns[3] = 4;
        ns[4] = 5;
        System.out.println(ns.length);
        System.out.println(ns[3]);

        int[] ns1 = {1, 2, 3, 4, 5};
        String[] ss2 = new String[5];
        String[] ss1 = {"abc", "bcd", "def"};
    }

}
