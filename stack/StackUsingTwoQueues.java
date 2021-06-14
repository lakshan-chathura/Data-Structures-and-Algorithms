/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.*;



/**
 *
 * @author Lakshan
 */
public class StackUsingTwoQueues {
    
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    

    public StackUsingTwoQueues() {
    }

    public void push(int x){
        
       if(queue1.isEmpty()){
           queue1.add(x);
       }
       
       while(!queue1.isEmpty()){
           queue2.add(queue1.remove());
           
       }
       queue1.add(x);
       while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
            
       }

    }
    public int pop(){
        if(queue1.isEmpty()){
            System.out.println("Stack is empty ");
            
        }
        int return_value=queue1.remove();

        return return_value;
    }

    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingTwoQueues obj = new StackUsingTwoQueues();
        obj.push(20);
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
    }
}
