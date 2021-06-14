
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseElementsWithFirstKElements {
    public static void reverseElements(Queue<Integer> queue,int element){
        Stack<Integer> stack=new Stack<>();
        if(queue.isEmpty()||element>queue.size()||element<=0){
            System.exit(-1);
        }
        for(int i=0;i<element;i++){
            stack.push(queue.remove()); 
            
            
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
            
            
            
        }
        for(int i=0;i<queue.size()-element;i++){
            queue.add(queue.remove());
            
        }
       

        for(int i:queue){
            System.out.print(i+" ");
                  
        }
        System.out.println("");
        
        
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
