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
  
    public void push1(int element){
        if(isFull1()){
            throw new IllegalStateException();
        }
        array[++top1]=element;

    }
    public int pop1(){
        if(isEmpty1()){
            throw new IllegalStateException();
        }
        return array[top1--];
    }

    public boolean isEmpty1(){
        return top1==-1;
    }
    public boolean isFull1(){
        return top1+1==top2;
    }

    public void push2(int element){
        if(isFull2()){
            throw new IllegalStateException();
        }
        array[--top2]=element;
    }
    public int pop2(){
        if(isEmpty2()){
            throw new IllegalStateException();
        }
        return array[top2++];
    }
    public boolean isEmpty2(){
        return top2==size;
    }
    public boolean isFull2(){
        return top2-1==top1;
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
