package homework_01_09;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("输入基本工资");
        e1.setBasespay(sc.nextInt());
        System.out.println("输入奖金");
        e1.setBonus(sc.nextInt());
        System.out.println("你的税收为："+e1.counttex());
        int base = sc.nextInt();
        Author a1 = new Author(base,4000,2000);
        System.out.println("带有稿费的税收为"+a1.counttex());
    }
}
