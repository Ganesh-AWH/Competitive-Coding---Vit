import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class PartitionList{
    public static Node insert(Node head, int data){
        Node newNode = new Node(data);
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
    }
    public static Node partition(Node head, int x){
        Node leftDummy = new Node(-1);
        Node rightDummy = new Node(-1);

        Node left = leftDummy;
        Node right = rightDummy;

        Node curr = head;

        while(curr!=null){
            if(curr.data < x){
                left.next = curr;
                left = left.next;
            }else{
                right.next = curr;
                right = right.next;
            }
            curr = curr.next;
        }

        left.next = rightDummy.next;
        right.next = null;
        return leftDummy.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0; i<n; i++){
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        int x = sc.nextInt();
        Node newhead = partition(head, x);
        display(newhead);
        sc.close();
    }
}