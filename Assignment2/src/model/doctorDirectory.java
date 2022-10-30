/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aakashrajawat
 */
public class doctorDirectory {
    
    private ArrayList<doctor> doctorDirectory;
    
    public doctorDirectory() {
        doctorDirectory = new ArrayList<>();
    }

    public ArrayList<doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public doctor createAndAddDoctor() {
        doctor Doctor = new doctor();
        doctorDirectory.add(Doctor);
        return Doctor;
    }
    
    

    
}
