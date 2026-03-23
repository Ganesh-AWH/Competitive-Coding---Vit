import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;
    MyStack(){
        queue = new LinkedList<>();
    }

    public void push(int x){
        queue.add(x);
        for(int i=0; i<queue.size()-1; i++){
            int val = queue.remove();
            queue.add(val);
        }
    }

    public int pop(){
        return queue.remove();
    }

    public int top(){
        return queue.peek();
    }
    
    public boolean empty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
