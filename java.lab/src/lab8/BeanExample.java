/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author DELL
 */
public class BeanExample {
    // Private fields

    private String name;
    private int age;
    private String address;

    // Default constructor (required)
    public BeanExample() {
    }

    // Constructor with parameters
    public BeanExample(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        BeanExample p1 = new BeanExample();
        p1.setAddress("ktm");
        System.out.println(p1.getAddress());

    }

}
