
package stack;

import java.util.Stack;


public class BalancedExpression {
    
    public static boolean isBlanced(String input){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            
            if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i)=='<') { 
                stack.push(input.charAt(i));
            }else{
                            if (stack.isEmpty()) {
                                    return false;
                            } else {
                                
                            char top_char = stack.pop();
                            if (input.charAt(i) == ']' && top_char != '[') {
                                    return false;
                            } else if (input.charAt(i) == '}' && top_char != '{') {
                                    return false;
                            } else if (input.charAt(i) == ')' && top_char != '(') {
                                    return false;
                            } else if (input.charAt(i) == '>' && top_char != '<') {
                                    return false;
                            }
                            
                            }
                    }
        }
        
        if(!stack.isEmpty()) {
            return false;
        } else return true;
    }
    public static void main(String[] args) {
        String exp = "[({})(())]";
            boolean result = isBlanced(exp);
            System.out.println(result);
       
    }
}



