/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self_organized_search_move_front;


public class Listnode {
    List head=null;
    public void insert(int index,int value){
        List l = new List(value);
        if(index==0){
            l.next=head;
            head=l;
        }
        else{
            List i=head;
            for(int j=0;j<index-1;j++){
                i=i.next;
            }
            l.next=i.next;
            i.next=l;
        }
    }
    public void print(){
    List k=head;
    while(k!=null){
        System.out.println(k.value);
        k=k.next;
    }
    }
    public  boolean self_search(int key){
        List i=head;
        List pre=null;
        boolean flag = false;
        while(i!=null){
            if(i.value==key){
                if(pre!=null){
                    pre.next=i.next;
                    i.next=head;
                    head=i;
                }
                
                flag =true;
            }
            pre=i;
            i=i.next;
        }
        return flag;
    }
}
