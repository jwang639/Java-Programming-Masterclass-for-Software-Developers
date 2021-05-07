package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(sumDigits(123));
        //System.out.println(isPalindrome(121));
        //System.out.println(sumFirstAndLastDigit(2123));
        //System.out.println(getEvenDigitSum(252));
        //System.out.println(hasSharedDigit(12, 13));
        //System.out.println(hasSameLastDigit(41,22,71));
        //System.out.println(getGreatestCommonDivisor(12,30));
        //printFactors(6);
        //System.out.println(isPerfectNumber(6));
        //System.out.println(reverse(123));
        //System.out.println(numberToWords(100));
        //System.out.println(reverse(-2));
    }

    //sumDigits Coding Exercise//
    public static int sumDigits(int number){
        if(number<10 ||number<0) return -1;
        int sum=0;
        while (number!=0){
            sum+= number % 10;
            number/= 10;
        }
        return sum;
    }

    //15: isPalindrome Coding Exercise//
    public static boolean isPalindrome(int number){
        if(number< 0) number = -number;
        int original= number, tmp=0;
        while(number!=0){
            tmp = tmp * 10 +number % 10;
            number/= 10;
        }
        return tmp == original;
    }

    //16: First and Last Digit sum//
    //做法就是先number%10拿到最后一位数字；然后通过一直除以10直到除剩下的数小于10，这时拿到第一位；//
    public static int sumFirstAndLastDigit(int number){
        if(number<0) return -1;
        if(number<10) return number*2;
        int lastdigit= number% 10;
        while(number >9){
            number/= 10;
        }
        return lastdigit+ number;
    }

    //17: Even Digit Sum
    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        int sum=0;
        while(number!=0){
            int digit= number % 10;
            if(digit % 2==0) {
                sum+= digit;
            }
            number/= 10;
        }
        return sum;
    }

    //18: Shared Digit//
    //这细节小多，总的来说拿第一个数字的digit去扫描第二个数字的digit
    public static boolean hasSharedDigit(int FirstNumber, int SecondNumber){
        if(FirstNumber<10 || FirstNumber>99 || SecondNumber<10 || SecondNumber>99) return false;
        int Tmp= SecondNumber; //保证内层secondnumber每次循环都是原来的数，因为第二个数会变；
        while(FirstNumber> 0){
            int digitFirstNumber;
            if(FirstNumber>9) {
                digitFirstNumber= FirstNumber % 10;
            }
            else {
                digitFirstNumber= FirstNumber;
            }
            System.out.println("第一个数的对比数字："+digitFirstNumber);
                SecondNumber= Tmp;
                while (SecondNumber> 0){
                    int digitSecondNumber;

                    if(SecondNumber>10){
                        digitSecondNumber= SecondNumber% 10;
                    }
                    else{
                        digitSecondNumber= SecondNumber;
                    }
                    System.out.println("第二个数的对比数字："+digitSecondNumber);
                    if(digitFirstNumber == digitSecondNumber) {
                        return true;
                    }
                    SecondNumber/= 10;
                }
            FirstNumber/= 10;
        }
        return false;
    }

    //19: Last Digit Checker//
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(isValid(number1) && isValid(number2) && isValid(number3)){
            int right1= number1 % 10, right2= number2 % 10, right3= number3 % 10;
            if(right1== right2|| right1==right3 || right2== right3) return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number<10 || number> 1000) return false;
        else return true;
    }

    //20: GreatestCommonDivisor//
    public static int getGreatestCommonDivisor(int first, int second){
        if(first< 10 || second< 10) return -1;
        int Min= Math.min(first, second);
        int Max= Math.max(first, second);
        int Divisor= 1;
        for(int i=1; i<=Min; i++){
            if(Min% i == 0){
                if(Max %i ==0) {
                    Divisor = i;
                }
            }
        }
        return Divisor;
    }

    //21: All Factor//
    public static void printFactors(int number){
        if(number< 1) System.out.println("Invalid Value");
        String ans="";
        for(int i=1; i<=number; i++){
            if(number% i==0){
                ans= ans+ " " + String.valueOf(i);
            }
        }
        System.out.println(ans);
    }

    //22: Perfect Number//
    public static boolean isPerfectNumber(int number){
        if(number < 1) return false;
        int sum= 0;
        for(int i= 1; i< number; i++){
            if(number% i== 0){
                //System.out.println(i);
                sum+= i;
            }
        }
        //System.out.println(sum);
        return sum== number? true:false;
    }

    //23: Number To Words//
    public static void numberToWords(int number){
        if(number< 0) System.out.println("Invalid Value");
        int count= getDigitCount(number);
        number= reverse(number);
        String str="";
        int tmp= 0;
        while(number> 0){
            tmp= number% 10;
            switch (tmp){
                case 1: str= str+"One "; break;
                case 2: str= str+"Two "; break;
                case 3: str= str+"Three "; break;
                case 4: str= str+ "Four "; break;
                case 5: str= str+ "Five "; break;
                case 6: str= str+ "Six "; break;
                case 7: str= str+ "Seven "; break;
                case 8: str= str+ "Eight "; break;
                case 9: str= str+ "Nine "; break;
                case 0: str= str+ "Zero "; break;
                default: str= str+"Zero"; break;
            }
            number/= 10;
            count--;
        }
        if(count!= 0){
            for(int i=0; i<count; i++){
                str+= "Zero ";
            }
        }
        System.out.println(str);

    }

    public static int reverse(int number){
        int flag= 1;
        if(number< 0) {
            number= -number;
            flag= -1;
        }
        int ans= 0;
        while(number> 0){
            ans= ans* 10+ number% 10;
            number/= 10;
        }
        return ans* flag;
    }

    public static int getDigitCount(int number){
        if(number< 0) return -1;
        if(number== 0) return 1;
        int count= 0;
        while(number >0){
            number/= 10;
            count++;
        }
        return count;
    }
}
