import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        String ans = remove(str, k);
        System.out.println(ans);
    }
    public static String remove(String str, int k){
        char []arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            if(stack.isEmpty() && c != '0'){
                stack.push(c);
                continue;
            }
            while(!stack.isEmpty() && k>0 && stack.peek()>c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k!=0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for(Character c: stack){
            if(c == '0' && sb.length() == 0) continue;
            else sb.append(c);
        }
        return sb.length() == 0? "0": sb.toString();
    }
}
