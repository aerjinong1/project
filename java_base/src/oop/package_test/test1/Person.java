package package_test.test1;

public class Person {
    public static void main(String[] args) {
//        package_test.Person.number;
    }
}

class Person123 extends package_test.Person{
    public void test(){
        int number = package_test.Person.number;
    }
}
