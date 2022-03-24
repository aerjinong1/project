package core;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringAndCharSetTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String[] aaa = {"aaa", "bbb", "ccc"};
//        String s = "Hello";
//        String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});
//        System.out.println(s);
//        s = s.toUpperCase();
//        System.out.println(s);


//        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));


//        String s1 = "hello";
//        String s2 = "HELLO".toLowerCase();
//        String s6 = "HELLO";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s6.equalsIgnoreCase(s1));
        //如果你想比较两个字符串，必须总是使用equals方法来比较

        // 是否包含子串:
//        "Hello".contains("ll"); // true
//        "Hello".indexOf("l"); // 2
//        "Hello".lastIndexOf("l"); // 3
//        "Hello".startsWith("He"); // true
//        "Hello".endsWith("lo"); // true

//        System.out.println("  \tHello\r\n ");
//        System.out.println("  \tHello\r\n ".trim());


//        System.out.println("".isEmpty());
//        System.out.println("  ".isEmpty());

//        String s = "hello";
//        s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
//        s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"


//        String s = "A,B,C,D";
//        String[] ss = s.split(","); // {"A", "B", "C", "D"}


//        String[] arr = {"A", "B", "C"};
//        String s = String.join("***", arr); // "A***B***C"


//        System.out.printf("Hi %s, your score is %.2f!%n", "Bob", 59.5);


//        String.valueOf(123); // "123"
//        String.valueOf(45.67); // "45.67"
//        String.valueOf(true); // "true"
//        String.valueOf(new Object()); // 类似java.lang.Object@636be97c

//        String shello="Hello";

        byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
        byte[] b3 = "Hello".getBytes("GBK"); // 按GBK编码转换
        byte[] b4 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换

        System.out.println(Arrays.toString(b1));
        System.out.println(Arrays.toString(b2));
        System.out.println(Arrays.toString(b3));
        System.out.println(Arrays.toString(b4));

        byte[] b = {};
        String s3 = new String(b, "GBK"); // 按GBK转换
        String s4 = new String(b, StandardCharsets.UTF_8); // 按UTF-8转换

    }
}
