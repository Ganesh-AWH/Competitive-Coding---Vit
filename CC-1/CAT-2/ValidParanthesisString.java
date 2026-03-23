import java.util.Scanner;

public class ValidParanthesisString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean ans = isValid(str);
        System.out.println(ans);
    }
    public static boolean isValid(String str){
        char []arr  = str.toCharArray();
        int leftMax = 0;
        int leftMin = 0;
        for(char c: arr){
            if(c == '('){
                leftMax++;
                leftMin++;
            }else if(c == ')'){
                leftMax--;
                leftMin--;
            }else{
                leftMax++;
                leftMin--;
            }

            if(leftMax<0) return false;
            if(leftMin<0) leftMin = 0;
        }
        return leftMin == 0;
    }
}
