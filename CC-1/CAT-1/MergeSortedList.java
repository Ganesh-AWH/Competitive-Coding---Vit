import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MergeSortedList {
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
    public static Node mergeList1(Node list1, Node list2){
        //recursion
        if(list1 == null) return list2;

        if(list2 == null) return list1;

        Node head = null;

        if(list1.data < list2.data){
            head = list1;
            head.next = mergeList1(list1.next, list2);
        }else{
            head = list2;
            head.next = mergeList1(list1, list2.next);
        }

        return head;
    }
    public static Node mergeList2(Node list1, Node list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(list1!=null && list2!=null){
            if(list1.data < list2.data){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            temp.next = list1;
        }else{
            temp.next = list2;
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node head1 = null;
        for(int i=0; i<n1; i++){
            int ele = sc.nextInt();
            head1 = insert(head1, ele);
        }

        Node head2 = null;
        for(int i=0; i<n2; i++){
            int ele = sc.nextInt();
            head2 = insert(head2, ele);
        }

        Node ans = mergeList2(head1, head2);

        display(ans);
        sc.close();
    }   
}
