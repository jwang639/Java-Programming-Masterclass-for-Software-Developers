public class Main {
    public static void main(String[] args) {
        ;
        int count=0;
        for(int i=1; i<10; i++){
            if(isPrime.isprime(i)){
                System.out.println("Number "+ i + " is prime number");
                count++;
                if(count==3) break;
            }
        }
    }
}
