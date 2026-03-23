import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class RemoveNthNodeEnd {
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
    public static Node removeNode(Node head, int k){
        if(head == null) return head;

        Node temp = head;
        for(int i=0; i<k; i++){
            temp = temp.next;
        }
        if(temp == null) return head.next;

        Node fast = temp;
        Node slow = head;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
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
        int k = sc.nextInt();
        head = removeNode(head, k);
        display(head);
        sc.close();
    }
}


// You can use fast and slow pointer for one traversal
