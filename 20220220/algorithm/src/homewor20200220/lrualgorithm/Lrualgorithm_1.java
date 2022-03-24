//package homewor20200220.lrualgorithm;
//



//这还没完成





//public class Lrualgorithm_1 {//有点乱，回来在想
//    //阉割，完全版
//    /*
//    可以对链表长度做规范，并添加新的内容但是只能对一个数进行操作，无法对结构体进行整理
//    * */
//
//    public class sNode {
//        private int date;
//        private sNode front;
//        private final sNode headnode = null;
//        private sNode next;
//        public int getDate() {
//            return date;
//        }
//
//        public void setDate(int date) {
//            this.date = date;
//        }
//
//        public sNode getFront() {
//            return front;
//        }
//
//        public void setFront(sNode front) {
//            this.front = front;
//        }
//
//        public sNode getNext() {
//            return next;
//        }
//
//        public void setNext(sNode next) {
//            this.next = next;
//        }
//
//
//
//        public void usenode(int date) {
//            boolean exist = ifexist(date);
//            if (exist) {//判断节点是否存在
//                deletNode(date);//删除节点
//                insertNode(date);
//            }
//        }
//
//        public boolean ifexist(int date) {//判断节点是否存在
//            sNode temp = headnode;
//            while (temp.getNext() != null) {
//                if (date == temp.getDate()) {
//                    return true;
//                }
//                temp = temp.next;
//            }
//            return false;
//        }
//
//        public void insertNode(Object date) {//插入节点
//            date. = headnode.next;
//            headnode.next.front = date;
//            date.front = headnode;
//            headnode.next = date;
//        }
//    }
//}
