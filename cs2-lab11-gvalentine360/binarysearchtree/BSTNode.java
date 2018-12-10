package binarysearchtree;

public class BSTNode
{
  protected String key;
  protected Object element;
  protected BSTNode left, right;
  protected int height;
  public BSTNode (String key, Object element, BSTNode left, BSTNode right)
  {
    this.key = key;
    this.element = element;
    this.left = left;
    this.right = right;
  } // BSTNode constructor

  public String getKey ()
  {
    return key;
  } // getKey method

  public Object getElement ()
  {
    return element;
  } // getElement method

  public BSTNode getLeft ()
  {
    return left;
  } // getLeft method

  public BSTNode getRight ()
  {
    return right;
  } // getRight method

  public void setElement (Object element)
  {
    this.element = element;
  } // setElement method

  public void setLeft (BSTNode node)
  {
    left = node;
  } // setLeft method

  public void setRight (BSTNode node)
  {
    right = node;
  } // setRight method
  
  public String toString()
  {
    return key;
  }
  
  private int height( BSTNode node ){
  //PRE: none
  //POS: none
  //TAS: if the node is null return -1, else return the height in the node
  return node == null ? -1 : node.getHeight();
}
public int height(){
  return height(root);
}

private BSTNode singleRightRotation( BSTNode k2 ){
  //TASK: Rotate the left child up and to the right to
  //      become the new root of this subtree
  BSTNode k1 = k2.left;
  k2.left = k1.right;
  k1.right = k2;
  k2.height = Math.max( height( k2.left ), height( k2.right ) ) + 1;
  k1.height = Math.max( height( k1.left ), k2.height ) + 1;
  return k1;
}

private BSTNode singleLeftRotation( BSTNode k1 ){
  //TASK: Rotate the right child up and to the left to
  //      become the new root of this subtree
  BSTNode k2 = k1.right;
  k1.right = k2.left;
  k2.left = k1;
  k1.height = Math.max( height( k1.left ), height( k1.right ) ) + 1;
  k2.height = Math.max( height( k2.right ), k1.height ) + 1;
  return k2;
}

private BSTNode doubleLeftRightRotation( BSTNode k3 ){
  //TASK: Rotate the left subtree to the left, then up
  //      and to the right to become the new root of this subtree
  k3.left = singleLeftRotation( k3.left );
  return singleRightRotation( k3 );
}

private BSTNode doubleRightLeftRotation( BSTNode k4 ){
  //TASK: Rotate the right subtree to the right, then up and to
  //      the left to become the new root of this subtree
  k4.right = singleRightRotation( k4.right );
  return singleLeftRotation( k4 );
}

private BSTNode recAVLInsert (BSTNode node, String key, Object element){
  if (node == null){
    // empty spot? insert here.
    node = new BSTNode (key, element, null, null);
  }else if (key.compareTo (node.getKey ()) < 0){
    // insert in left subtree
    node.setLeft (recAVLInsert (node.getLeft (), key, element));
    // AFTER inserting, it is possible the tree is out of balance, so check
    // subtree heights
    if(height(node.getRight())- height(node.getLeft()) == -2){
      // if true, left subtree too tall
      // decide what sort of rotation will fix the problem
      if(key.compareTo( node.getLeft().getKey()) < 0 ){
        // inserted into left subtree of left child
        // fix with a single right rotation
        node = singleRightRotation( node );
      }else{
        // inserted into right subtree of left child
        // so double rotation is necessary
        node = doubleLeftRightRotation( node );
      }
    }
  }else{
    // insert in right subtree
    // shown below is simply the mirror image of what we did above
    node.setRight (recAVLInsert (node.getRight (), key, element));
    if( height( node.getRight() ) - height( node.getLeft() ) == 2 ){
      if( key.compareTo( node.getRight().getKey()) > 0 ){
        node = singleLeftRotation( node );
      }else{
        node = doubleRightLeftRotation( node );
      }
    }
  }//else

  // We are done, but now we need to reset the height of this node after the
  // insertion
  node.setHeight(Math.max( height(node.getLeft()), height(node.getRight())) + 1);
  return node;
}
} /* BSTNode class */