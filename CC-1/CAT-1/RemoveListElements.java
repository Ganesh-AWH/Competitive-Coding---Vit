import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class RemoveListElements{
    public static Node insert(Node head, int ele){
        if(head == null){
            head = new Node(ele);
            return head;
        }

        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = new Node(ele);
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
    public static Node removeElement(Node head, int val){
        
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            if(curr.data == val){

                //if the value is in header then just move header
                if(curr == head){
                    head = head.next;
                }

                //have next node before updating 
                Node nextNode = curr.next;
                if(prev != null){
                    prev.next = nextNode;
                }
                curr = nextNode;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String []args){
        Node head = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        int val = sc.nextInt();
        head = removeElement(head, val);
        display(head);
        sc.close();
    }
}