/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Arrays;

/**
 *
 * @author Lakshan
 */
public class PriorityQueueImplementation {
    int array[];
    int size;
    int count;

    public PriorityQueueImplementation(int size) {
        this.size = size;
        array=new int[this.size];
    
    }
    public void enquue(int element){
        if(count==array.length){
            throw new IllegalStateException();
        }
        int i;
        for(i=count-1;i>=0;i--){
            if(element<array[i]){
                
                 array[i+1]=array[i];
            }else{
                break;
            }
            array[i+1]=element;
            count++;
           
            
        }
        
    }
    public int remove(){
        if(count==0)
            throw new IllegalStateException();
        return array[--count];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
    
    public static void main(String[] args) {
        PriorityQueueImplementation queue=new PriorityQueueImplementation(5);
        queue.enquue(1);
        queue.enquue(3);
        queue.enquue(5);
        System.out.println(queue);
        
    }
}
