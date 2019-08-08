package com.company;

public class Stack {

    protected Node top;
    protected int size;

    public Stack()
    {
        top=null;
        size=0;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public int getSize(){
        return size;
    }

    public void Push(int data){
        Node elements=new Node(data, null);
        if(top==null) top=elements;
        else {elements.setNext(top);
        top=elements;}

        size++;
    }

    public int Pop(){
            Node pop=top;
            top=pop.getNext();
            size--;
        return pop.getData();
    }
    public int top(){
        return top.getData();
    }

    public void Display()
    {
        if(size==0)
        {
            System.out.println("Empty");
            return;
        }
        Node pop=top;
        while(pop != null){
            System.out.println(pop.getData()+" ");
            pop=pop.getNext();
        }
        System.out.println();
    }



}
