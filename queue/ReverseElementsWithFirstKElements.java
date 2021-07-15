
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseElementsWithFirstKElements {
    public static void reverseElements(Queue<Integer> queue,int k){
        //Create a Stack
        Stack<Integer> stack=new Stack<>();

        if(k<0 || k>queue.size()){
            throw new IllegalArgumentException();
        }
        // Dequeue the first K elements from the queue
        // and push them onto the stack
        for(int i=0;i<k;i++){
            stack.push(queue.remove()); 
              
        }
        // Enqueue the content of the stack at the
        // back of the queue
        while(!stack.isEmpty()){
            queue.add(stack.pop()); 
            
        }
        // Add the remaining items in the queue (items
        // after the first K elements) to the back of the
        // queue and remove them from the beginning of the queue
        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.remove());
            
        }
         
        
    }
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10); 
        queue.add(20); 
        queue.add(30); 
        queue.add(40); 
        queue.add(50); 
        queue.add(60); 
        queue.add(70); 
        queue.add(80); 
        queue.add(90); 
        queue.add(100); 
        reverseElements(queue,5);
             
        
    }
         
}
