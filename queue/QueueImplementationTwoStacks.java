public class QueueUsingTwoStacks {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void enqueque(int element){
        stack1.push(element);
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queueUsingTwoStacks=new QueueUsingTwoStacks();
        queueUsingTwoStacks.enqueque(10);
        queueUsingTwoStacks.enqueque(20);
        queueUsingTwoStacks.enqueque(30);


    }

}
