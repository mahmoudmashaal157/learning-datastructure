/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

public class implementation {
  int top = -1;
    int size;
    int [] stack1 ;
  public  implementation(int size){
      this.size=size;
      stack1=new int [this.size];
  }
  
  public void push(int x){ 
      if(top==size-1){
          System.out.println("the stack is full");
      }
      else{
          stack1[++top]=x;
      }
  }
  public void pop(){
      if(top==-1){
          System.out.println("the stack is empty");
      }
      
      else
      --top;
  }
  public void print(){
      for(int i=0;i<=top;i++){
          System.out.println(stack1[i]);
      }
  }
  public void top1(){
      System.out.println(stack1[top]);
  }
  
}
