
package stack;

import java.util.LinkedList;
import java.util.Queue;


public class StackIUsingQueue {
    Queue<Integer> queue=new LinkedList<>();
    void push(int element){
        queue.add(element);
        for(int i=0;i<queue.size();i++){
            int x=queue.remove();
            queue.add(x);
            
        }
    }
    int pop(){
        if(queue.isEmpty()){
            System.out.println("Print Underflow");
            return -2;
        }
        int y=queue.remove();
        return y;
        
    }
    int top(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.peek();
    }
    boolean isEmpty(){
        return queue.isEmpty();
    }
    public static void main(String[] args) {
        StackIUsingQueue s = new StackIUsingQueue(); 
        s.push(10); 
        s.push(20); 
        System.out.println("Top element :" + s.top()); 
        s.pop(); 
        s.push(30); 
        s.pop(); 
        System.out.println("Top element :" + s.top());   
    }
}
