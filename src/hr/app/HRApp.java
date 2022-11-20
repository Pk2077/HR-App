/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hr.app;

/**
 *
 * @author theassembler
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("HR App is Starting");
        Department dep = new Department();

        Employee E1 = new Employee(01, "praveen", 21000);
        Employee E2 = new Employee(02, "praveen", 21000);
        Employee E3 = new Employee(03, "praveen", 21000);
        Employee E4 = new Employee(04, "praveen", 21000);
        Employee E5 = new Employee(05, "praveen", 21000);
        Employee E6 = new Employee(06, "praveen", 21000);
        Employee E7 = new Employee(07, "praveen", 21000);
        Employee E8 = new Employee(14, "pk", 18000);
        Employee E9 = new Employee(15, "praveen", 21000);
        Employee E10 = new Employee(10, "praveen", 21000);

        Employee[] no = {E1, E2, E3, E4, E5, E6, E7, E8, E9, E10};
        dep.addEmp(no);
        
        for(Employee deps:dep.getEmp()){
        System.out.println(deps);
        }
        
        System.out.println(dep.getById(10));
        
        
        System.out.println(dep.totalSalary());
        System.out.println(dep.getAverage());
    }
    

}
