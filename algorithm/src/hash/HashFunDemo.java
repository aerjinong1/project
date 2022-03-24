package hash;

public class HashFunDemo {

    //我们有89名运动员，用一个89个位置的数组来存储相关信息
    static int hash(String sportNum){
        String lastTwoChar = sportNum.substring(sportNum.length() - 2, sportNum.length());
        int sportNumber = Integer.parseInt(lastTwoChar);
        return sportNumber-1;
    }

    public static void main(String[] args) {
        System.out.println(hash("000001"));
        System.out.println(hash("000002"));
    }

}
