package exception_test;

public class NullPointExceptionTest {
    public static void main(String[] args) {
        Person p = new Person();
        //null.xxxx
//        try{
//
//        }catch (NullPointerException e){
//
//        }
        //尽快、尽早暴露NPE，并找到出处进行修复，严禁使用try catch对NPE进行处理
        if (p.address.city != null) {
            System.out.println(p.address.city.toLowerCase());
        }

    }
}

class Person {
    String[] name = new String[2];
    Address address = new Address();
}

class Address {
    String city;
    String street;
    String zipcode;
}
