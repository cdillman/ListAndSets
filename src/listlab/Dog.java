/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

/**
 *
 * @author Corbin
 */
public class Dog {
    private String name;
    private int age;
    private String id;

    public Dog(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
