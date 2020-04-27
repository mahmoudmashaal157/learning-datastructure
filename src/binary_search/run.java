/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class run {
    public static void Binary_Search(int key,int arr[],int A,int B){
        int flag=0;
        int mid=((B-A)/2)+A;
        while(A<=B){
            if(key==arr[mid]) {
                System.out.println("Found");
                flag=1;
                break;
            }
            else if (key>arr[mid]){
                A=mid+1;
            }
            else{
                B=mid-1;
            }
            mid=((B-A)/2)+A;

        }
        if(flag==0){
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args) {
         int arr[]={10,20,30,40,50,60,70,80,90,100};
           int A=0;
         int B=arr.length-1;
         int key;
         Scanner s =new Scanner (System.in);
         key=s.nextInt();
         Binary_Search(key,arr,A,B);
    }
    
}
