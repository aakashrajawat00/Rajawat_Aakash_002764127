/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aakashrajawat
 */
public class Patient {
    private String patientID;
    private String primaryDoctorName;
    private String prefferedPharmacy;
    private vitalSignhistory vitalSignHistory;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }

    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }

    public vitalSignhistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(vitalSignhistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    
    
    
}
