package zhumu_3;

public class demo01 {
    private Object Person2;

    public class Person2{
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        public void dis(){
            System.out.println("成员内部类:"+this.id);
        }
    }
    public static class Person3{
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        public void dis(){
            System.out.println("静态内部类:"+this.id);
        }
    }
    interface Iops {
        int add(int a,int b);
    }

        public static void main(String[] args) {
        Iops ops = new Iops() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
            System.out.println(ops.add(3,4));
            Iops ops2 = new Iops() {
                @Override
                public int add(int a, int b) {
                    return a-b;
                }
            };
            System.out.println(ops2.add(4,3));
//
//        class Person{
//            private int id;
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//            public void dis(){
//                System.out.println("内部类:"+this.id);
//            }
//        }
        demo01.Person2 p2 = new demo01().new Person2();
        p2.setId(2);
        p2.dis();
        demo01.Person3 p3 = new demo01.Person3();
        p3.setId(4);
        p3.dis();
    }
}
