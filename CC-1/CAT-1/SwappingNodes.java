import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SwappingNodes {
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
    public static Node swapNode(Node head, int k){
        int len = 0;
        Node temp = head;
        //this finds the length of the list
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        Node firstNode = head;
        //find the kth node from first
        for(int i=1; i<k; i++){
            firstNode = firstNode.next;
        }

        //find the kth node from last
        Node secondNode = head;
        for(int i=1; i<len-k+1; i++){
            secondNode = secondNode.next;
        }
        
        //swapping the values
        int t = firstNode.data;
        firstNode.data = secondNode.data;
        secondNode.data = t;
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
        head = swapNode(head, k);
        display(head);
        sc.close();
    }
}
