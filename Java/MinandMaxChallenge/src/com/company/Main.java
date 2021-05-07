package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        int MaxNumber= 0, MinNumber= 0, tmp= 0;
        while(true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                tmp= scanner.nextInt();
                if(tmp> MaxNumber) MaxNumber=  tmp;
                else if(tmp< MinNumber) MinNumber= tmp;
            } else {
                System.out.println("The Maximum number is: " + MaxNumber);
                System.out.println("The minimum number is: " + MinNumber);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
