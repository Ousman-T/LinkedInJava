import java.text.Format;
import java.text.NumberFormat;

public class SalaryCalculator {
    public static double calculator(int hoursPerWeek, double paidPerHour, int vacayDays){
        if(hoursPerWeek < 0){
            return -1;
        }

        if(hoursPerWeek < 0){
            return -1;
        }
        double paidPerWeek = hoursPerWeek * paidPerHour;
        double unpaidTime = vacayDays * paidPerHour * 8;
        return (paidPerWeek * 52) - unpaidTime;
    }
    public static void main(String[] args){
        double salary = calculator(40, 15, 8);
        System.out.println(salary);
    }
}
