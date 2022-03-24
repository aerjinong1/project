public class InterFaceTest {

    public static void main(String[] args) {
        Car toyota=new Toyota();
        toyota.run();
        toyota.abc();
    }
}


interface Car {
    void run();
    String getName();
    default void abc(){
        System.out.println("abc");
    }
}


interface House{
    void cook();
    void shower();
}


class Toyota implements Car{

    @Override
    public void run() {
        System.out.println("toyota.run");
    }

    @Override
    public String getName() {
        return "toyota";
    }
}
