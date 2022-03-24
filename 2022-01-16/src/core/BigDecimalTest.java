package core;

import java.math.BigDecimal;
import java.math.RoundingMode;

//精确浮点数计算
public class BigDecimalTest {
    public static void main(String[] args) {
//        BigDecimal bd = new BigDecimal("123.4567");
//        double a = 123.4567d;
//        System.out.println(a * a);
//        System.out.println(bd.multiply(bd)); // 15241.55677489
//
//
//        BigDecimal d1 = new BigDecimal("123.45");
//        BigDecimal d2 = new BigDecimal("123.4500");
//        BigDecimal d3 = new BigDecimal("1234500");
//        System.out.println(d1.scale()); // 2,两位小数
//        System.out.println(d2.scale()); // 4
//        System.out.println(d3.scale()); // 0

//        BigDecimal d1 = new BigDecimal("123.4500");
//        BigDecimal d2 = d1.stripTrailingZeros();
//        System.out.println(d1.scale()); // 4
//        System.out.println(d2.scale()); // 2,因为去掉了00
//
//        BigDecimal d3 = new BigDecimal("1234500");
//        BigDecimal d4 = d3.stripTrailingZeros();
//        System.out.println(d3.scale()); // 0
//        System.out.println(d4.scale()); // -2  1、当前数字是整数 2、当前数字末尾有2个0
//
//
//        BigDecimal d1 = new BigDecimal("123.456789");
//        BigDecimal d2 = d1.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
//        BigDecimal d3 = d1.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
//        System.out.println(d2);
//        System.out.println(d3);
//
//
//
//        BigDecimal d1 = new BigDecimal("123.456");
//        BigDecimal d2 = new BigDecimal("23.456789");
//        BigDecimal d3 = d1.divide(d2, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
////        BigDecimal d4 = d1.divide(d2); // 报错：ArithmeticException，因为除不尽
//
//        System.out.println(d3);
////        System.out.println(d4);


//        BigDecimal n = new BigDecimal("12.345");
//        BigDecimal m = new BigDecimal("0.12");
//        BigDecimal[] dr = n.divideAndRemainder(m);
//        System.out.println(dr[0]); // 102 商
//        System.out.println(dr[1]); // 0.105 余数
//        if (dr[1].signum() == 0) {
//            System.out.println("n是m的整数倍");
//        }


//        BigDecimal n = new BigDecimal("12.75");
//        BigDecimal m = new BigDecimal("0.15");
//        BigDecimal[] dr = n.divideAndRemainder(m);
//        if (dr[1].signum() == 0) {
//            // n是m的整数倍
//        }

//        BigDecimal d1 = new BigDecimal("123.456");
//        BigDecimal d2 = new BigDecimal("123.45600");
//        //bigDecimal的equals不能准确比较出两个值是否真正相等，因为这里的equals方法是逐位比较，小数位数不一致也返回false
//        System.out.println(d1.equals(d2)); // false,因为scale不同
//        System.out.println(d1.equals(d2.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为2
//        //返回值：1代表d1>d2  -1代表d1<d2 0代表d1=d2
//        System.out.println(d1.compareTo(d2)); // 0
    }
}
