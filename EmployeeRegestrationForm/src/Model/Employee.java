/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Employee {
    
    public String empName;
    public String empId;
    public int empAge;
    public String empGender;
    public String empStartDate;
    public String empLevel;
    public String empTeamInfo;
    public String empPositionTitle;
    public String empPhoneNumber;
    public String empEmail;
    public String empPicture;
    
    public Employee(String empName,String empId,int empAge,String empGender,String empStartDate,String empLevel,String empTeamInfo,String empPositionTitle,String empPhoneNumber,String empEmail,String empPicture)
    {
        this.empName=empName;
        this.empId=empId;
        this.empAge=empAge;
        this.empGender=empGender;
        this.empStartDate=empStartDate;
        this.empLevel=empLevel;
        this.empTeamInfo=empTeamInfo;
        this.empPositionTitle=empPositionTitle;
        this.empPhoneNumber=empPhoneNumber;
        this.empEmail=empEmail;
        this.empPicture=empPicture;
        
    }
    
}
