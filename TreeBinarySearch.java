package com.company;

public class TreeBinarySearch{
    Node root=new Node();

  public  TreeBinarySearch(int data){
   root.left=root.right=null;
   root.data=data;
  }

 public boolean IsEmpty(){
  return(root==null);
  }

public void Insert(int data){
  Node parent= root;
  Node child=root;
    while(child!=null){
      if(data>child.data)
        child=child.right;
      else
        child=child.left;
    }

  child =new Node();
  child.data=data;
  child.left=null;
  child.right=null;
  if(data>parent.data) parent.right=child;
  else parent.left=child;
  }

public void callPreOrder(){
  PreOrder(root);
  }
public void PreOrder(Node Pre){
  if(Pre!=null){
    System.out.println(Pre.data);
    PreOrder(Pre.left);
    PreOrder(Pre.right);
      }
    }
  public void callOrder(){
    InOrder(root);
    }
  public void InOrder(Node In){
    if(In!=null){
      System.out.println(In.data);
      InOrder(In.left);
      InOrder(In.right);
      }
    }
    public void callPostOrder(){
      PostOrder(root);
    }
    public void PostOrder(Node Post){
      if(Post!=null){
        PostOrder(Post.left);
        PostOrder(Post.right);
        System.out.println(Post.data);
      }
    }
    public void callDele(int data){
      if(!IsEmpty())
      Dele(data,root);
    }
    public void Dele(int data,Node dele){
      if(dele!=null){
        if(data>dele.data)
        Dele(data,dele.right);
        else if(data<dele.data)
        Dele(data,dele.left);
      }
    }
    public int findSuccessor(Node successor){
      while(successor.left!=null){
        successor=successor.left;
      }
      return successor.data;

    }
    public Node findParent(int data, Node findparent){
      Node parent=root;
      Node child=root;
      while(child!=null){
        if(data>=child.data)
        parent=child;
        else
        if(data<child.data)
        child=child.left;

        if(child==findparent) break;
      }
      return parent;
    }
    public void deleteNode(Node delete){
      Node Parent= findParent(delete.data,delete);
      if((delete.left==null) && (delete.right==null))
      {
        if(Parent.left==delete) Parent.left=null;
        else Parent.right=null;
      }
      else if((delete.left==null) || (delete.right==null)){
        if(Parent.left==delete){
          if(delete.left != null) Parent.left=delete.left;
          else Parent.left=delete.right;
        }
        else
        {
          if(delete.right != null)
          Parent.right=delete.right;
          else Parent.right=delete.left;
        }
      }
      else{
        int succ=findSuccessor(delete.right);
        delete.data=succ;
        Dele(delete.data,delete.right);
      }
    }
  }
