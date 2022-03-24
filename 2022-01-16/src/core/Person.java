package core;

//java bean
public class Person {

    //属性
    private String id;
    private String name;
    private int age;
    private String nickName;
    private boolean gender;

    //方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("aaa");
        person.setAge(12);
    }


}
