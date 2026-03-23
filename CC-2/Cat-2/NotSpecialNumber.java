import java.util.Scanner;

public class NotSpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int res = findCountOfNotSpecial(l, r);
        System.out.println(res);
        sc.close();
    }
    public static int findCountOfNotSpecial(int l, int r){
        int start = (int)Math.ceil(Math.sqrt(l));
        int end = (int)Math.floor(Math.sqrt(r));

        int specialCount = 0;

        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                specialCount++;
            }
        }
        //to find not specialCount
        return (r - l + 1) - specialCount;
    }
    public static boolean isPrime(int num){
        if(num<2) return false;

        int sqrt = (int)Math.sqrt(num);
        for(int i=2; i<=sqrt; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}

// What is a “Special Number”?
// A number is special if: It has exactly 3 divisors


// A number has exactly 3 divisors only when: number=(prime)2