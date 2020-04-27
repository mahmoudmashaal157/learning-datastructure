/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self_search_transposed;

/**
 *
 * @author HP
 */
public class self_search_Transposed {

   public static int search(int arr[],int value){
      int flag=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==value){
               int temp=arr[i];
               arr[i]=arr[i-1];
               arr[i-1]=temp;
               flag=1;
               break;
           }
       }
       return flag;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        int arr []={10,20,30,50,7};
        int key=7;
        int x=search(arr,7);
         x=search(arr,9);
        if(x==1){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Not Found");
        }
    }
    
}
