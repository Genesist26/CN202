/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4.Designer;

import java.util.ArrayList;

/**
 *
 * @author somsa
 */
public class BST implements BSTADT {

    private Node root;

    public BST() {
        root = null;
    }

    public boolean isBST() {
        return isBST(root);
    }

    private boolean isBST(Node local) {
        if (local == null) {
            return true;
        }
        if ((local.getLeftChild() != null) && (local.getLeftChild().getKey() > local.getKey())) {
            return false;
        }
        if ((local.getRightChild() != null) && (local.getRightChild().getKey() < local.getKey())) {
            return false;
        }

        return isBST(local.getLeftChild()) && isBST(local.getRightChild());
    }

    public void insert(int i) {
        Node newNode = new Node(i, null, null);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent = root;

            while (true) {
                parent = current;
                if (current.getKey() > i) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        break;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        break;
                    }
                }
            }

        }

    }

    public int findFloor(int x) {
        if (root == null) {
            return -1;
        } else {
            Node current = root;
            int target = current.getKey();

            while (current.getKey() != x) {
                if (current.getKey() > x) {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                }
                if (current == null) {
                    break;
                } else {
                    target = current.getKey();
                }
            }

            if (target == x) {
                return 0;
            }
            else
                return target;
        }

    }
    
    public int copyBST2Array(Node localRoot, int[] A, int pos){
        ArrayList list = new ArrayList<Integer>();
        copyBST2Array(localRoot, list);
        int startIndex = pos;
        int endIndex   = pos + list.size();
        int j = 0;
        for(int i = startIndex; i < endIndex; i++){
            A[i] = (int)list.get(j++);
        }
        return endIndex - startIndex;
    }
    private void copyBST2Array(Node local, ArrayList list)
    {
        if(local != null){
            copyBST2Array(local.getLeftChild(), list);
            list.add(local.getKey());
            copyBST2Array(local.getRightChild(), list);
        }
    }
    
    public int copyBST2ArrayWithQueue(Node localRoot, int[] A, int pos){
        Queue q = new Queue();
        copyBST2ArrayWithQueue(localRoot, q);
        int startIndex = pos;
        int endIndex   = pos + q.size();
        int j = 0;
        for(int i = startIndex; i < endIndex; i++){
            A[i] = (int)q.remove();
        }
        return endIndex - startIndex;
    }
    private void copyBST2ArrayWithQueue(Node local, Queue q)
    {
        if(local != null){
            copyBST2ArrayWithQueue(local.getLeftChild(), q);
            q.insert(local.getKey());
            copyBST2ArrayWithQueue(local.getRightChild(), q);
        }
    }
    
    public Node getRoot(){
        return root;
    }
    

}
