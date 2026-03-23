import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class RotateList {
    public static Node insert(Node head, int ele){
        Node newNode = new Node(ele);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node rotate(Node head, int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }
        //first find the length of list
        int length = 1;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        k = k % length;
        if(k == 0) return head;
        //find the new head that should be pointed before it
        Node curr = head;
        for(int i=1; i<length-k; i++){
            curr = curr.next;
        }
        Node newHead = curr.next;
        curr.next = null;
        tail.next = head;
        return newHead;
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
        head = rotate(head, k);
        display(head);
        sc.close();
    }
}
