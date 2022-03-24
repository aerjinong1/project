public class S1 {
    private static S1 instance=new S1();

    private S1(){}

    public static S1 getInstance(){
        return instance;
    }
}
