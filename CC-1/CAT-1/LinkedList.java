import java.util.Scanner;

class Node{
    int data;
    Node next;

    //constructor
    Node(int data){
        this.data = data;
        this.next = null;
    }

}
public class LinkedList{
    public static Node insertAtBegin(Node head, int data){
        if(head == null){
            head = new Node(data);
            return head;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        while(true){
            int data = sc.nextInt();
            if(data == -1){
                break;
            }
            head = insertAtBegin(head, data);
        }
        display(head);
        sc.close();
    }
}