class MyStack {
    Queue<Integer> q1,q2;
    public MyStack() {
        q1=new ArrayDeque<>();
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int x=0;
        q2=new ArrayDeque<>();
        while(!q1.isEmpty())
        {
            x=q1.poll();
            if(q1.isEmpty())
            {
                break;
            }
            q2.add(x);
        }
        q1.addAll(q2);
        return x;
    }
    
    public int top() {
         int x=0;
         q2=new ArrayDeque<>();
        while(!q1.isEmpty())
        {
            x=q1.poll();
            q2.add(x);
        }
        q1.addAll(q2);
        return x;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */