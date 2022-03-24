package homework;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int num1= 1;num1<10;num1++){
            for (int num2 = 1; num2 <= num1; num2++) {
                System.out.print(num1+"*"+num2+"="+num1*num2+"\t");
            }
            System.out.println("");
        }
    }
}
