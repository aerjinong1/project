package oop;

public class OuterAndInnerTest{
    public static void main(String[] args) {
        Outer outer = new Outer("Nested");// 实例化一个Outer
        Outer.Inner inner = outer.new Inner(); // 实例化一个Inner
        inner.hello();
        inner.hello();
        outer.justHi();

        Outer.StaticNested sn = new Outer.StaticNested();
        sn.hello();

        OurInterfaceImpl ourInterface = new OurInterfaceImpl();
        ourInterface.hi();
    }

}


class Outer {
    private String name;
    private static String NAME = "OUTER";


    Outer(String name) {
        this.name = name;
    }

    //内部类
    public class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }

    void justHi() {
        /**
         *1、实现OuserInterface中的方法
         *2、 进行调用，并且如果有返回值的话得到返回值
         * 匿名类
         */
        OuterInterface hi = new OuterInterface(){
            @Override
            public void hi() {
                System.out.println("just hi");
            }
        };
        //() -> System.out.println("just hi")
        hi.hi();
    }

    /**
     * 1、静态内部类不再依赖于外部类的实际对象来创建对象，直接使用"new外部类.构造方法"的方式来创建对象
     * 2、因为静态内部类是属于外部类的，所以他不可以访问外部类中的成员变量
     */
    static class StaticNested {
        void hello() {
            System.out.println("Hello, " + Outer.NAME);
        }
    }

    class InnerExtendTest extends Outer.Inner{

    }
}


interface OuterInterface {
    void hi();
}

class OurInterfaceImpl implements OuterInterface {

    @Override
    public void hi() {
        System.out.println("hello");
    }
}


class InnerExtendTest extends Outer{

    InnerExtendTest(String name) {
        super(name);
    }

    class Inner2 extends Outer.Inner{

    }
}
