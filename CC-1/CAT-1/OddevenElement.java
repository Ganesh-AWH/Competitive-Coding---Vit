import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class OddevenElement {
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
    public static Node segregateOddEvenElement(Node head){
        if(head == null || head.next == null) return head;

        // odd first even second
        Node odd = null;
        Node oHead = null;
        Node even = null;
        Node eHead = null;
        Node temp = head;

        while(temp!=null){
            // data is odd
            if(temp.data% 2 == 1){
                if(odd == null){
                    odd = temp;
                    oHead = temp;
                }else{
                    odd.next = temp;
                    odd = odd.next;
                }
            }
            // data is even
            else{
                if(even == null){
                    even = temp;
                    eHead = temp;
                }else{
                    even.next = temp;
                    even = even.next;
                }
            }
            temp = temp.next;
        }
        odd.next = eHead;
        even.next = null;
        return oHead;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        Node ans = segregateOddEvenElement(head);
        display(ans);
        sc.close();
    }
}
