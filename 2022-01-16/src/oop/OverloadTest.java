package oop;

import java.sql.SQLOutput;

public class OverloadTest {

    public static void main(String[] args) {
        String s="Test string";
        int n1 = s.indexOf(4);
        System.out.println(n1);
        int n2 = s.indexOf("st");
        System.out.println(n2);
        int n3 = s.indexOf("st", 4);
        System.out.println(n3);

    }
}

//方法重载：功能类似，但参数不同，使用统一名称便于记忆和调用。
class Hello {
    public void hello() {
        System.out.println("Hello, world!");
    }

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
