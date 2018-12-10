package binarysearchtree;

public class BSTNode
{
  protected String key;
  protected Object element;
  protected BSTNode left, right;
  protected int height;

  public BSTNode(String key, Object element, BSTNode left, BSTNode right){
    this.key = key;
    this.element = element;
    this.left = left;
    this.right = right;
    height = 0;
  }

  public int getHeight(){
    return height;
  }

  public void setHeight(int height){
    this.height = height;
  }

  public String getKey(){
    return key;
  }

  public Object getElement(){
    return element;
  }

  public BSTNode getLeft(){
    return left;
  }

  public BSTNode getRight(){
    return right;
  }

  public void setElement(Object element){
    this.element = element;
  }

  public void setLeft(BSTNode node){
    left = node;
  }

  public void setRight (BSTNode node){
    right = node;
  }
  
  public void print(){
  if(right != null){
    right.recPrint(true, "");
  }
  System.out.println(key);
  if(left != null){
    left.recPrint(false, "");
  }
}

private void recPrint(boolean isRight, String indent){
  if(right != null){
    right.recPrint(true, indent + (isRight ? "        " : " |      "));
  }
  System.out.print(indent);
  if(isRight){
    System.out.print(" /");
  }else{
    System.out.print(" \\");
  }
  System.out.println("----- "+key);
  if(left != null){
    left.recPrint(false, indent + (isRight ? " |      " : "        "));
  }
}
}