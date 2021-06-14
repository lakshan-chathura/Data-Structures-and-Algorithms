
package stack;

//sort values using temporary stack

import java.util.Stack;

public class SortValuesStack {
    
    public static Stack<Integer> sortValues(Stack<Integer> stack){
        
        Stack<Integer> tempstack=new Stack<>();
       
        while(!stack.isEmpty()){
            int temp=stack.pop();
            System.out.println("Element taken out: "+temp);
            while(!tempstack.isEmpty() &&  tempstack.peek()>temp){
                stack.push(tempstack.pop());
            }
            tempstack.push(temp); 
            System.out.println("input: "+stack);
            System.out.println("tmpStack: "+tempstack);
            
        }
        return tempstack;
    }
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        System.out.println("input: "+input);
        System.out.println("final sorted list: "+sortValues(input));
    }
}
