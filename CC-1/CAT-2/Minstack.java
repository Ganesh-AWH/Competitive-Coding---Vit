import java.util.Stack;

class Pair{
    int val;
    int min;
    //constructor
    Pair(int val, int min){
        this.val = val;
        this.min = min;
    }
}
class Minstack{
    Stack<Pair> stack;
    Minstack(){
        stack = new Stack<>();
    }

    //push
    public void push(int val){
        if(stack.isEmpty()){
            Pair p = new Pair(val, val);
            stack.push(p);
        }
        else{
            Pair top = stack.peek();
            int min = Integer.min(val, top.min);
            Pair p = new Pair(val, min);
            stack.push(p);
        }
    }

    //pop
    public void pop(){
        stack.pop();
    }

    public int top(){
        Pair p = stack.peek();
        return p.val;
    }
    
    public int getMin(){
        Pair p = stack.peek();
        return p.min;
    }
}
class Main{
    public static void main(String[] args) {
        Minstack mstack = new Minstack();
        mstack.push(-2);
        mstack.push(0);
        mstack.push(-3);
        System.out.println(mstack.getMin());
        mstack.pop();
        System.out.println(mstack.top());
        System.out.println(mstack.getMin());

    }
}