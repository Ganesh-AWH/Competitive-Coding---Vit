import java.util.Scanner;

public class SherlockDivisor {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        //find no of divisors that are divisible by 2
        int res = findCount(n);
        System.out.println(res);
        sc.close();
    }
    public static int findCount(int n){
        int sqrt = (int)Math.sqrt(n);
        int count = 0;
        for(int i=1; i<=sqrt; i++){
            if(n%i == 0){
                int d1 = i;
                int d2 = n/i;

                if(d1%2 == 0) count++;
                if(d2!=d1 && d2%2 == 0) count++;
            }
        }

        return count;
    }
}





























