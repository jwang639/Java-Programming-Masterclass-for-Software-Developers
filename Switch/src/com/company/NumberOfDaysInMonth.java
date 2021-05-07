package com.company;
public class NumberOfDaysInMonth {
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
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12) return -1;
        if(year < 1 || year> 9999) return -1;
        if(isLeapYear(year)&&month==2){
            return 28;
        }
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 2:
                return 28;

            case 4: case 6:  case 9:    case 11:
                return 30;

            default:
                return -1;

        }
    }
}