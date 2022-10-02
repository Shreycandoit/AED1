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
    
    private String EmpName;
    private String EmpId;
    private int EmpAge;
    private String EmpGender;
    private String EmpStartDate;
    private String EmpLevel;
    private String EmpTeamInfo;
    private String EmpPositionTitle;
    
    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int EmpAge) {
        this.EmpAge = EmpAge;
    }

    public String getEmpGender() {
        return EmpGender;
    }

    public void setEmpGender(String EmpGender) {
        this.EmpGender = EmpGender;
    }

    public String getEmpStartDate() {
        return EmpStartDate;
    }

    public void setEmpStartDate(String EmpStartDate) {
        this.EmpStartDate = EmpStartDate;
    }

    public String getEmpLevel() {
        return EmpLevel;
    }

    public void setEmpLevel(String EmpLevel) {
        this.EmpLevel = EmpLevel;
    }

    public String getEmpTeamInfo() {
        return EmpTeamInfo;
    }

    public void setEmpTeamInfo(String EmpTeamInfo) {
        this.EmpTeamInfo = EmpTeamInfo;
    }

    public String getEmpPositionTitle() {
        return EmpPositionTitle;
    }

    public void setEmpPositionTitle(String EmpPositionTitle) {
        this.EmpPositionTitle = EmpPositionTitle;
    }
    
    @Override
    public String toString(){
    return EmpName;
    }
}
