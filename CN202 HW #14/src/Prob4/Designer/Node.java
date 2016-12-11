/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4.Designer;

import Prob3.Designer.*;

/**
 *
 * @author somsa
 */
public class Node {
    private int key;
    private Node left;
    private Node right;
    
    public Node(int i, Node l, Node r){
        key = i;
        left = l;
        right = r;
    }
    
    public int getKey(){
        return key;
    }
    public Node getLeftChild(){
        return left;
    }
    public Node getRightChild(){
        return right;
    }
    
    public void setKey(int i){
        key = i;
    }
    public void setLeftChild(Node l){
        left = l;
    }
    public void setRightChild(Node r){
        right = r;
    }
    
}
