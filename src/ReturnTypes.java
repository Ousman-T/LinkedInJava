public class ReturnTypes {

    public static double calculateMealPrice(double listedMealPrice,double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main(String[] args){
        double groupTotalPrice = calculateMealPrice(100, .2, .08);
        System.out.println(groupTotalPrice);

    }
}
