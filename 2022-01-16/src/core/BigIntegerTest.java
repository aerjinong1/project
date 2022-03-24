package core;

import java.math.BigInteger;

//大整数计算
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1234567890");
        //幂运算
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000

        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2); // 12345678902469135780
        System.out.println(sum);

        BigInteger i = new BigInteger("123456789000");
        System.out.println(i.longValue()); // 123456789000
        System.out.println(i.multiply(i).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range
    }
}
