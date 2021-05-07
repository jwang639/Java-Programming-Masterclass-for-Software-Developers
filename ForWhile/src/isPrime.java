public class isPrime {
    public static boolean isprime(int n){
        if(n == 1){
            return false;
        } //其实求质数就是把该数n前面的数i都拿来n/i，如果除尽就不是素数；如果只有自己能除尽那么就是素数；
        for(int i= 2; i<= n; i++){ //注意这里<=的使用，如果只有<,那么下面就不用后面i！=n，因为不会取到和被除数一样的除数；
            if(n % i ==0 && i!= n) { //求primenumber条件，第一个用小于这个数的所有数去取余如果能整除则该数不是，要排除掉自己本身；
                return false;
            }
        }
        return true;
    }
}
