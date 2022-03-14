
public class LinkedList{
  Node head; //parent to all node

  static class Node {
    int data;
    Node next;
    
    //constructor
    Node (int d){
      data = d;
      next = null;
    }
  }
  
  public status LinkedList insert(LinkedList list, int data){
    Node new_node = new Node(data);
    new_node.next = null;

    if(list.head == null){
      list.head = new_node;
    }
    else{
      Node last = list.head;
      while(last.next != null){
        last = last.next;
      }
      last.next = new_node;
    }

    return list;
  }
  public static void deleteNode(LinkedList list, int data){
    Node temp =  list.head; 
    Node previous = null;
    
    if(temp != null && temp.data == data){
      head = temp.next;
      return;
    }
    
    while(tenp != null && temp.data != data){
      previous = temp;
      temp  = temp.next;
    }
    if(temp == null){
      return;
    }
    previous.next = temp.next;
    
  }
  
  public static void printList(LinkedList List){
    Node currentNode = list.head;
    System.out.println("Linked List: ");

    while(currentNode != null){
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
  }
// Driver code
  public static void main(String[] args){
                /* Start with the empty list. */
                LinkedList list = new LinkedList();

                //
                // ******INSERTION******
                //

                // Insert the values
                list = insert(list, 1);
                list = insert(list, 2);
                list = insert(list, 3);
                list = insert(list, 4);
                list = insert(list, 5);
                list = insert(list, 6);
                list = insert(list, 7);
                list = insert(list, 8);

                // Print the LinkedList
                printList(list);
    }
}
