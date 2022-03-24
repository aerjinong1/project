package core;

import java.security.SecureRandom;
import java.util.Random;

public class UtilTest {
    public static void main(String[] args) {
        //求绝对值
        Math.abs(-100); // 100
        Math.abs(-7.8); // 7.8
        //最大最小值
        Math.max(100, 99); // 100
        Math.min(1.2, 2.3); // 1.2
        //幂计算
        Math.pow(2, 10); // 2的10次方=1024
        //根号
        Math.sqrt(2); // 1.414...
        //e的n次方
        Math.exp(2); // 7.389...
        //e为底的对数
        Math.log(4); // 1.386...
        //三角函数
        Math.sin(3.14); // 0.00159...
        Math.cos(3.14); // -0.9999...
        Math.tan(3.14); // -0.0015...
        Math.asin(1.0); // 1.57079...
        Math.acos(1.0); // 0.0
        //常量
        double pi = Math.PI; // 3.14159...
        double e = Math.E; // 2.7182818...
        Math.sin(Math.PI / 6); // sin(π/6) = 0.5



        //时间戳
        System.out.println(System.currentTimeMillis());
        //用来创建伪随机数
//        Math.random();
//        Random r = new Random();
//        r.nextInt(); // 2071575453,每次都不一样
//        r.nextInt(10); // 5,生成一个[0,10)之间的int
//        r.nextLong(); // 8811649292570369305,每次都不一样
//        r.nextFloat(); // 0.54335...生成一个[0,1)之间的float
//        r.nextDouble(); // 0.3716...生成一个[0,1)之间的double


//        Random r = new Random(12345);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(r.nextInt(100));
//        }
        // 51, 80, 41, 28, 55...

        //RNG（random number generator）CPU噪声频率、读写磁盘字节数、网络流量信息、等等
        //真随机数
        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt(100));

    }
}
