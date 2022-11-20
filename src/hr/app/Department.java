/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.app;

/**
 *
 * @author theassembler
 */
public class Department {

    final int capacity = 10;

    private Employee[] emp;

    public void addEmp(Employee[] someEmp) {
        emp = someEmp;
    }

    public Employee[] getEmp() {
        return emp;
    }

    public void noOfEmp() {
        int empno = emp.length;
    }

    public void idEmp() {
        for (Employee id : emp) {
            System.out.println(id.getId() + "," + id.getName() + "," + id.getSalary());
        }
    }

    public Employee getById(int empId) {
        Employee result = null;
        for (Employee emps : emp) {
            if (emps.getId()==empId) {
             result=emps;
            }
        }
        return result;
    }

    public double totalSalary() {
        double total = 0;
        for (Employee salaries : emp) {
            total = total + salaries.getSalary();
        }
        return total;
    }
    public double average = 0;

    public double getAverage() {
        for (Employee avg : emp) {
            average = avg.getSalary() / emp.length;
        }
        return average;
    }
}
