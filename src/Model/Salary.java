/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Salary {
    private int salaryId;
    private String salaryType;

    // Constructor
    public Salary(int salaryId, String salaryType) {
        this.salaryId = salaryId;
        this.salaryType = salaryType;
    }

    // Getters and setters
    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }
    
}
