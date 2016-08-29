package Employee;

import java.io.Serializable;

public class Employee implements Serializable {

    private String id; // เลขประจําตัวพนักงาน
    private String firstName; // ชื/อ
    private String lastName; // นามสกุล
    private double salary; // เงินเดือน

    public Employee(String idVal, String fnVal, String lnVal, double slrVal) {
        id = idVal;
        firstName = fnVal;
        lastName = lnVal;
        salary = slrVal;
    }

    public String getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public String toString() {
        return "ID: " + id + ": " + firstName + " " + lastName + " Salary = " + salary;
    }
}
