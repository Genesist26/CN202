package Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeFile {

    public static void addEmployee(Employee e, String employeeFileName)
            throws IOException, ClassNotFoundException {

        File file = new File(employeeFileName);
        ArrayList<Employee> list;
                
        if (!file.exists()) {
            list = new ArrayList<Employee>();
            list.add(e);
            
            ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream(employeeFileName));
            outObj.writeObject(list);
            outObj.close();
        } else {
            ObjectInputStream inObj = new ObjectInputStream(new FileInputStream(employeeFileName));
            list = (ArrayList<Employee>) inObj.readObject();
            list.add(e);
            inObj.close();

            ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream(employeeFileName));
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
        
        ObjectInputStream inObj = new ObjectInputStream(new FileInputStream(employeeFileName));
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

}
