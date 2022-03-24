package oop.package_test;

import oop.package_test.TestSamePackage;

public class TestPackage {
    public static void main(String[] args) {
        int number = Person.number;
        TestSamePackage aPackage = new TestSamePackage();
        aPackage.hello();
    }
}
