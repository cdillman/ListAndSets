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
public class ListLab3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Dave", 26, "1234");
        Employee emp2 = new Employee("Mike", 30, "4321");
        Employee emp3 = new Employee("Joe", 28, "2413");
        Employee emp4 = new Employee("Dan", 35, "1324");
        
        Dog d1 = new Dog("Kc", 3, "1432");
        Dog d2 = new Dog("Harly", 14, "3214");
        Dog d3 = new Dog("Marly", 8, "4123");
        Dog d4 = new Dog("Sand Man", 12, "2413");
        
        List<Dog> dogList = new ArrayList<>();
        
        dogList.add(d1);
        dogList.add(d2);
        dogList.add(d3);
        dogList.add(d4);
        
        List<Employee> empList = new ArrayList<>();
        
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        
        for(Dog d : dogList){
            System.out.println("Dog name:" + d.getName());
       
        } 
        for (Employee e : empList){
            System.out.println("Employee name: " + e.getName());
        }
        
    }
}
