/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self_organized_search_move_front;

/**
 *
 * @author HP
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Listnode n = new Listnode();
        n.insert(0, 5);
        n.insert(1, 6);
        n.self_search(6);
        n.print();
    }
    
}
