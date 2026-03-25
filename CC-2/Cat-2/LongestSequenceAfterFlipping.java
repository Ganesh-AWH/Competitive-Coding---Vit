import java.util.Scanner;

public class LongestSequenceAfterFlipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        int res = findMaxAfterFlipping2(binary);
        System.out.println(res);
        sc.close();
    }
    //naive approach TC - O(n*n)
    public static int findMaxAfterFlipping1(String binary){
        int max = -1;
        int left = 0;
        int right = 0;
        int n = binary.length();

        for(int i=0; i<n; i++){
            if(binary.charAt(i) == '0'){
                //move left pointer and count the consecutive ones
                left = i-1;
                right = i+1;
                int count = 1;
                while(left>=0 && binary.charAt(left) == '1'){
                    count++;
                    left--;
                }

                while(right<n && binary.charAt(right) == '1'){
                    count++;
                    right++;
                }

                max = Integer.max(max, count);
            }
        }

        return max == -1 ? n : max;
    }
    //optimal solution TC - O(N)
    public static int findMaxAfterFlipping2(String binary){
        int count = 0;
        int left = 0;
        int n = binary.length();
        int max = Integer.MIN_VALUE;


        for(int right=0; right<n; right++){
            if(binary.charAt(right) == '0'){
                count++;
            }
            
            while(count>1){
                if(binary.charAt(left) == '0'){
                    count--;
                }
                left++;
            }

            int len = right - left + 1;
            max = Integer.max(max, len);
        }

        return max;
    }
}
