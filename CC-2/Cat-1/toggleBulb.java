import java.util.Arrays;
import java.util.Scanner;

public class toggleBulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int openDoors = optimalSolution(n);
        System.out.println(openDoors +" "+(n-openDoors));
        sc.close();
    }
    public static int findOpenDoors(int n){
        boolean []b = new boolean[n+1];

        Arrays.fill(b, true);

        for(int i=2; i<=n; i++){
            for(int j=i; j<=n; j+=i){
                b[j] = b[j] == false ? true : false;
            }
        }

        int open = 0;
        for(int i=1; i<=n; i++){
            if(b[i]) open++;
        }

        return open;
    }
    public static int optimalSolution(int n){
        return (int)Math.sqrt(n);
    }
}







