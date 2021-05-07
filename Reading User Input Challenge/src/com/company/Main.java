package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count= 1, sum= 0;
        Scanner scanner= new Scanner(System.in);
        while(count<= 10){
            System.out.println("Enter number #" +count+":");
            boolean isAnInt= scanner.hasNextInt();
            if(isAnInt){
                int number= scanner.nextInt();
                sum+= number;
                count++;
            }
            else {
                System.out.println("Invalid Input");
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("The sum of ten number is: "+ sum);

    }
}
