/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Lakshan
 */
public class TwoStacksOneArray {
    int size; 
    int top1, top2; 
    int arr[]; 
  
    // Constructor 
    TwoStacksOneArray(int size) 
    { 
        arr = new int[this.size]; 
        this.size = size; 
        top1 = -1; 
        top2 = size; 
    } 
  
    // Method to push an element x to stack1 
    void push1(int x) 
    { 
        if (top1 < top2 - 1) { 
             arr[++top1] = x; 
        }else
        { 
                throw new IllegalStateException("Stack is Full");
        } 
    } 
  
    // Method to push an element x to stack2 
    void push2(int x) 
    { 

        if (top1 < top2 - 1) { 
             
            arr[--top2] = x; 
        } 
        else { 
            throw new IllegalStateException("Stack is Full");
        } 
    } 
  
    // Method to pop an element from first stack 
    int pop1() 
    { 
        if (top1 >= 0) { 
            int x = arr[top1--]; 
            
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    } 
  
    // Method to pop an element from second stack 
    int pop2() 
    { 
        if (top2 < size) { 
            int x = arr[top2++]; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    }
    
    boolean isFull1(){
        if(top1+1==top2){
            return true;
           
        }else 
            return false;
    }
    
    
    boolean isFull2(){
        if(top1+1==top2){
            return true;
           
        }else 
            return false;
    }
    
    boolean isEmpty1(){
         if (top1 < 0)
        {
            return true;
        }else return false;
    }
    
        
    boolean isEmpty2(){
         if (top2 >= size)
        {
            return true;
        }else return false;
    }
    
    public static void main(String[] args) {
        TwoStacksOneArray ts = new TwoStacksOneArray(5); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from"
                           + " stack1 is " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from"
                           + " stack2 is " + ts.pop2()); 
    }
}
