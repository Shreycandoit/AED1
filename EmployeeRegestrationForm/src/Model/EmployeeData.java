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
    
    private ArrayList<Employee> EmployeeData;
    
    public EmployeeData(){
        this.EmployeeData = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeData() {
        return EmployeeData;
    }

    public void setEmployeeData(ArrayList<Employee> EmployeeData) {
        this.EmployeeData = EmployeeData;
    }
    
}
