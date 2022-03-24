package core;

/**
 * enum和class没有任何区别：
 * 1.定义的enum类型总是继承自java.lang.Enum，且无法被继承；
 * 2.只能定义出enum的实例，而无法通过new操作符创建enum的实例；
 * 3.定义的每个实例都是引用类型的唯一实例；
 * 4.可以将enum类型用于switch语句。
 */
public class EnumTest {
    public static void main(String[] args) {
        int day = 8;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            // TODO: work at home
        }

        if (day == 6 || day == 7) {
            // TODO:
        }

//        day=1;
//        if (day == WeekDay.SUN) { // Compile error: bad operand types for binary operator '=='
//        }
        WeekDayEnum x = WeekDayEnum.WED;
        if (x == WeekDayEnum.FRI) { // ok!
        }
        if (x.equals(WeekDayEnum.SUN)) { // ok, but more code!
        }
        System.out.println(x.name());
        System.out.println(x.ordinal());
        System.out.println(x.dayValue);
        System.out.println(x.chineseValue);

//        switch (x) {
//            case SAT: {
//                break;
//            }
//
//            case FRI: {
//                break;
//            }
//
//
//        }
    }
}


class Weekday {
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;
}

//final class WeekDayEnum extends Enum{
//
//}

enum WeekDayEnum {
    SUN(0,"星期日"),   //public static final WeekDayEnum SUN;
    MON(1,"星期一"),
    TUE(2,"星期二"),
    WED(3,"星期三"),
    THU(4,"星期四"),
    FRI(5,"星期五"),
    SAT(6,"星期六");

    //属性
    public final int dayValue;
    public final String chineseValue;

    //
    private WeekDayEnum(int dayValue, String chineseValue) {
        this.dayValue = dayValue;
        this.chineseValue = chineseValue;
    }

}
