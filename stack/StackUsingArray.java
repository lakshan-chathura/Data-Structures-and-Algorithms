package stack;


public class StackUsingArray {
    int size;
    int top;
    int array[];


    public StackUsingArray(int size) {
        this.top=-1;
        this.size=size;
        array=new int[this.size];
        
    }
    
    //adding element to the stack
    public void push(int element){
        
        if(top>=size-1){
            System.out.println("Stack is Overflowed");
            
        }else{
            array[++top]=element;
        }
            
    }
    
    //removing the element from the stack
    int pop(){
        if(top==-1){
            
            System.out.println("Stack is Underflow");
            return 0;
        }else{
            
            return array[top--];
           
        }
    }
    
    //return element without removing element from the stack
    int peek(){
       if(top==-1){
           System.out.println("Stack is Underflow");
            return 0;
        }
       else{
           return array[top];
       }
    }
    
    boolean isEmpty(){
        if(top<0){
            return true;
        }else
            return false;
    }
    
    
    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(2); 
            s.push(10);
            s.push(20);
          //  s.push(30);
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.pop() + " Popped from stack");
            
    }
    
    
}
