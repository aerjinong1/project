package homework_01_16;

import java.util.ArrayList;
import java.util.Scanner;

public class StuScoSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stu = new ArrayList<>();
        Student s1 = new Student("1年1班",11,"wxz1",1);
        Student s2 = new Student("1年1班",10,"wxz2",2);
        Student s3 = new Student("1年1班",13,"wxz3",3);
        Student s4 = new Student("1年1班",14,"wxz4",4);
        Student s5 = new Student("1年1班",15,"wxz5",5);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);
        System.out.println("输入id查询学生信息");
        int scid = sc.nextInt();
        int j = 0;
        for (Student i : stu
             ) {

            if (scid == (stu.get(j).getId())){
                stu.get(j).getinfo();
            }
            ++j;
        }
//        System.out.println(stu.get(2).getId());
//        System.out.println(s3.getId());
//        System.out.println(s3.getId()+"\n"+s1.getScore());
//        int [] a = {1,2,3,4};
//        for (int i  :a
//                ) {
//            System.out.println(i);
//        }
    }
}
class Teacher extends Persons{
    private String tclass;

    public String getTclass() {
        return tclass;
    }

    public void setTclass(String tclass) {
        this.tclass = tclass;
    }
}


class Subject {
    private String subject;
}

class  Classes{
    private int num;
}
class Student extends Persons{
    private String sclass;

    public Student(String sclass,int age,String name,int id){
        this.sclass = sclass;
        super.setAge(age);
        super.setName(name);
        super.setId(id);

    }
    public void getinfo(){
        System.out.println("年龄是"+this.getAge()+"\t姓名是"+this.getName());
    }
    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

}



class Persons{
    private int id;
    private int age;
    private String name;
    private int gender;
//    public static final int MALE = 1;
//    public static final int FEMALE = 2;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


 public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}