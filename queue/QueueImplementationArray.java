/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

//Queue implementation using array

import java.util.Arrays;


public class QueueImplementationArray {
      int front,rear,size,count;
      static int array[];

    public QueueImplementationArray(int size) {
        this.size = size;
        array=new int[size];
        front =0;
        rear=0;
        count=0;
    }

    void enqueue(int element){

        if(count==size){
            System.out.println("Queue is Overflow");
            System.exit(-1);
        }else{
            array[rear]=element;
            rear=(rear+1)%array.length;
            count++;
        }
    }

    int dequeue(){
        if(count==0){
            System.out.println("Queue is underflow");
            return -1;
        }else{
            
            int x=array[front];
            array[front]=0;
            front=(front+1)%array.length;
            count--;
            return x;
        }
       
    }

    boolean isFull(){
        if(rear==size){
            return true;
        }else
            return false;
    }

    boolean isEmpty(){
        if(rear==front){
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(array); 
    }


    public static void main(String[] args) {
        QueueImplementationArray test=new QueueImplementationArray(5);
        test.enqueue(10);
        test.enqueue(20);
        test.enqueue(30);
        test.enqueue(40);
        test.enqueue(50);
         System.out.println(test);
        
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        
        test.enqueue(60);
        test.enqueue(70);
        test.enqueue(70);
    
        System.out.println(test);
        System.out.println("------------");

    }
 
}
