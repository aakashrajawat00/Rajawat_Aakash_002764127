/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.person;

import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Person;
import model.integerVerifier;
import model.personDirectory;
import model.stringVerifier;

/**
 *
 * @author aakashrajawat
 */
public class enterdataPerson extends javax.swing.JPanel {

    /**
     * Creates new form enterdataPerson
     */
    
    private personDirectory personDirectory;
    private JPanel rightPanel;
    public enterdataPerson(JPanel rightPanel,personDirectory personDirectory) {
        initComponents();
        this.rightPanel = rightPanel;
        
        this.personDirectory = personDirectory;
        addVerifiers();
    }

     private void addVerifiers() {
        InputVerifier integerVerifier = new integerVerifier();
        personAgeJTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new stringVerifier();
        pesonNameJTextField.setInputVerifier(stringVerifier);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        pesonNameJTextField = new javax.swing.JTextField();
        AgeJLabel = new javax.swing.JLabel();
        personAgeJTextField = new javax.swing.JTextField();
        weightjLabel = new javax.swing.JLabel();
        personWeightJTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        personAddressJTextField = new javax.swing.JTextField();
        cityjLabel = new javax.swing.JLabel();
        personCityJTextField = new javax.swing.JTextField();
        personCommunityJTextField = new javax.swing.JLabel();
        personCommunityjComboBox = new javax.swing.JComboBox<>();
        backJButton = new javax.swing.JButton();
        addPersonJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Person Profile");

        patientNameJLabel.setText("Person Name: ");

        AgeJLabel.setText("Age : ");

        weightjLabel.setText("Weight: ");

        personWeightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personWeightJTextFieldActionPerformed(evt);
            }
        });

        addressjLabel.setText("Address:");

        cityjLabel.setText("City:");

        personCityJTextField.setEditable(false);
        personCityJTextField.setText("Boston");

        personCommunityJTextField.setText("Community:");

        personCommunityjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roxbury", "Fenway", "Downtown", "Kenmore" }));
        personCommunityjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCommunityjComboBoxActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addPersonJButton.setText("Create Profile");
        addPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeJLabel)
                    .addComponent(patientNameJLabel)
                    .addComponent(weightjLabel)
                    .addComponent(addressjLabel)
                    .addComponent(cityjLabel)
                    .addComponent(personCommunityJTextField))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(personAgeJTextField)
                            .addComponent(pesonNameJTextField)
                            .addComponent(personWeightJTextField)
                            .addComponent(personAddressJTextField)
                            .addComponent(personCityJTextField)
                            .addComponent(personCommunityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(addPersonJButton)))
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personWeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressjLabel)
                    .addComponent(personAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityjLabel)
                    .addComponent(personCityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personCommunityJTextField)
                    .addComponent(personCommunityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addPersonJButton))
                .addGap(363, 363, 363))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personWeightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personWeightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personWeightJTextFieldActionPerformed

    private void personCommunityjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCommunityjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personCommunityjComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    
        private void clearFields()
    {
        pesonNameJTextField.setText("");
        personAgeJTextField.setText("");
        personWeightJTextField.setText("");
        personAddressJTextField.setText("");
        personCityJTextField.setText("");
    }
    private Boolean checkBlankInput()
    {
        if(pesonNameJTextField.getText().length()==0
                ||personAgeJTextField.getText().length()==0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    
    private void addPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput()==Boolean.TRUE)
        {
            Person person=personDirectory.createAndAddPerson();
            person.setPersonName(pesonNameJTextField.getText());
            person.setAge(Integer.parseInt(personAgeJTextField.getText()));
            person.setWeight(Integer.parseInt(personWeightJTextField.getText()));
            person.setCommunity((String)personCommunityjComboBox.getSelectedItem());
            person.setCity(personCityJTextField.getText());
            person.setAddress(personAddressJTextField.getText());

            JOptionPane.showMessageDialog(this, "Person added!!", "Update",JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPersonJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JButton addPersonJButton;
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField personAddressJTextField;
    private javax.swing.JTextField personAgeJTextField;
    private javax.swing.JTextField personCityJTextField;
    private javax.swing.JLabel personCommunityJTextField;
    private javax.swing.JComboBox<String> personCommunityjComboBox;
    private javax.swing.JTextField personWeightJTextField;
    private javax.swing.JTextField pesonNameJTextField;
    private javax.swing.JLabel weightjLabel;
    // End of variables declaration//GEN-END:variables
}
