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
    class Node{
        int data;
        Node next;
     
    }
public class StackUsingLinkedList {
    Node head;

    public StackUsingLinkedList() {
        this.head = null;
    }
    
    public void push(int data){
        
        Node current=head;
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=current;
    
    }
    
    int pop(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        int returnValue=head.data;
        head=head.next;
        return returnValue;
    }
    public static void main(String[] args) {
        
    }
}
