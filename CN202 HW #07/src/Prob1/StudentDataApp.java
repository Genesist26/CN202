/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob1;

public class StudentDataApp {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        
        Student anirut = new Student("0002", "Anirut");
        d.insert(anirut);

        Student somrak = new Student("0456", "Somrak");
        d.insert(somrak);

        Student pongsak = new Student("0383", "Pongsak");
        d.insert(pongsak);

        Student niwat = new Student("0139", "Niwat");
        d.insert(niwat);

        d.display();

        String searchID = "0383";
        Student foundStudent = (Student) d.find(searchID);
        if (foundStudent != null) {
            System.out.println("Found " + foundStudent);
        } else {
            System.out.println("Can't find " + searchID);
        }

        System.out.println("Delete 0383");
        d.delete("0383");

        d.display();
    }
}
