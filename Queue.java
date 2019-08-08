package com.company;

public class Queue{
LinkList List;
public Queue(){

  List=new LinkList();
  }
public void Enqueue(int data){
  List.InsertHead(data);
  }

public void Top(){ //Some called First()
  System.out.println(List.tail.data);
  //or Return(List.tail.data)
  }
public boolean IsEmpty(){
  return(List.IsEmpty());
  }

public void Dequeue(){
  System.out.println(List.tail.data);
  List.DeleteFromTail();
  }

public int Size(){
  return (List.count);
  }

}
