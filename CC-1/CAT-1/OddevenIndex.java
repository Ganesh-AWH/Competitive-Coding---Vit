import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class OddevenIndex {
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
    public static Node segregateOddEvenIndex(Node head){
        if(head == null || head.next == null) return head;

        Node odd = head;
        Node even = head.next;
        Node eHead = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            odd = odd.next;            
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = eHead;
        return head;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        Node ans = segregateOddEvenIndex(head);
        display(ans);
        sc.close();
    }
}
