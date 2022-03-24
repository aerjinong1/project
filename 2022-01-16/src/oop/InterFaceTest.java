package oop;

public class InterFaceTest {

    public static void main(String[] args) {
        Car toyota = new Toyota();
        toyota.run();
        toyota.abc();
        Car aaa = new Aaa();
        aaa.abc();

        UserService userService = new UserServiceFoClient();
        Person user = userService.getUserById(111);
    }
}


/**
 * 接口是一种特殊的抽象类
 * 当我们接口需要新增方法的时候，
 * 如果没有default方法，会涉及到改动所有子类，
 * 如果新增default方法，只需要在接口处定义一个方法就可以满足需求
 */
interface Car {

    void run();

    String getName();

    default void abc() {
        System.out.println("abc");
    }

    void abcd();
}


interface House {

    //在interface中，如下表示，其实是一个常量，所以，interface中允许定义常量
    int basespay = 0;//正常收入  public static final int basespay=0;

    void cook();

    void shower();
}


class Toyota implements Car, House {

    @Override
    public void run() {
        System.out.println("toyota.run");
    }

    @Override
    public String getName() {
        return "toyota";
    }

    @Override
    public void abcd() {

    }

    @Override
    public void cook() {

    }

    @Override
    public void shower() {

    }
}

class Aaa implements Car {

    @Override
    public void run() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void abcd() {

    }
}

class UserServiceImpl implements UserService {
    public Person getUserById(int userId) {
        //获取用户信息。。。。
        return new Student();
    }


    public Person getUserByName(String name) {
        //通过名字获取用户的逻辑。。。。
        return new Student();
    }

}

interface UserService {
    Person getUserById(int userId);

    Person getUserByName(String name);
}

class UserServiceFoClient implements UserService {

    @Override
    public Person getUserById(int userId) {
        //1、用网络连接我的服务器
        //2、把客户的参数通过网络发给我
        //3、返回数据给客户
        return null;
    }

    @Override
    public Person getUserByName(String name) {
        //1、用网络连接我的服务器
        //2、把客户的参数通过网络发给我
        //3、返回数据给客户
        return null;
    }
}
