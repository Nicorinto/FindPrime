import java.util.Arrays;
import java.util.Random;

public class PrimeNum {
    public static void main(String[] args) {
        int[] ary = new int[25];
        Random rnd = new Random(-1);

        for (int i = 0; i < ary.length; i++){
            ary[i] = rnd.nextInt(101);
        }
        System.out.println("Arrays numbers: " + Arrays.toString(ary));

        for (int prime: ary) {
            if(isPrime(prime)){
                System.out.println("prime: " + prime);
            }

        }
    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
