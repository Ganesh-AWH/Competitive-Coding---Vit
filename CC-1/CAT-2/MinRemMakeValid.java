import java.util.Scanner;

public class MinRemMakeValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = findAns(str);
        System.out.println(ans);
    }
    public static String findAns(String str){
        char []arr = str.toCharArray();
        int openParanthesis = 0;
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            if(c == '('){
                openParanthesis++;
            }else if(c == ')'){
                if(openParanthesis == 0){
                    arr[i] = '*';
                }else{
                    openParanthesis--;
                }
            }
        }

        for(int i=arr.length-1; i>=0; i--){
            char c = arr[i];
            if(openParanthesis>0 && c == '('){
                arr[i] = '*';
                openParanthesis--;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c:arr){
            if(c!='*')
                sb.append(c);
        }
        return sb.toString();
    }
    
}
