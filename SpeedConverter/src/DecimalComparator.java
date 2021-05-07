public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int Num1= (int)(number1* 1000);
        int Num2= (int)(number2* 1000);
       // System.out.println(Num1);
       // System.out.println(Num2);
        return Num1 == Num2;
    }
}