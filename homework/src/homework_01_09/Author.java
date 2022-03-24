package homework_01_09;

public class Author implements Iauthor{
    private int basespay = 0;//正常收入
    private int bonus = 0;    //奖金
    private int royalties;   //稿费
    Author (int basespay, int bonus, int royalties){
        this.basespay = basespay;
        this.bonus = bonus;
        this.royalties = royalties;
    }
    @Override
    public int counttex() {
        return  (int) (basespay*0.1+bonus*0.2+royalties);
    }


    public int getBasespay() {
        return basespay;
    }

    public void setBasespay(int basespay) {
        this.basespay = basespay;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getRoyalties() {
        return royalties;
    }

    public void setRoyalties(int royalties) {
        this.royalties = royalties;
    }
}
