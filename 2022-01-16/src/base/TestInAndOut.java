package base;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author jiangwei10
 * %d	格式化输出整数
 * %x	格式化输出十六进制整数
 * %f	格式化输出浮点数
 * %e	格式化输出科学计数法表示的浮点数
 * %s	格式化字符串
 */
public class TestInAndOut {

    public static void main(String[] args) {
        //输出
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        //格式化输出
        double d = 12900000;
        // 1.29E7
        System.out.println(d);
        double d1 = 3.1415926;
        // 显示两位小数3.14
        System.out.printf("%.2f\n", d1);
        // 显示4位小数3.1416
        System.out.printf("%.4f\n", d1);

//        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
//        System.out.print("Input your name: "); // 打印提示
//        String name = scanner.nextLine(); // 读取一行输入并获取字符串
//        System.out.print("Input your age: "); // 打印提示
//        int age = scanner.nextInt(); // 读取一行输入并获取整数
//        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出


        Scanner scanner1 = new Scanner(System.in);
        System.out.print("输入一个新的成绩：");
        float newGrade = scanner1.nextFloat();
        System.out.print("输入原来的成绩：");
        float oldGrade = scanner1.nextFloat();
//        if (newGrade > oldGrade) {
        float v = newGrade - oldGrade;
        float v1 = v / oldGrade;
        System.out.printf("%.2f%%", v1 * 100);
//        }
    }
}
