import java.util.Scanner;
import java.util.Stack;
class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
public class PalindromeList {
    public static Node insert(Node head, int data){
        if(head == null){
            head = new Node(data);
            return head;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(data);

        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
        }
        System.out.println("null");
    }
    public static boolean isPalindrome(Node head){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(!stack.isEmpty()){
            if(temp.data != stack.pop()) return false;
            temp = temp.next;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        boolean ispal = isPalindrome(head);
        System.out.println(ispal);
        sc.close();
    }
}
