package zhumu_2;

class MyException extends Exception{
    public MyException(String str){
    super(str);
    }
}
public class demo1 {
    public static int xxx(int a)throws MyException{
        if (a==0){
            throw new MyException("自定义错误");
        }
        return 100;
    }
    public static void main(String[] args) {
        int c = 0;
        try {
            c = demo1.xxx(0);
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("aaaa");
    }

}