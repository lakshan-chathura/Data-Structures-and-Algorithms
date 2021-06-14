package linkedlist;

class Node{
    Node next;
    int data;
    
    public Node(int data) {
        this.data = data;
    }
    
}

public class SinglyLinkedListDemo {
    Node head;
    
    //add the node element last in the linkedlist
    public void lastAppend(int data){
        if(head==null){
            head=new Node(data);
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
            
        }
        current.next=new Node(data);
        
        
    }
    
    //add the node element middle in the linkedlist
    public void insertMiddle(int data){
        if(head==null){
            head=new Node(data);
        }
        int count=0;
        Node newNode=new Node(data);
        Node curreNode=head;
        
        //get the size of the linked list
        int list_length=numberOfNodes();
        if(list_length%2==0){
           count= list_length/2;
        }else{
            count=list_length+1/2;
        }
        for(int i=0;i<count;i++){
            curreNode=curreNode.next;
        }
        
            newNode.next = curreNode.next;
            curreNode.next = newNode;
    
    }
    
    //add the node element first in the linkedlist
    public void preAppend(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

  
    //delete the node from the list
    public void deleteNode(int data){
        if(head==null){
            return ;
        }
        //delete first node of the list
        if(head.data==data){
        head=head.next;
        }
        Node current=head;
        while(current.next!=null){
           if(current.next.data==data){
               current.next=current.next.next;
           }
           current=current.next;
           
        }
        
    }

   //get the number of nodes or size of list 
    public int numberOfNodes(){
        int count=0;
        if(head==null){
            return 0;
        }else {
            Node current=head;
            while(current.next!=null){
              count++;
              current=current.next;
            }
            return count;
        }
    }
    
    public static void main(String[] args) {
       
    }
}
