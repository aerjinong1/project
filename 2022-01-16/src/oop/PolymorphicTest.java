package oop;

//针对某个类型的方法调用，其真正执行的方法取决于运行时实际类型的方法
public class PolymorphicTest {
    public static void main(String[] args) {
        Person p = new Teacher();
        p.run(); // 应该打印Person.run还是Teacher.run?

        Salary s1 = new Salary(7500);
        System.out.println(s1 instanceof Income);

        //向上转型
        Income income=new Salary(1000);

//        Salary s11=new Income(122);


        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        IIncome[] incomes = new IIncome[]{
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));


    }


    public static double totalTax(IIncome... incomes) {
        double total = 0;
        for (IIncome income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}


class Teacher extends Person {


    @Override
    public void run() {
        System.out.println("teacher.run");
    }

    public void runTwice(Person p) {
        p.run();
        p.run();
    }
}

interface IIncome{
    double getTax();
}


class Income implements IIncome{
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}


