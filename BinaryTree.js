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


public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
 
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        tree.root.left.left = new Node(4);
    }
}
