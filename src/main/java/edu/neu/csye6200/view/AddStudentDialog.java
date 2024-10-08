package edu.neu.csye6200.view;
import edu.neu.csye6200.controller.DB4OUtil;
import edu.neu.csye6200.model.Student;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;


/**
 * @author SanthoshMaddi
 */
public class AddStudentDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddStudent
     */
     DB4OUtil db4OUtil;
    public AddStudentDialog(Vector<Student> studentsList) 
            
    {    //super(parent, modal);
        initComponents();
        lblPhoneWarning.setVisible(false);
        this.studentsList = studentsList;
        db4OUtil = DB4OUtil.getInstance();
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
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtGpa = new javax.swing.JTextField();
        lblGpa = new javax.swing.JLabel();
        lblFatherName = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNum = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        lblPhoneWarning = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        txtMotherName = new javax.swing.JTextField();
        lblFatherName1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Please enter the below details");

        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("First Name");

        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLastName.setText("Last Name");

        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age");

        txtAge.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtGpa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtGpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpaActionPerformed(evt);
            }
        });

        lblGpa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGpa.setText("GPA");

        lblFatherName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFatherName.setText("Father Name");

        txtFatherName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblAddress.setText("Address");

        lblPhoneNum.setText("Phone No");

        txtPhoneNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneNumFocusLost(evt);
            }
        });
        txtPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumKeyTyped(evt);
            }
        });

        lblPhoneWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblPhoneWarning.setText("Invalid Phone Number");

        btnAddStudent.setBackground(new java.awt.Color(255, 102, 102));
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        lblFatherName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFatherName1.setText("Mother Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(btnAddStudent)
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFatherName)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFatherName1)
                            .addComponent(lblGpa)
                            .addComponent(lblLastName)
                            .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNum)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneWarning))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLastName)
                    .addComponent(txtName))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(lblGpa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFatherName)
                    .addComponent(lblFatherName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(lblPhoneNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPhoneWarning)
                .addGap(18, 18, 18)
                .addComponent(btnAddStudent)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed

        String firstName = txtName.getText();
        String lastName = txtLastName.getText();
        String age = txtAge.getText();
        String gpa = txtGpa.getText();
        String fatherName = txtFatherName.getText();
        String motherName = txtMotherName.getText();
        String address = txtAddress.getText();
        String phoneNumber = txtPhoneNum.getText();

        if(firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || gpa.isEmpty() || fatherName.isEmpty() || motherName.isEmpty()||address.isEmpty() || phoneNumber.isEmpty())
        {
            String message = "One or more fields or missing. Please Check";
            JOptionPane.showMessageDialog(this, "Missing Fields", message, 2);
            return;
        }

        if ( !phoneNumber.matches("\\d{10}") )
        {
            String message = "Please enter a valid Phone number!!!";
            JOptionPane.showMessageDialog(this, message, "Invalid Phone Number", 2);
            return;
        }

        int intAge = Integer.parseInt(age);
        if(intAge > 100 ){
            String message = "Please enter a valid age, which is less than 100!";
            JOptionPane.showMessageDialog(this, message, "Invalid Age", 2);
            return;
        }
        Double doubleGpa = Double.valueOf(gpa);
        if(doubleGpa > 4.0 || doubleGpa < 0){
            String message = "Please enter a valid GPA between 0 and 4.0";
            JOptionPane.showMessageDialog(this, message, "Invalid GPA", 2);
            return;
        }
        Student student = new Student(firstName,lastName, intAge, doubleGpa, fatherName, motherName, address,phoneNumber,  new Date());
        studentsList.add(student);
        JOptionPane.showMessageDialog(this, "Added Student Successfully..!", "Added Student", 1);
        dispose();
        db4OUtil.updateStudentList(studentsList);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void txtPhoneNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumKeyReleased
        if(lblPhoneWarning.isVisible() && txtPhoneNum.getText().matches("\\d{10}")){
            lblPhoneWarning.setVisible(false);
            
        }
    }//GEN-LAST:event_txtPhoneNumKeyReleased

    private void txtGpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpaActionPerformed

    private void txtPhoneNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumFocusLost
        // TODO add your handling code here:
        if(! txtPhoneNum.getText().matches("\\d{10}"))
        {
            lblPhoneWarning.setVisible(true);
           
        }
        else{
            lblPhoneWarning.setVisible(false);
            
        }
    }//GEN-LAST:event_txtPhoneNumFocusLost

    private void txtPhoneNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumKeyPressed
        
    }//GEN-LAST:event_txtPhoneNumKeyPressed

    private void txtPhoneNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumKeyTyped
       if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNumKeyTyped


    private Vector<Student> studentsList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblFatherName1;
    private javax.swing.JLabel lblGpa;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblPhoneWarning;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNum;
    // End of variables declaration//GEN-END:variables
}
