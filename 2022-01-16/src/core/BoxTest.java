package core;

import java.security.SecureRandom;

public class BoxTest {

    public static void main(String[] args) {
//        int i = 100;
//        Integer i1 = 1000;
//        System.out.println(i1);
//        Integer n = Integer.valueOf(i); //装箱
//        int x = n.intValue();  //拆箱
//
        Integer n1 = null;
////        int x1 = n1;
//
        Integer n3 = n1;
//        int x2 = true  ? n3 : 1;


//        Integer n4 = 127;
//        Integer n5 = 127;
//        System.out.println(n4 == n5);

//        Integer n6 = 128;
//        Integer n7 = 128;
//        System.out.println(n6 == n7);


        System.out.println(Integer.toString(100)); // "100",表示为10进制
        //http://xxx.com/X67ysr ->https://xxx.com/xxxx/xxxx/xxx/xxxx
        //1、https://xxx.com/xxxx/xxxx/xxx/xxxx->数字生成器->将生成的数字和长链接做一一对应，并存储到数据库或其他地方
        //2、拿着上一步的数字，转换进制（十进制->64进制）->将转换进制后的字符串存到数据库中，与长链接一一对应
        System.out.println(Integer.toString(100, 36)); // "2s",表示为36进制
        System.out.println(Integer.toHexString(100)); // "64",表示为16进制
        System.out.println(Integer.toOctalString(100)); // "144",表示为8进制
        System.out.println(Integer.toBinaryString(100)); // "1100100",表示为2进制


//        byte x = -1;
//        byte y = 127;
//        System.out.println(Byte.toUnsignedInt(x)); // 255
//        System.out.println(Byte.toUnsignedInt(y)); // 127
    }
}


class A {
    public void run(Person p) {
        System.out.println(p.getName() + "run");
    }
}
