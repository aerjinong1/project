public class S2 {
    private static S2 instance;

    private S2() {
    }

    public static synchronized S2 getInstance() {
        if (instance == null) {
            instance = new S2();
        }
        return instance;
    }
}
