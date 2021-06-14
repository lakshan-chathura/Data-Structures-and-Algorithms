/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

/**
 *
 * @author Lakshan
 */
public class ReverseElementsUsingQueue {
    public static void reverseElements(Queue<Integer> queue){
    
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        
        
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
        

    } 
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(8);
        q1.add(4);
        q1.add(23);
        reverseElements(q1);
        // Example 2
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(11);
        q2.add(98);
        q2.add(31);
        q2.add(42);
        q2.add(73);
        q2.add(6);
        reverseElements(q2);
    }
}
