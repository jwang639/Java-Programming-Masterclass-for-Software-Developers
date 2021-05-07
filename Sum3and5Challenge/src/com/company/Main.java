package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count=0;
        int sum=0;
        for(int i =1; i<=1000; i++){
            if(i%3==0 && i%5==0){
                count++;
                System.out.println("Found number: "+i);
                sum+= i;
                if(count==5) break;;
            }
        }
        System.out.println("Sum = "+sum);
        SumOddRange.sumOdd(10, 50);
    }
}
