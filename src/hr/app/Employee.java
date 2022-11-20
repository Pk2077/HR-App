/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.app;

/**
 *
 * @author theassembler
 */
public class Employee {
    
    private int Id;
    private String name;
    private double salary;

    public Employee(int Id, String name, double salary) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }
    
    

    public int getId() {
        return Id;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String toString() {
        return getId()+","+getName()+","+getSalary();
    }
    
    
}
