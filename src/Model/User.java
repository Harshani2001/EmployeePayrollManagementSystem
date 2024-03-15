/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String password;
    private String nic;
    private String address;
    private String tpn;
    private String category;
    private String gender;
    private Date startDate;
    private String position;
    private String location;
    private AccessLevel accessLevel;
    private double salary;
    private Salary salaryType;
    
   
    // Constructor
    public User(int id, String name, String password, String nic, String address, String tpn, String category,
                String gender, Date startDate, String position, String location,AccessLevel accessLevel,double salary,Salary salaryType) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.nic = nic;
        this.address = address;
        this.tpn = tpn;
        this.category = category;
        this.gender = gender;
        this.startDate = startDate;
        this.position = position;
        this.location = location;
        this.accessLevel= accessLevel;
        this.salaryType= salaryType;
                   
    }

    public User(int id, String name, String password, String nic, String address, String tpn, String category, String gender, Date startDate, String position, String location, Double salary, AccessLevel accessLevel,Salary salaryType) {
        
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTpn() {
        return tpn;
    }

    public void setTpn(String tpn) {
        this.tpn = tpn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
   public int getAccessLevel(){
       return accessLevel.getAccessId();
       
   }
   public double getSalary(){
       return salary;
   }

    public int getTypeId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}

