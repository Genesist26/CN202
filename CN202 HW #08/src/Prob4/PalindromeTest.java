/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4;

/**
 *
 * @author somsa
 */
public class PalindromeTest {

    public static void main(String[] args) {
        String word = "bed";
        Stack stack = new Stack();
        boolean palindrome = true;

        for(int i = 0; i< word.length(); i++)
        {
            stack.push(new Character(word.charAt(i)));
        }
        
        for(int i = 0; i< word.length(); i++)
        {
            if(word.charAt(i) != ((Character)stack.pop()).charValue())
                palindrome = false;
        }
        
        System.out.println(palindrome);
    }
}
