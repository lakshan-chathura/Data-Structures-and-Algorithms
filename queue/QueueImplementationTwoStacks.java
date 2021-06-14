
package queue;

//Method 1

import java.util.Stack;

// By making enqueue opearton costly.
class Queue{
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();
    
    static void enqueue(int x){
        
        stack1.push(x);
    }
    static int dequeue(){
        
        if(stack1.isEmpty() && stack2.isEmpty())
            throw new IllegalStateException("Stack is Empty!!");
        
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                  stack2.push(stack1.pop());
            }
              
        }
        return stack2.pop();
    }

}

public class QueueImplementationTwoStacks
{

    public static void main(String[] args) {
        
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);
  
        System.out.println(Queue.dequeue());
        System.out.println(Queue.dequeue());
        System.out.println(Queue.dequeue());
    }
}


