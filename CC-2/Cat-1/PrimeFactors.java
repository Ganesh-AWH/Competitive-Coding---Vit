import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeFactors(n);
        sc.close();
    }
    public static void primeFactors(int n){
        while(n%2 == 0){
            System.out.print(2+" ");
            n/=2;
        }
    
        int sqrt = (int)Math.sqrt(n);
        for(int i=3; i<=sqrt; i+=2){
            while(n%i ==0){
                System.out.print(i+" ");
                n/=i;
            }
        }

        if(n>1) System.out.print(n);
    }
}






