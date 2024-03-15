/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class AccessLevel {
    private int typeId;
    private String accessType;

    // Constructor
    public AccessLevel(int typeId, String accessType) {
        this.typeId = typeId;
        this.accessType = accessType;
    }

    // Getters and setters
    public int getTypeId() {
        return typeId;
    }


    public String getAccessType() {
        return accessType;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    int getAccessId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
