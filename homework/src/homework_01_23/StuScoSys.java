package homework_01_23;

import java.util.*;

public class StuScoSys {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Student> map = new HashMap<>();
        ArrayList<Student> stu = new ArrayList<>();
        Student s1 = new Student("1年1班",11,"wxz1",1);
        Student s2 = new Student("1年1班",10,"wxz1",1);
        Student s3 = new Student("1年1班",13,"wxz3",3);
        Student s4 = new Student("1年1班",14,"wxz4",4);
        Student s5 = new Student("1年1班",15,"wxz5",5);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);

//        System.out.println("输入id查询学生信息");
//        int scid = sc.nextInt();
//        Calendar instance = Calendar.getInstance();
//        int startTime = instance.get(Calendar.MILLISECOND);//这个时间戳是在程序运行到这行时开始计时到endtime结束
//        //两者可能没有区别，可能是由于数据量太少导致时间差距太小看不出变化
//        System.out.println(s1.equals(s2));
//        int j = 0;
//        for (Student i : stu
//        ) {
//
//            if (scid == (stu.get(j).getId())){
//                stu.get(j).getinfo();
//            }
//            ++j;
//        }
//        int endTime = instance.get(Calendar.MILLISECOND);
//        System.out.println(+endTime-startTime+"----数组用时");
//
//        map.put("s1",s1);
//        map.put("s2",s2);
//        map.put("s3",s3);
//        map.put("s4",s4);
//        map.put("s5",s5);
//        System.out.println("输入id查询学生信息");
//        Scanner sc1 = new Scanner(System.in);
//        String sno = sc1.nextLine();
//        System.out.println("=========================");
//        int startTime1 = instance.get(Calendar.MILLISECOND);
//        map.get(sno).getinfo();
//        int endTime1 = instance.get(Calendar.MILLISECOND);
//        System.out.println(endTime1-startTime1+"----Map用时");



//        System.out.println(stu.get(2).getId());
//        System.out.println(s3.getId());
//        System.out.println(s3.getId()+"\n"+s1.getScore());
//        int [] a = {1,2,3,4};
//        for (int i  :a
//                ) {
//            System.out.println(i);
//        }
        System.out.println(s1.equals(s2));
    }
}
//long endTime1 = System.currentTimeMillis();
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
        System.out.println("年龄是"+this.getAge()+"\t姓名是"+this.getName()+"性别是\t"+this.getGender()+
                "班级是\t"+this.getSclass());
    }
    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
           if(this.getId()==((Student) obj).getId()&&this.getName().equals(((Student) obj).getName())){
               System.out.println("这是对比id与name是否E相同的equal");
               return true;
           }
           return false;
        }
        return false;
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