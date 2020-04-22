/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

public class implementation {
    int size;
    int first =0,last = -1;
    int queue [];
    public implementation(int size){
        this.size=size;
        queue=new int [this.size];
    }
    public void enqueue(int x){
        if(this.last==this.size-1){
            System.out.println("the queue is full");
        }
        else{
        queue[++last]=x;
        }
    }
    public void dequeue(){
        if(this.first ==this.last||last==-1){
            System.out.println("the queue is empty");
        }
        else
        ++this.first;
    }
    public void print(){
        if(this.first==this.last||last==-1){
            System.out.println("the queue is empty");
        }
        else{
        if(this.first==-1){
            for(int i=0;i<=last;i++){
                System.out.println(queue[i]);
            }
            
        }
        else {
                 for(int i=first;i<=last;i++){
                     System.out.println(queue[i]); 
                 }   
                }
        }
    }
    
}
