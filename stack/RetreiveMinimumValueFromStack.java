
package stack;


public class RetreiveMinimumValueFromStack {
  static  class Stack{
        int top;
        int array[];
        int size;

        public Stack(int size) {
            top=-1;
            this.size = size;
            array=new int[this.size];
        }
        
        public void push(int element){
            if(top==size-1){
                throw new IllegalStateException("Stack is Full");
            }
            array[++top]=element;
            
        }
        
        public int pop(){
            if(top==-1){
                throw new IllegalStateException("Stack is empty");
            }
            return array[top--];
        }
        
        public int min(){
            int minValue=array[0];
            for(int i=0;i<=top;i++){
                if(minValue>array[i]){
                    minValue=array[i];
                }
            }
            return minValue;
        }
        
    
    
    }
    
    public static void main(String[] args) {
        Stack a=new Stack(4);
        a.push(5);
        a.push(2);
        a.push(10);
        a.push(1);
        a.pop();
        a.pop();
        
        System.out.println("Min Value "+a.min());
    }
}
