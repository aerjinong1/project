public class OuterAndInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested"); // 实例化一个Outer
        Outer.Inner inner = outer.new Inner(); // 实例化一个Inner
        inner.hello();
        outer.justHi();

        Outer.StaticNested sn = new Outer.StaticNested();
        sn.hello();
    }

}


class Outer {
    private String name;
    private static String NAME = "OUTER";

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }

    void justHi() {
        OuterInterface hi = new OuterInterface() {
            @Override
            public void hi() {
                System.out.println("just hi");
            }
        };
        hi.hi();
    }

    static class StaticNested {
        void hello() {
            System.out.println("Hello, " + Outer.NAME);
        }
    }
}


interface OuterInterface {
    void hi();
}