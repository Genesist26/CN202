/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2.User;

import Prob2.User.*;
import Prob2.Designer.BST;
import java.util.ArrayList;

/**
 *
 * @author somsa
 */
public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(9);
        bst.insert(4);
        bst.insert(15);
        bst.insert(2);
        bst.insert(6);
        bst.insert(7);
        bst.insert(12);
        bst.insert(21);
        
        System.out.println("Floor is this BST = ");
        bst.traverseBFS();

    }
}
