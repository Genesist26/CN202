package Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeFile {

    public static void addEmployee(Employee e, String employeeFileName)
            throws IOException, ClassNotFoundException {

        File file = new File(employeeFileName);

        if (!file.exists()) {
            ArrayList<Employee> list = new ArrayList<Employee>();
            list.add(e);

            FileOutputStream out = new FileOutputStream(employeeFileName);
            ObjectOutputStream outObj = new ObjectOutputStream(out);
            outObj.writeObject(list);
            outObj.close();
        } else {

            FileInputStream in = new FileInputStream(employeeFileName);
            ObjectInputStream inObj = new ObjectInputStream(in);
            ArrayList<Employee> list = (ArrayList<Employee>) inObj.readObject();
            list.add(e);
            inObj.close();

            FileOutputStream out = new FileOutputStream(employeeFileName);
            ObjectOutputStream outObj = new ObjectOutputStream(out);
            outObj.writeObject(list);
            outObj.close();

        }

    }

    public static boolean print(String employeeFileName)
            throws IOException, ClassNotFoundException {
        File file = new File(employeeFileName);

        if (!file.exists()) {
            return false;
        }
        
        FileInputStream in = new FileInputStream(employeeFileName);
        ObjectInputStream inObj = new ObjectInputStream(in);
        ArrayList<Employee> list = new ArrayList<Employee>();
        list = (ArrayList<Employee>) inObj.readObject();
        
        for(Employee e : list)
            System.out.println(e);
        
        inObj.close();
        
        return true;

    }

    public static boolean sort(String employeeFileName)
            throws IOException, ClassNotFoundException {
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e1 = new Employee("001", "A", "B", 10000.0);
        Employee e2 = new Employee("002", "C", "D", 5000.0);

        try {
            EmployeeFile.addEmployee(e1, "employee.dat");
            EmployeeFile.addEmployee(e2, "employee.dat");
            
            boolean b = EmployeeFile.print("employee.dat");
            
        } catch (Exception ex) {
            System.out.println("Catched");
        }

    }
}
