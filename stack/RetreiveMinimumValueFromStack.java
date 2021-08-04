package Stack;

import java.util.Stack;

public class StackMinValue {
    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();

    public void push(int element){
        stack.push(element);
        if(minStack.isEmpty()){
            minStack.push(element);
        }else if(element<minStack.peek()){
            minStack.push(element);
        }
    }

    public int pop(){
        if (stack.isEmpty())
            throw new IllegalStateException();
        int topElement=stack.pop();
        if(minStack.peek()==topElement){
            minStack.pop();
        }
        return topElement;
    }

    public int top() {
        return stack.peek();
    }


    public int min(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        StackMinValue minStack = new StackMinValue();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.min()); // return -2
    }
}
