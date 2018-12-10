// This is a BST Tree implementing a recursive algorithm for
// search, insertion, deletion, printing, and determining maximum
// depth.
package binarysearchtree;

public class BinSrchTree{
  private BSTNode root; // The root of the Binary Search Tree.

  //PRE: None
  //POS: tree == null
  //TAS: Initialize the Binary Search tree to null
  public BinSrchTree(){
    root = null;
  }

  //PRE: None
  //POS: None
  //TAS: return root being equal to null
  boolean isEmpty(){
    return root == null;
  }

  //PRE: init<key>
  //POS: none
  //TAS: Search the tree for object with key
  // if (object with this key is in the tree)
  // return a reference to the object
  // else
  // return a null reference
  public Object search(String key){
    BSTNode node = recSearch(root, key);
    if(node == null){
      return null;
    }else{
      return node.getElement();
    }
  }

  //PRE:
  //POS:
  //TAS: Currently, this method is stubbed; it is returning
  // null because it has to return something.
  private BSTNode recSearch(BSTNode node, String key)
  { 
    if (node == null)//not in tree 
    { 
      return null; 
    } 
    else if (key.compareTo (node.getKey ()) == 0) //found it!
    { 
      return node;
    } 
    else if (key.compareTo (node.getKey ()) < 0) //go left
    { 
      return (recSearch (node.getLeft (), key)); 
    } 
    else //go right
    { 
      return (recSearch (node.getRight(), key));
    } 
} // recSearch method 

    
   // recSearch method

  //PRE: init <key>, init<element>
  //POS: exit <tree> <-- entry <tree> + element
  //TAS: insert the object with key into the tree
  public void insert(String key, Object element){
    root = recInsert(root, key, element);
  }

  //PRE:
  //POS:
  //TAS:
  private BSTNode recInsert(BSTNode node, String key, Object element){
    if(node == null){
      node = new BSTNode(key, element, null, null);
    } else if(key.compareTo(node.getKey()) == 0){
      node.setElement(element);
    } else if(key.compareTo(node.getKey()) < 0){
      node.setLeft(recInsert(node.getLeft(), key, element));
    } else {
      node.setRight(recInsert(node.getRight(), key, element));
    }
    return node;
  }

  // an alternative way to implement insert
  public void insert1(String key, Object element){
    if(root == null){// tree is empty
      root = new BSTNode(key, element, null, null);
    }else{
      recInsert1(root, key, element);
    }
  }

  // an alternative way to implement recInsert
  // Note that this method returns nothing!
  private void recInsert1(BSTNode node, String key, Object element){
    // PRE: node is not null
    if(key.compareTo(node.getKey()) < 0){// go left
      if(node.getLeft() == null){
        node.setLeft(new BSTNode(key, element, null, null));
      }else{
        recInsert1(node.getLeft(), key, element);
      }
    }else{// go right
      if(node.getRight() == null){
        node.setRight(new BSTNode(key, element, null, null));
      }else{
        recInsert1(node.getRight(), key, element);
      }
    }
  }

  public void delete (String key)
  // PRE: init 
  // POS: exit = entry - node
  // TAS: Call the recursive delete method with the root and  the key
  {
    root = recDelete (root,key);
  }//delete
  
  private BSTNode recDelete (BSTNode node, String key)
  // PRE: init , init
  // POS: exit = entry - node
  // TAS: Find the node to delete and call remove if found
  {
    if (node == null) {
      System.out.println ("Unable to find node with key.");
      return null;
    }else if (key.compareTo(node.getKey()) == 0) {
      node = remove (node);
    }else if (key.compareTo (node.getKey()) < 0) {
      node.setLeft(recDelete(node.getLeft(), key));
    }else {
      node.setRight(recDelete(node.getRight(), key));
    }
    return node;
  }// recDelete
  
  private BSTNode remove (BSTNode node) {
    // PRE: node points to delete node
    // POS: exit = entry - node
    // TAS: Delete the node and reattach subtrees of deleted node
    BSTNode here = node;
    if (node.getLeft() == null) {       // CASE 1: Right Child Only
      return node.getRight();           // attach right subtree
    }else if (node.getRight() == null){  // CASE 2: Left Child Only
      return node.getLeft();             // attach left subtree
    }else {                           // CASE 3: both L & R children
      node = node.getRight ();        // point to right child
      BSTNode temp = node;            // set temp to node
      while (temp.getLeft() != null){ // find node in right
        temp = temp.getLeft();        // subtree w largest key
      }
      temp.setLeft (here.getLeft());  // attach left subtree
      return node;                    // quit
    }//else
  }

  //PRE:
  //POS:
  //TAS:
  public void printTree (){
    System.out.println(this.toString());
  }

  public String toString(){
    return recToString(root);
  }

  //PRE:
  //POS:
  //TAS:
  private String recToString(BSTNode node){
    if (node == null){
      return "";
    } else {
      return recToString(
          node.getLeft()) + node.getKey() + recToString(node.getRight());
    }
  }

  //PRE:
  //POS:
  //TAS:
  public int depth(){
    return recDepth(root);
  }

  //PRE:
  //POS:
  //TAS:
  protected int recDepth(BSTNode node){
    if (node == null){
      return 0;
    } else {
      return 1 + Math.max( recDepth(node.getLeft()), recDepth(node.getRight()));
    }
  }
}