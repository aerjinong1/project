public class AbstractTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.name = "aa";
        tiger.run();
    }
}

abstract class Animal {
    protected String name;
    protected String color;

    public abstract void run();
}

class Tiger extends Animal {

    @Override
    public void run() {
        System.out.println(super.name + "tiger.run");
    }
}
