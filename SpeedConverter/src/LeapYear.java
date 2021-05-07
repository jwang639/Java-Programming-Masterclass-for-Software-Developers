public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year<1||year>9999) return false;
        else{
           if(year%4==0){ //step1
               if(year%100==0){ //step2
                   if(year%400==0)  return true; //step3 to step4
                   else return false; // step5
               }
               else return true;
           }
           else return false;  //go step5
        }
    }
}
