import java.util.*;
public class SeiveEratosethnes{
    public static void main(String[] args) {
        int n = 10;

        boolean []isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[1] = isPrime[0] = false;

        seiveAlgo(isPrime, n);

        for(int i=2; i<=n; i++){
            if(isPrime[i])
                System.out.print(i+ " ");
        }
    }
    public static void seiveAlgo(boolean []isPrime, int n){
        int sqrt = (int)Math.sqrt(n);

        for(int i=2; i<=sqrt; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
}































