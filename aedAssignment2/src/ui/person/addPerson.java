/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.person;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.personDirectory;
import ui.mainFrame;

/**
 *
 * @author aakashrajawat
 */

public class addPerson extends javax.swing.JPanel {

    /**
     * Creates new form addPerson
     */
    
    private JPanel rightPanel;
    private personDirectory personDirectory;
    public addPerson(JPanel rightPanel,personDirectory personDirectory) {
        initComponents();
        this.personDirectory= personDirectory;
        this.rightPanel= rightPanel;
        

    }
    
    private void populatePersonsTable(ArrayList<Person> personsList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if(personsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Person's found. Please add" + " Person's", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personsList) {
            Object[] row = new Object[3];
            row[0] = person;
            row[1]= person.getAge();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getPatientID();
            }
            else
            {
                row[2] = "Patient Not Created";
            }
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setText("Person Directory");

        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Person Name", "Age", "Patient ID"
            }
        ));
        jScrollPane1.setViewportView(viewPersonsJTable);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setText("Create Person");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View Person");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnSearch.setText("Search Person");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(31, 31, 31)
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(43, 43, 43)
                .addComponent(btnRefresh)
                .addGap(0, 144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnCreate, btnRefresh, btnSearch, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreate)
                    .addComponent(btnView)
                    .addComponent(btnRefresh))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 370, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnCreate, btnRefresh, btnSearch, btnView});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
      
        
        
        
        enterdataPerson cpJPanel= new enterdataPerson(rightPanel, personDirectory);
        rightPanel.add("cpJPanel", cpJPanel);
        CardLayout layout=(CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout=(CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",  "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass rightPanel and Patient*/
        ViewPersonDetailsJPanel vupersondJPanel= new ViewPersonDetailsJPanel(rightPanel, person,Boolean.FALSE);
        rightPanel.add("vupersondJPanel", vupersondJPanel);
        CardLayout layout=(CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtSearch.setText("");
        populatePersonsTable(personDirectory.getPersonDirectory());
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         String key= txtSearch.getText();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPersons;
        searchPersons=personDirectory.searchPerson(key);
        populatePersonsTable(searchPersons);
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables
}
