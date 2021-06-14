
package queue;

import java.util.LinkedList;
import java.util.Queue;


public class GenerateBinaryNumbers {
    
   public static void genearteBinary(Queue<String> queue,int number){
       
       queue.add("1");
       while(number>0){
       String s1=queue.remove();
       System.out.println(s1); 
       String s2=s1;
       queue.add(s1+"0");
       queue.add(s2+"1");
       
       number--;
       }
       
       
   } 
    public static void main(String[] args) {
        Queue<String> q1=new LinkedList<>();
        genearteBinary(q1,10);
    }
}
