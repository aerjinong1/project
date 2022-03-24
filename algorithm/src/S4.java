public class S4 {
    private volatile static S4 instance;

    private S4() {
    }

    public static S4 getInstance() {
        if (instance == null) {
            synchronized (S4.class) {
                if (instance == null) {
                    instance = new S4();
                }
            }
        }
        return instance;
    }
}
