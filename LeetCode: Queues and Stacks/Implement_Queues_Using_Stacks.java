import java.io.*;
import java.util.*;

class MyQueue {
    
    Stack<Integer> myStack;

    public MyQueue() {
        myStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        myStack.push(x);
    }
    
    public int pop() {
        int temp = myStack.firstElement();
        myStack.removeElementAt(0);
        return temp;
    }
    
    public int peek() {
        return myStack.firstElement();
        
    }
    
    public boolean empty() {
        return myStack.size() == 0 ? true : false;
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

/*
 DIFFICULTY: EASY
 NOTES: Completed quickly w/o help

*/
