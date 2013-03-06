/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

import java.util.*;

/**
 *
 * @author Corbin
 */
public class ListLab2 {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Dave", 26, "1234");
        Employee emp2 = new Employee("Mike", 30, "4321");
        Employee emp3 = new Employee("Joe", 28, "2413");
        Employee emp4 = new Employee("Dan", 35, "1324");
        
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        
        for(Employee s : empList){
            System.out.println(s.getName() + " Employee number: " + s.getEmpId() + " is " + s.getAge() + " years old.");
        }
    }
}
