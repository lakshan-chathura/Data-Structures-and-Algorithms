package Stack;

import java.util.LinkedList;
import java.util.Queue;
// We always use queue1 for pushing new items.
// When popping an item, we move all the items
// except the last one from queue1 to queue2.
//
// Q1 [10, 20, 30, 40] => Q1 [40]
// Q2 []               => Q2 [10, 20, 30]
//
// Now the item to be popped is in Q1. We remove
// and return that as the item on top of the stack.
//
// Q1 []
// Q2 [10, 20, 30]
//
// We should swap the queues, so we can repeat this
// algorithm next time we need to pop the stack.
//
// Q1 [10, 20, 30]
// Q2 []  (ready for moving items)
public class StackUsingTwoQueues {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    int top;

    public void push(int element){
        queue1.add(element);
        top=element;

    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        while(queue1.size()!=1){
            top=queue1.remove();
            queue2.add(top);
        }
        //swap queues
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;

        return queue2.remove();
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }

    public int top(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return top;
    }

    public static void main(String[] args) {
        StackUsingTwoQueues stackUsingTwoQueues=new StackUsingTwoQueues();
        stackUsingTwoQueues.push(10);
        stackUsingTwoQueues.push(20);
        stackUsingTwoQueues.push(5);
        stackUsingTwoQueues.push(40);
        stackUsingTwoQueues.push(25);
        stackUsingTwoQueues.push(2);
        System.out.println(stackUsingTwoQueues.pop());
        System.out.println(stackUsingTwoQueues.pop());
    }
}
