package package_test;

public class TestPackage {
    public static void main(String[] args) {
        int number = Person.number;
        TestSamePackage aPackage = new TestSamePackage();
        aPackage.hello();
    }
}
