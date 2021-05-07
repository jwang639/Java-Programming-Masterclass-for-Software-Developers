public class MethodOverLoading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || inches<0 || inches>12) {
            System.out.println("Invalid feet or inches ");
            return -1;
        }
        else{
            double centimeters= (feet*12 + inches) * (2.54);
            System.out.println(feet+ " feet, "+ inches+ " inches = " + centimeters + " cm");
            return centimeters;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0) return -1;
        else {
            double feet= (int) (inches / 12);
            double remainer= (int) (inches %12);
            System.out.println(inches + " inches is equal to "+  feet+ " feet and " + remainer+ " inches");
            return calcFeetAndInchesToCentimeters(feet, remainer);
        }
    }
}
