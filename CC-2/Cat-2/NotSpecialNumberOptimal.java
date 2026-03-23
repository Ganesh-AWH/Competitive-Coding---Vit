import java.util.Arrays;
import java.util.Scanner;

public class NotSpecialNumberOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int res = findCountOfNotSpecial(l, r);
        System.out.println(res);
        sc.close();
    }
    public static int findCountOfNotSpecial(int l, int r){
        int specialCount = 0;
        
        int start = (int)Math.ceil(Math.sqrt(l));
        int end = (int)Math.floor(Math.sqrt(r));

        
        boolean isPrime[] = seiveEratosethnes(end);

        for(int i=start; i<=end; i++){
            if(isPrime[i]){
                specialCount++;
            }
        }
        //to find not specialCount
        return (r - l + 1) - specialCount;
    }
    public static boolean[] seiveEratosethnes(int n){
        
        boolean []isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        int sqrt = (int)Math.sqrt(n);

        for(int i=2; i<=sqrt; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}
