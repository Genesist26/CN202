/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

import Prob2.*;

public class StudentDataApp {

    public static void main(String[] args) {
        int maxSize = 100;
        Dictionary d = new Dictionary(maxSize);

        d.insert(new Student("0002", "Anirut"));
        d.insert(new Student("0456", "Somrak"));
        d.insert(new Student("0383", "Pongsak"));
        d.insert(new Student("0139", "Niwat"));
        d.insert(new Student("0345", "Somkiat"));
        d.insert(new Student("0847", "Somyot"));

        d.display();

        while (true) {
            System.out.print("Student record with max ID = ");
            System.out.println((Student) d.getMaxKey());

            if (d.removeMaxKeyItem()) {
                System.out.println("After removing the record with max ID:");
                d.display();
            } else {
                System.out.println("Dictionary is empty now");
                break;
            }
        }
    }
}
