class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2;
    int peak=0;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(stack1.isEmpty()) peak=x;
        stack1.push(x);
    }
    
    public int pop() {
        int rem=0;
        stack2 = new Stack<>();
        while(!stack1.isEmpty())
        {
            rem=stack1.pop();
            if(stack1.isEmpty())
            {
                continue;
            }
            stack2.push(rem);
        }
        while(!stack2.isEmpty())
        {
            if(stack1.isEmpty()) peak=stack2.peek();
            stack1.push(stack2.pop());
        }
        return rem;
    }
    
    public int peek() {
        return peak;
    }
    
    public boolean empty() {
        return stack1.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */