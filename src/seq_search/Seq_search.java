/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seq_search;

import java.util.Scanner;


public class Seq_search {
    public static int seq_search(int arr [],int key){
     for(int i=0;i<arr.length;i++){
         if(arr[i]==key){
             return i;
         }
         
     }
        return -1;
}
    public static void main(String[] args) {
        int arr []={5,10,12,30,45};
        int k;
        System.out.println("Enter the key");
        Scanner s = new Scanner(System.in);
        k=s.nextInt();
        int x=seq_search(arr,k);
        if(x!=-1){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
    
}
