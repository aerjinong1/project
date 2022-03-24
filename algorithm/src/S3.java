public class S3 {
    private static class S3Inner{
        private static final S3 instance=new S3();
    }

    private S3(){}

    public static S3 getInstance(){
        return S3Inner.instance;
    }
}
