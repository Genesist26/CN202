/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

public class Student implements DictionaryItem {

    private String studentID;
    private String name;

    public Student(String anID, String aName) {
        studentID = anID;
        name = aName;
    }

    public String toString() {
        return "ID: " + studentID + ", Name: " + name;
    }

    public Object getKey() {
        return studentID;
    }

    public int compareTo(Object otherStudentID) {
        /* compare studentID of this student with other studentID
         return value <, ==, > 0 if studentID of this student  is <, ==, > other studentID */
        return (((String) getKey()).compareTo((String) otherStudentID));
    }
}
