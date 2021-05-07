package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name= scanner.nextLine();    //如果用scanner.next()就会出错；
        System.out.println("Your name is: " + name);

        System.out.println("Enter your birth year");
        int yearOfBirth= scanner.nextInt(); //用了nextInt记得跟一个nextLine();
        scanner.nextLine(); //具体的就是nextInt不识别换行符，会直接停止scan？不太清楚
        System.out.println("Your Birth year is " + yearOfBirth);

    }
}
