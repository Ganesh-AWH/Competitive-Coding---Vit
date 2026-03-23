import java.util.Scanner;
public class DeleteMidNode {
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
    public static Node deleteMid(Node head){
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        } 
        prev.next = slow.next;
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

        Node ans = deleteMid(head);
        display(ans);
        sc.close();
    }
}
