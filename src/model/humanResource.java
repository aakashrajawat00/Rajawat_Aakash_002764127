
package model;

import java.util.ArrayList;

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

    public void deleteColumns(employeeData ed) {
        history.remove(ed);
    }
}
