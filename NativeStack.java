import java.io.*;
import java.util.*;

public class NativeStack{
  public static void main(String[] args){
    Stack stack1 = new Stack();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    stack1.push(4);
    stack1.push(55);
    stack1.push(45);
    Integer popped = stack1.pop();
    Integer head = stack1.peek();
    
    Integer position = (Integer) stack.search(55); //searches for element. Returns -1 if element not found
    
    System.out.println(stack1)
    
  }
}
