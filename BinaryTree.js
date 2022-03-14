class Node{
  int key;
  Node left, right;

  public Node (int item){
    key = item;
    left = null;
    right = null;
  }
}

class BinaryTree{
  
  BinaryTree(int key){ //constructor w input 
    root = new Node(key);
  } 
  BinaryTree(){ //constructor without input
    root = null;
  }
}
