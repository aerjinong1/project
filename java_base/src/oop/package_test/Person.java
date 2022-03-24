package package_test;

public class Person {

    protected static int number = 1;

    public static void main(String[] args) {

    }
}

class TestSamePackage {
    void hello() {
        System.out.println("hello");
    }

    void hi(String name) { // ①
        String s = name.toLowerCase(); // ②
        int len = s.length(); // ③
        if (len < 10) { // ④
            int p = 10 - len; // ⑤
            for (int i = 0; i < 10; i++) { // ⑥
                System.out.println(); // ⑦
            } // ⑧
        } // ⑨
    } // ⑩
}

final class FinalClassTest {
    private final int n = 0;

    // 无法被覆写:
    protected final void hi() {
        System.out.println("a");
    }
}
