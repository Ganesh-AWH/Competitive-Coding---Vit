import java.util.Scanner;

public class MajorityElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int res = findMajorityElement(arr);
        System.out.println(res);
        sc.close();
    }
    public static int findMajorityElement(int []arr){
        //booyer moores voting algorithm
        int voter = -1;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(voter == arr[i]){
                count++;
            }
            else if(count == 0){
                voter = arr[i];
            }

            else{
                count--;
            }
        }

        return voter;
    }
}