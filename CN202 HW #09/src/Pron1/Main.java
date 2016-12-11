/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pron1;

/**
 *
 * @author Salee
 */
public class Main {
    private String name;
    
    public Main(String s)
    {
        name = s;
        
    }
    public static void main(String[] args) {
        Main a = new Main("a");
        Main b = new Main("b");
        
        Queue q = new Queue();
        q.insert(a);
        q.insert(b);
        
        System.out.println("Queue front = ");
    }
}
