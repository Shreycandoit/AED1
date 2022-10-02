/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EmployeeData {
    
    private ArrayList<Employee> EmployeeDataList;
    
    public EmployeeData(){
        this.EmployeeDataList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeData() {
        return EmployeeDataList;
    }

    public void setEmployeeData(ArrayList<Employee> EmployeeData) {
        this.EmployeeDataList = EmployeeData;
    }
    
    public Employee addNewEmployee()
    {
        Employee newEmployee = new Employee();
        EmployeeDataList.add(newEmployee);
        return newEmployee;
        
    }
    
    public void deleteEmp(Employee emp){
        EmployeeDataList.remove(emp);
    }
}
