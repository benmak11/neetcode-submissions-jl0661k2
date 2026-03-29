class MyStack {
    Queue<Integer> q;
    Queue<Integer> sec;

    public MyStack() {
        q = new LinkedList<>();
        sec = new LinkedList<>();        
    }
    
    public void push(int x) {
        sec.offer(x);
        while (!q.isEmpty())
            sec.offer(q.poll());

        Queue<Integer> temp = q;
        q = sec;
        sec = temp;
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size() == 0;
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