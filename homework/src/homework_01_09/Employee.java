package homework_01_09;

public class Employee implements Iemployee{
    private int basespay = 0;//正常收入
    private int bonus = 0;    //奖金
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

    @Override
    public int counttex() {
        return  (int) (basespay*0.1+bonus*0.2);

    }
}
