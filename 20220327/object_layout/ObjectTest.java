package object_layout;

import org.openjdk.jol.info.ClassLayout;

public class ObjectTest {
    public static void main(String[] args) {
        TestUser t=new TestUser();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
    }
}



class TestUser{
    private int id;
    private int age;
    private A a;

    public TestUser test1(){
        TestUser testUser = new TestUser();
        return testUser;
    }

    public void test2(){
        TestUser testUser = new TestUser();
    }

}


class A{
    private int a1;
}




