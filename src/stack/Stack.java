/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author HP
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        implementation i = new implementation(5);
        i.push(1);
        i.push(2);
        i.push(3);
        i.push(4);
        i.push(5);
        i.push(6);
        i.pop();
        i.pop();
        i.pop();
        i.pop();
        i.pop();
        i.pop();
        
    }
    
}
