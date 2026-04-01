import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean res = findElement(arr, n, key);
        System.out.println(res);
        sc.close();
    }
    public static boolean findElement(int []arr, int n, int key){
        int step = (int)Math.sqrt(n);
        int prev = 0;

        while(prev<n && arr[Math.min(step, n)-1] < key){
            prev = step;
            step = step + ((int)Math.sqrt(n));

            if(prev>=n) return false;
        }

        for(int i=prev; i< Math.min(step, n); i++){
            if(arr[i] == key) return true;
        }

        return false;
    }
}
