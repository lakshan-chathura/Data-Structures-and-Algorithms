/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;

/**
 *
 * @author Lakshan
 */
public class ReverseStringUsingStack {
    public static String getReverseString(String word){
        if(word==null){
            throw new IllegalArgumentException("This can't be null");
        }
        Stack<Character> stack=new Stack<>();
        for(char ch:word.toCharArray()){
            stack.push(ch);
        }
        StringBuffer reverse=new StringBuffer();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
    
    public static void main(String[] args) {
        String result=getReverseString("lakshan");
        System.out.println("Reverse String : "+result);
    }
}