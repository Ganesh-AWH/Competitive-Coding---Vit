import java.util.Scanner;
//used to find no of coprimes
public class EuilerPhi {
    public static void main(String[] args) {
        // to find no of coprimes upto range of n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = euilerPhiAlgo(n);
        System.out.println(res);

        sc.close();
    }    
    public static int euilerPhiAlgo(int n){
        int res = n; 

        int sqrt = (int)Math.sqrt(n);
        for(int p=2; p<=sqrt; p++){
            if(n%p == 0){
                //p is prime factor if above condition satisfies
                while(n%p == 0){
                    n/=p;
                }
                res = res - res/p;
            }
        }
        
        if(n>1) res = res - res/n;

        return res;

    }
}




