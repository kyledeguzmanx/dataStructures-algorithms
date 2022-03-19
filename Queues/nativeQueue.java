import java.util.*;

public class Queue{
  public static void main(String[] args){
    Queue<Integer> myQueue = new LinkedList<>(); 
    
    myQueue.add(5);
    myQueue.add(4);
    myQueue.add(699);
    
    myQueue.remove();
    
    int head = myQueue.peek(); //head of queue
    
    myQueue.size();
  }
}
