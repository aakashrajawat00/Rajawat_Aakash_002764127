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
public class humanResource {
    private ArrayList<employeeData> history;
        
        public humanResource(){
            this.history = new ArrayList<employeeData>();
            
        }

    public ArrayList<employeeData> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<employeeData> history) {
        this.history = history;
    }
        
    public employeeData addNew(){
        employeeData newData = new employeeData();
        history.add(newData);
        return newData;
    }        
}
