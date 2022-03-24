package oop;

/**
 * @author jiangwei10
 * 一个源文件中只能有一个 public 类
 * 一个源文件可以有多个非 public 类
 * 源文件的名称应该和 public 类的类名保持一致。例如：源文件中 public 类的类名是 Employee，那么源文件应该命名为Employee.java。
 * 如果一个类定义在某个包中，那么 package 语句应该在源文件的首行。
 * 如果源文件包含 import 语句，那么应该放在 package 语句和类定义之间。如果没有 package 语句，那么 import 语句应该在源文件中最前面。
 * import 语句和 package 语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明
 */
public class Car {
    String name;
    int length;
    String type;

    public Car(String name) {
        this.name = name;
    }

    void stop() {
    }

    void run() {
        System.out.println(this.name + " is run");
    }

    public static void main(String[] args) {
        /* 实例化对象 */
        Car ford = new Car("ford");
        /* 访问类中的变量 */
        String carName = ford.name;
        System.out.println("car name is" + carName);
        /* 访问类中的方法 */
        ford.run();
    }
}
