import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
public class ReverseList {
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
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node prev = null;
        Node curr = head; 
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = reverse(head);
        display(head);
        sc.close();
    }
}
