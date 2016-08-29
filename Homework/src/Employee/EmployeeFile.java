package Employee;

import java.io.*;

public class EmployeeFile {

    public static void addEmployee(Employee e, String employeeFileName)
            throws IOException, ClassNotFoundException {
    }

    public static boolean print(String employeeFileName)
            throws IOException, ClassNotFoundException {
        File file = new File(employeeFileName);
        
        if(!file.exists())
            return false;
        
        return true;
        
    }

    public static boolean sort(String employeeFileName)
            throws IOException, ClassNotFoundException {
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Employee e = new Employee("001", "A", "B", 10000.0);
        
        boolean b = EmployeeFile.print("employee.dat");
        System.out.println(b);
    }
}
