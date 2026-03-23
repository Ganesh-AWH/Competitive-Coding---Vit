import java.util.Scanner;

public class findNthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = findNthdigit(n);
        System.out.println(res);
        sc.close();
    }
    public static int findNthdigit(int n){
        int digitLength = 1;
        int count = 9;
        int start = 1;

        while(n > digitLength * count){
            n -= digitLength * count;

            digitLength++;
            count *= 10;
            start *= 10;
        }
        //extracting exact number 
        int num = start + (n-1) / digitLength;
        String strNum = Integer.toString(num);
        System.out.printf("exact number: %s\n", strNum);
        return strNum.charAt((n-1)%digitLength) - '0';
    }
}




