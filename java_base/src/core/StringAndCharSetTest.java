package core;

public class StringAndCharSetTest {

    public static void main(String[] args) {
        String s = "Hello";
        String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);


//        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));


//        String s1 = "hello";
//        String s2 = "HELLO".toLowerCase();
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        // 是否包含子串:
//        "Hello".contains("ll"); // true
//        "Hello".indexOf("l"); // 2
//        "Hello".lastIndexOf("l"); // 3
//        "Hello".startsWith("He"); // true
//        "Hello".endsWith("lo"); // true

//        "  \tHello\r\n ".trim(); // "Hello"
//        "\u3000Hello\u3000".strip(); // "Hello"
//        " Hello ".stripLeading(); // "Hello "
//        " Hello ".stripTrailing(); // " Hello"


//        "".isEmpty(); // true，因为字符串长度为0
//        "  ".isEmpty(); // false，因为字符串长度不为0

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
    }
}
