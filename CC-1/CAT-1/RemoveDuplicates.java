import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class RemoveDuplicates {
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
    public static Node removeDuplicates(Node head){
        Node dummyNode = new Node(-1);
        dummyNode.next = head;
        Node prev = dummyNode;
        Node curr = head;
        while(curr!=null){
            if(curr.next!=null && curr.data == curr.next.data){
                int duplicate = curr.data;
                while(curr!=null && curr.data == duplicate){
                    curr = curr.next;
                }
                prev.next = curr;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
        sc.close();
    }    
}
