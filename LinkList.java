package com.company;

public class LinkList {
  public Node head;
  public Node tail;
  public int count;

public LinkList(){
  head=null;
  tail=null;
  count=0;
  }

public int getSize(){
  return count;
}

public boolean IsEmpty(){
    return (head==null);
  }


public void InsertHead(int data){
  if(IsEmpty()){
  head=new Node(data);
  head.next=null;
  tail=head;
  tail.next=null;
  }
  else {
    Node NewHead=new Node(data);
    NewHead.next=head;
    head=NewHead;
    newHead=null;
  }
  count++;
}
public void InsertTail(int data){
  if(IsEmpty()) InsertHead(data);
  else {
  Node NewTail = new Node(data);
  tail.next=NewTail;
  NewTail.next=null;
  tail=NewTail;
  NewTail=null;
  }
  count++;
  }

public void InsertFormPosition(int data, int Position){
  if((Position>0) && (Position<=count))
   {
     if(Position==1) InsertHead(data);
      else if(Position==count) InsertTail(data);
      else
      {
        Node Temp= head;
        for(int i=1; i<Position-1;i++) Temp=Temp.next;
        Node PositionNode = new Node(data);
        PositionNode.next=Temp.next;
        Temp.next=PositionNode;
        temp=null;
        count++;
      }
  }
  else
  System.out.println("The Position "+Position+"is bigger than List size which is "+count+"or less than 1");
}
public void DeleteFromHead(){
  if(!IsEmpty()) {
    if(head==tail){
    head=null;
    tail=null;
    }
    else {
      head=head.next;
    }
    count--;
   }
  else
  System.out.println("The List is Empty");
  }
public void DeleteFromTail(){
  if(!IsEmpty()) {
    if(head==tail){
    head=null;
    tail=null;
    }
  else {
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
        tail=temp;
        temp.next=null;
        }
    }
    count--;
  }
  else
  System.out.println("The List is Empty");
  }
public void DeleteFromPosition(int PositionNumber){
  if((PositionNumber>0) && (PositionNumber<=count))
   {
     if(PositionNumber==1) DeleteFromHead();
      else if(PositionNumber==count) DeleteFromTail();
      else
      {
      Node PositionDelete =head;
      for(int i=1; PositionNumber-1>i; i++)
      PositionDelete=PositionDelete.next;
      PositionDelete.next=PositionDelete.next.next;
      count--;

      }
    }
  else
  System.out.println("The Position Number "+ PositionNumber+"is bigger than the list size which is "+count+"or the Less than 1");
  }
}
