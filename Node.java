package com.company;

  public class Node{
    int data;
    Node next;
    Node left;
    Node right;
  
  
  public Node(){
    next=null;
    data=0;
    }
  
  public Node(int data){
    this.data=data;
    }
  
    public Node(int data, Node next){
      this.data=data;
      this.next=next;
      }
  
  public void setData(int data){
    this.data=data;
    }
  public void setNext(Node next){
    this.next=next;
    }
  public int getData(){
    return data;
    }
  public Node getNext(){
    return next;
    }
  
  }