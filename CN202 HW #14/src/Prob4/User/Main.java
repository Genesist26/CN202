/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4.User;

import Prob4.Designer.BST;
import Prob4.Designer.Queue;

/**
 *
 * @author somsa
 */
public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(6);
        bst.insert(2);
        bst.insert(9);
        bst.insert(1);
        bst.insert(4);
        bst.insert(8);
        bst.insert(5);
        int[] A = new int[10];
/*
        System.out.println("copyBST2Array = "+bst.copyBST2Array(bst.getRoot(), A, 0));
        
        for(int i = 0; i< A.length; i++){
            System.out.print(A[i]+" ");
        }
        
*/

        System.out.println("copyBST2Array with Queue = "+bst.copyBST2ArrayWithQueue(bst.getRoot().getLeftChild(), A, 2));
        for(int i = 0; i< A.length; i++){
            System.out.print(A[i]+" ");
        }

        
    }
}
