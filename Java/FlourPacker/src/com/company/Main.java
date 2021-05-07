package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(canPack(0,5,4));
        //System.out.println(getLargestPrime(45));
        printSquareStar(2);
    }

    //24 Flour Pack Problem
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( bigCount<0 || smallCount<0 || goal<0) return false;
        if(bigCount ==0) return smallCount>= goal;
        if(bigCount*5 + smallCount< goal) return false;
        return goal% 5 <= smallCount; //巧妙在于，对5取余可以看出是否满足bigCount是full bag，即使bigCount是0，也能用small填满；
        //the reason goal%5 is, whether the bigCount is zero or not, if bigCount remain of goal is not zero(goal%5!=0)
        //it means we need to use smallCount to fill the rest.
    }

    //25: Largest Prime ****unfinished
    public static int getLargestPrime(int number){
        if(number< 2) return -1;        //这个方法是，i从小到大递增，如果i是number的factor就number/i;
        for(int i=2; i< number; i++){
            if(number %i==0){ //i是factor
                System.out.println("i:" +i);
                number/= i; //拿i去缩小number，然后还是拿当前的i再验证一次新number，即用i--来控制;
                System.out.println("number:"+number);
                //i-- ; //这么做的原因是，有些数同一个factor能被除很多次，如果换了i的话就会错；
            }           //比如45/3 =15, 15是新number，应该再让3去验证15，你只有一直用从小递增的i去除number，才可能拿到最大的factor；
        }
        return number;
    }

    //26: Diagonal Star
    public static void printSquareStar(int number){
        if(number< 5) System.out.println("Invalid Value");
        else{
            int col= number, row= number;
            for(int i=1; i<= row; i++){
                for(int j=1; j<= col; j++){
                    if(i== 1|| i==row) {
                        System.out.print("*");
                    }
                    else if(j== 1|| j== col){
                        System.out.print("*");
                    }
                    else if(j  ==row- i+1){
                      System.out.print("*");
                    }
                    else if(i== j){
                      System.out.print("*");
                    }
                    else System.out.print(" ");
                    if(j== col) System.out.println();
                }
            }
        }
    }

 }
