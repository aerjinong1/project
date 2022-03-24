package oop;

//一个.java文件中，有且只有一个public class,且public class的名称要与.java文件的名称一致

/**
 * public: 公有访问权限
 * private: 私有访问权限
 * protected: 有限访问权限*
 *
 *
 * 特殊：package:包作用域，允许一个类访问当前package中没有任何修饰符的class、字段、方法
 */
public class MethodTest {
    public static void main(String[] args) {
////        Person ming = new Person();
//        Person ming = new Person(12, "abc");
////        ming =new Person(12,"abcd");
//        Person ming1 = new Person(13, "abcd");
////        ming.name="qqqqq";
//        ming.setName("qqqq");
//
//        ming.setNickNames("aaa", "bbb", "ccc");
//        System.out.println("----" + ming1.getName());
////        ming.name = "Xiao Ming"; // 对字段name赋值
////        ming.age = 12; // 对字段age赋值
//
//
////        Group g = new Group();
////        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
////        g.setNames("Xiao Ming", "Xiao Hong"); // 传入2个String
////        g.setNames("Xiao Ming"); // 传入1个String
////        g.setNames();
//
//        School mySchool = new School();
//        mySchool.setName("你的学校名称");
//        mySchool.setLeaderName("你的校长名称");
//        mySchool.setLevel("学校级别");
//
//        School tute = new School("tute", "校长名称", "学校地址", "师范类", "无级别", 20000, 40000);

    }
}

//class Person {
//    private String name; //null
//    private int age;
//    private String[] nickNames;
//
//    public Person() {
//
//    }
//
//    //
//    public Person(int age, String name) {
//        this.name = name; //这里的this指向当前这个类创建出来的对象
//        this.age = age; //这里的this指向当前这个类创建出来的对象
//    }
//
//    public void setName(String name) {
//        //xxxxx
//        this.name = name;
//        //xxxx
//    }
//
//    public String getName() {
//        //xxx
//        return wrapperName();
//    }
//
//    public void setNickNames(String... nickNames) {
//        this.nickNames = nickNames;
//    }
//
//    public Person(int age) {
//        this.age = age; //这里的this指向当前这个类创建出来的对象
//    }
////    private String name;
////    private int age;
//
////    public String getName() {
////        return this.name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public int getAge() {
////        return this.age;
////    }
////
////    public void setAge(int age) {
////        if (age < 0 || age > 100) {
////            throw new IllegalArgumentException("invalid age value");
////        }
////        this.age = age;
////    }
//
//    private String wrapperName() {
//        return "姓名：" + name;
//    }
//}

class Group {
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }
}


class School {
    private String name;
    private String leaderName; //校长名称
    private String location;
    private String type;
    private String level;
    private long count;
    private long size;

    public School(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public School() {
    }

    public School(String name, String leaderName, String location, String type, String level, long count, long size) {
        this.name = name;
        this.leaderName = leaderName;
        this.location = location;
        this.type = type;
        this.level = level;
        this.count = count;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }


}