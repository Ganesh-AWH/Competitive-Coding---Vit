import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class AddTwoNumber {
    //add elements to linked list
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
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node add(Node list1, Node list2){
        int sum = 0;
        int carry = 0;
        Node ans = new Node(-1);
        Node curr = ans;
        Node temp1 = list1;
        Node temp2 = list2;

        while(temp1!=null || temp2!=null){
            int total = carry;

            if(temp1!=null){
                total += temp1.data;
                temp1 = temp1.next;
            }
            if(temp2!=null){
                total += temp2.data;
                temp2 = temp2.next;
            }
            sum = total % 10;
            carry = total/10;
            curr.next = new Node(sum);
            curr = curr.next;
        }
        
        if(carry!=0){
            curr.next = new Node(carry);
        }
        
        return ans.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node list1 = null;
        for(int i=0; i<x; i++){
            int ele = sc.nextInt();
            list1 = insert(list1, ele);
        }

        int y = sc.nextInt();
        Node list2 = null;
        for(int i=0; i<y; i++){
            int ele = sc.nextInt();
            list2 = insert(list2, ele);
        }

        Node ans = add(list1, list2);
        display(ans);
    }
}
