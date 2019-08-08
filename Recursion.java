package com.company;

public class Recursion{

int xx(int n){
  if(n==1)
    return 1;
  else
    return(xx(n-1)+n);  
  }

}
