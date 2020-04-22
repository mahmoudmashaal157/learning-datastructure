/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;


public class Linked_List {
    ListNode head=null;
    public void add (char value,int index){
        ListNode newnode =new ListNode(value);
        if(index==0){
            newnode.next=head;
            head=newnode;
        }
        else{
            ListNode i=head;
            for (int c=0;c<index-1;c++){
                i=i.next;
            }
            newnode.next=i.next;
            i.next=newnode;
        }
    }
    public void remove(int index){
        if(index==0){
            head=head.next;
        }
        else{
            ListNode i=head;
            for(int c=0;c<index-1;c++){
                i=i.next;
            }
            ListNode J =i.next;
            i.next=J.next;
        }
    }
    public void print(){
        ListNode i=head;
        while(i!=null){
            System.out.println(i.value);
            i=i.next;
        }
    }
   
    }

