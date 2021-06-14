/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Lakshan
 */
class Node1{
    int data;
    Node1 next;
    Node1 previous;
    
    public Node1(int data){
     this.data=data;
    }

}

public class DoublyLinkedlistDemo {
    Node1 head,tail;
    
   //add the node begging of linked list
   void addNodeFront(int data){
        Node1 newNode=new Node1(data);
        newNode.next=head;
        newNode.previous=null;
        if(head!=null){
            head.previous=newNode;
        }
        head=newNode;
   }
   
   //add the node after the given node 
    void addNodeAfterGivenNode(Node1 pre_Node,int data){
       if(pre_Node==null){
                   System.out.println("The given previous node cannot be NULL ");
                   return;
       }
       Node1 newNode=new Node1(data);
       newNode.next=pre_Node.next;
       newNode.previous=pre_Node;
       pre_Node.next=newNode;
       if(newNode.next!=null){
           newNode.next.previous=newNode;
       }
       
    
   }
    
    //add the node end of list
    void addNodeLast(int data){
        Node1 last_Node=head;
        Node1 new_Node=new Node1(data);
        new_Node.next=null;
        if(head==null){
            new_Node.next=null;
            //new_Node.previous=null;
            head=new_Node;
            return;
        }
        
        while(last_Node.next!=null){
            last_Node=last_Node.next;
        }
        
        last_Node.next=new_Node;
        new_Node.previous=last_Node;
        
    }
   
    //node deleted from the begining
   void deleteNodeFirst(){
       Node1 temp;
       if(head==null){
           return;
       }
       temp=head;
       head=head.next;
       head.previous=null;
   } 
   
   //node deleted end of the list
   void deleteNodeLast(){
       Node1 temp1;
       if(head==null){
           return;
       }
        temp1=tail;
        tail=tail.previous;
        tail.next=null;
      
       
   }
   
   //node deleted after the specific node
   void deleteNodeAfterSpecificNode(Node1 node){
       
   }
    
   
   
}
