/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package edu.neu.csye6200.view;

import edu.neu.csye6200.controller.DB4OUtil;
import edu.neu.csye6200.model.DayCare;
import edu.neu.csye6200.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hiral
 */
public class AddStudentToGroupDialog extends javax.swing.JDialog {
    DayCare daycare;
    ClassRoomsView cview;
    DB4OUtil db40Util = DB4OUtil.getInstance();
    /**
     * Creates new form AddStudentToGroupDialog
     */
    public AddStudentToGroupDialog(DayCare daycare, ClassRoomsView cview) {
        this.daycare = daycare;
        this.cview = cview;
        initComponents();
        postInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectStudentLabel = new javax.swing.JLabel();
        confirmAddToGroup = new javax.swing.JButton();
        selectStudentInput = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        jLabel1.setText("Add Student to group");

        selectStudentLabel.setText("Select Student");

        confirmAddToGroup.setBackground(new java.awt.Color(255, 102, 102));
        confirmAddToGroup.setText("Confirm");
        confirmAddToGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddToGroupActionPerformed(evt);
            }
        });

        selectStudentInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectStudentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStudentInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectStudentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(confirmAddToGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(selectStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectStudentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmAddToGroup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmAddToGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddToGroupActionPerformed
        int studentName = selectStudentInput.getSelectedIndex();
        Student s = daycare.getStudentsList().get(studentName);
        daycare.getClassRoomsList().get(cview.selectedClassIndex).getGroups().get(cview.selectedGroupIndex).getStudentList().add(s);
        cview.populateStudentTable();
        cview.checkMaxLimitForGroup();
        JOptionPane.showMessageDialog(this, "Added Student Successfully");
        ClassRoomsView.handlePostClassroomCreate(this);
        db40Util.storeSystem(daycare);
    }//GEN-LAST:event_confirmAddToGroupActionPerformed

    private void selectStudentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStudentInputActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String name = (String)cb.getSelectedItem();
        cb.setSelectedItem(name);
        cview.populateStudentTable();
    }//GEN-LAST:event_selectStudentInputActionPerformed

    public void setStudentsDropDown(){
        Vector<Student> students = daycare.getStudentsList();
        int n = students.size();
        String[] options = new String[n];
        for(int i = 0; i< n; i++){
            options[i] = students.get(i).getFirstName()+" "+students.get(i).getLastName();
        }
        selectStudentInput.setModel(new javax.swing.DefaultComboBoxModel<>(options));
    }

    public void postInit(){
        setStudentsDropDown();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmAddToGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectStudentInput;
    private javax.swing.JLabel selectStudentLabel;
    // End of variables declaration//GEN-END:variables
}
