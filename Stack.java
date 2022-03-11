
public class Stack{
  Node head;

  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
    }

    public boolean isEmpty(){
      if(head == null){
        return true;
      }
      else{
        return false;
      }
    }
    public void push(int data){
      Node newNode = new Node(data);
      if(isEmpty()){
        head= newNode;
      }
      else{
        Node temp = head;
        head = newNode;
        newNode.next = temp;
      }
    }
    public int pop(){
      int popped = Integer.MIN_VALUE;
      if(!isEmpty()){
        popped = root.data;
        root = root.next;
      }
      return popped;
    }
  }
}
