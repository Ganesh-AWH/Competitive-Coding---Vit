import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> res = findLeadersInArray(arr, n);
        for(int i: res){
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static List<Integer> findLeadersInArray(int []arr, int n){
        List<Integer> res = new ArrayList<>();
        int max = arr[n-1];
        res.add(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                res.add(max);
            }
        }

        Collections.reverse(res);
        return res;
    }
}
