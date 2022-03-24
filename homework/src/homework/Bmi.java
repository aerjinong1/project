package homework;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入体重");
        float weight = sc.nextFloat();
        System.out.println("输入身高");
        float high = sc.nextFloat();
        float bmi = weight/(high*high);
        System.out.println(bmi);
        if (bmi<18.5){
            System.out.println("过轻");
        }else if (bmi>=18.5&&bmi<25){
            System.out.println("正常");
        }else if (bmi>=25&&bmi<28){
            System.out.println("过重");
        }else if (bmi>=28&&bmi<32){
            System.out.println("肥胖");
        }else {
            System.out.println("非常肥胖");
        }
    }
}
