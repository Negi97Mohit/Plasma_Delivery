/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CovidCentreCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LegalOfficerOrganization;
import Business.Organization.Organization;
import Business.People.Patient;
import Business.People.PatientRequest;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SystemCoordinatorTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import HomePages.TableFormat;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Akshay
 */
public class VolunteerReceiverRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerReceiverRequestJPanel
     */
    private  EcoSystem system;
    private PatientRequest patientRequest;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount userAccount;
    private Network network;
    
    public VolunteerReceiverRequestJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        requestTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populateRequestTable();
    }
  

    private void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) requestTable.getModel();
        
        dtm.setRowCount(0);
        
         for(PatientRequest patientRequest: system.getPatientRequestDirectory().getPatientRequestList()){            
            Object row[] = new Object[4];
            row[0]= patientRequest;
            row[1]= patientRequest.getName();
            row[2]= patientRequest.getContact();
            row[3]= patientRequest.getStatus();
              
            dtm.addRow(row);
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

        buttonReject = new javax.swing.JButton();
        buttonApprove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bloodText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        labConfirmationText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        statusText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblProfilePicture = new javax.swing.JLabel();
        dobDateField = new com.toedter.calendar.JDateChooser();
        diagnosedDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(208, 93, 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonReject.setBackground(new java.awt.Color(31, 31, 31));
        buttonReject.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonReject.setForeground(new java.awt.Color(255, 255, 255));
        buttonReject.setText("Reject");
        buttonReject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonReject.setEnabled(false);
        buttonReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRejectActionPerformed(evt);
            }
        });
        add(buttonReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 780, 100, 40));

        buttonApprove.setBackground(new java.awt.Color(31, 31, 31));
        buttonApprove.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonApprove.setForeground(new java.awt.Color(255, 255, 255));
        buttonApprove.setText("Approve");
        buttonApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonApprove.setEnabled(false);
        buttonApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApproveActionPerformed(evt);
            }
        });
        add(buttonApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 780, 110, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        uidText.setBackground(new java.awt.Color(0, 0, 0));
        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidText.setForeground(new java.awt.Color(255, 255, 255));
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 180, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, 30));

        nameText.setBackground(new java.awt.Color(0, 0, 0));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 190, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, 30));

        ageText.setBackground(new java.awt.Color(0, 0, 0));
        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setForeground(new java.awt.Color(255, 255, 255));
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 190, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact Number");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 0, 0));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.setForeground(new java.awt.Color(255, 255, 255));
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 180, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Email ID");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, 30));

        emailText.setBackground(new java.awt.Color(0, 0, 0));
        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 190, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 70, -1));

        genderText.setBackground(new java.awt.Color(0, 0, 0));
        genderText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderText.setForeground(new java.awt.Color(255, 255, 255));
        add(genderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 180, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Blood group");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, 20));

        bloodText.setBackground(new java.awt.Color(0, 0, 0));
        bloodText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodText.setForeground(new java.awt.Color(255, 255, 255));
        add(bloodText, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 190, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Covid diagnosed date");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 720, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Street address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, -1));

        streetText.setBackground(new java.awt.Color(0, 0, 0));
        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        streetText.setForeground(new java.awt.Color(255, 255, 255));
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 176, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("City");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, -1, -1));

        cityText.setBackground(new java.awt.Color(0, 0, 0));
        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cityText.setForeground(new java.awt.Color(255, 255, 255));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 650, 180, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, -1, -1));

        stateText.setBackground(new java.awt.Color(0, 0, 0));
        stateText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateText.setForeground(new java.awt.Color(255, 255, 255));
        add(stateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 180, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ZipCode");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, -1, -1));

        zipText.setBackground(new java.awt.Color(0, 0, 0));
        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        zipText.setForeground(new java.awt.Color(255, 255, 255));
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 730, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Was your COVID-19 diagnosis confirmed by a lab test?");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, -1, -1));

        jButton3.setBackground(new java.awt.Color(31, 31, 31));
        jButton3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("See Details");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 120, 40));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Patient Request Handling");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1556, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, -1));

        labConfirmationText.setBackground(new java.awt.Color(0, 0, 0));
        labConfirmationText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labConfirmationText.setForeground(new java.awt.Color(255, 255, 255));
        add(labConfirmationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 680, 210, -1));

        requestTable.setBackground(new java.awt.Color(0, 0, 0));
        requestTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        requestTable.setForeground(new java.awt.Color(255, 255, 255));
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.setFocusable(false);
        requestTable.setGridColor(new java.awt.Color(0, 0, 0));
        requestTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        requestTable.setRowHeight(30);
        requestTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(requestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 1130, 240));

        statusText.setBackground(new java.awt.Color(0, 0, 0));
        statusText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        statusText.setForeground(new java.awt.Color(255, 255, 255));
        add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 200, -1));

        jLabel1.setText("Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 11, -1, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        lblProfilePicture.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 350, 180, 170));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 180, 30));

        diagnosedDateChooser.setBackground(new java.awt.Color(0, 0, 0));
        diagnosedDateChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diagnosedDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        add(diagnosedDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 720, 170, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 20, 230));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 860, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COVID History Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Location Details");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApproveActionPerformed
        // TODO add your handling code here:
        if( !statusText.getText().equals("New Request"))
            {
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='red'> can not</font> be approved!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
                
            //    JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
            }
        
        else
        {
        
        Patient patient = system.getPatientDirectory().addPatient();
        patient.setName(nameText.getText());
        patient.setContact(Integer.parseInt(contactText.getText()));  
        
        patient.setReceiverID(uidText.getText()); // UID, receiverID
        patient.setName(nameText.getText()); // Name
       
       
        
        patient.setAge(Integer.parseInt(ageText.getText())); // Age
        patient.setGender(genderText.getText()); // gender
        patient.setBloodGroup(bloodText.getText()); // Blood group
        patient.setStreetAddress(streetText.getText()); // streetAddress
        patient.setCity(cityText.getText()); // city
        patient.setState(stateText.getText()); // state
        patient.setZipCode(Integer.parseInt(zipText.getText())); // zipCode
        patient.setContact(Integer.parseInt(contactText.getText())); // contact
        patient.setEmailID(emailText.getText()); // emailID
        patient.setStatus("Centre Approved"); // status
        patient.setLabConfirmation(true); //  labConfirmation
      
        
        for(PatientRequest patientRequest: system.getPatientRequestDirectory().getPatientRequestList()){                      
        
            if(patientRequest.getReceiverID().equals(uidText.getText())){
            patientRequest.setStatus("Centre Approved");
            dB4OUtil.storeSystem(system);
            }
        }



        // WORK REQUEST
        
        WorkRequest request = new SystemCoordinatorTestWorkRequest();
        
        request.setPatient(patient);
        request.setActionDate(new Date());
        request.setAssigned("Legal Pool");
        request.setSummary("Requested for Plasma Reception");
        request.setStatus("Assigned to Legal Pool");
        
        request.setUserAccount(userAccount);
       
        Enterprise ent = null;
        Organization org = null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("Legal")) {
            
                ent = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        
       
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof LegalOfficerOrganization) {
                org = organization;
                break;
            }
        }
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org.getName());
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            //user.addUserRequest(request);
            
            dB4OUtil.storeSystem(system);
            populateRequestTable();
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='green'> approved</font> successfully!</I></h2></html>"));
           
            //JOptionPane.showMessageDialog(null,"Request Sent Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
        
        
        
        statusText.setText("Centre Approved");
        dB4OUtil.storeSystem(system);
        populateRequestTable();
      //  JOptionPane.showMessageDialog(null,"New patient has been added!");
        
        }
    }//GEN-LAST:event_buttonApproveActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        
        int selectedRow = requestTable.getSelectedRow();
        if(selectedRow < 0){
            
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
            
            //JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{
       //display the details 
            patientRequest = (PatientRequest) requestTable.getValueAt(selectedRow, 0);
            populateRequestDetails(patientRequest);
            buttonApprove.setEnabled(true);
            buttonReject.setEnabled(true);
            
            if(Integer.parseInt(ageText.getText()) < 18)
            {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
            }
            if(labConfirmationText.getText().equals("false"))
            {
            labConfirmationText.setBorder(BorderFactory.createLineBorder(Color.RED));
            labConfirmationText.setForeground(Color.red);
            }
            
            
             dB4OUtil.storeSystem(system);
            
            
        }
    }
        
        private void populateRequestDetails(PatientRequest patientRequest){
            uidText.setText(patientRequest.getReceiverID());
            nameText.setText(patientRequest.getName());
            dobDateField.setDate(patientRequest.getDob());
            diagnosedDateChooser.setDate(patientRequest.getCovidDiagnosedDate());
            ageText.setText(String.valueOf(patientRequest.getAge()));
            genderText.setText(patientRequest.getGender());
            bloodText.setText(patientRequest.getBloodGroup());
            streetText.setText(patientRequest.getStreetAddress());
            cityText.setText(patientRequest.getCity());
            stateText.setText(patientRequest.getState());
            zipText.setText(String.valueOf(patientRequest.getZipCode()));
            contactText.setText(String.valueOf(patientRequest.getContact()));
            emailText.setText(patientRequest.getEmailID());
            statusText.setText(patientRequest.getStatus());
            
            labConfirmationText.setText(String.valueOf(patientRequest.isLabConfirmation()));
            
            
            
            
             if(patientRequest.getdP() !=null){
            //Working line
            byte[] JLabelpictureLabel = patientRequest.getdP();
            ImageIcon i = setPicturebyte(JLabelpictureLabel);
            lblProfilePicture.setIcon(i);
            }
            else{
            System.err.println("No Image");
            }
             
             
            uidText.setEditable(false);
            nameText.setEditable(false);
            ageText.setEditable(false);
            genderText.setEditable(false);
            bloodText.setEditable(false);
            streetText.setEditable(false);
            cityText.setEditable(false);
            stateText.setEditable(false);
            zipText.setEditable(false);
            contactText.setEditable(false);
            emailText.setEditable(false);
            statusText.setEditable(false);
            labConfirmationText.setEditable(false);     
            diagnosedDateChooser.setEnabled(false);
            dobDateField.setEnabled(false);
                   
             
            
        }
        
        
        private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttonRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRejectActionPerformed
        // TODO add your handling code here:
        
       if(!statusText.getText().equals("New Request"))
                  {
                      JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='red'> can not</font> be rejected!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
          
                     // JOptionPane.showMessageDialog(null,"Can Not Reject the Request!");
        }
       else{
        for(PatientRequest patientRequest: system.getPatientRequestDirectory().getPatientRequestList()){                      
        
            if(patientRequest.getName().equals(nameText.getText())){
            statusText.setText("Rejected");
            patientRequest.setStatus("Rejected");
            }}
        
        dB4OUtil.storeSystem(system);   
        populateRequestTable();
        
         JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Request has been<font color='red'> rejected</font>!</I></h2></html>"));
        
        //JOptionPane.showMessageDialog(null,"Rejected the Patient's Request!");
        }
       
        
    }//GEN-LAST:event_buttonRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JTextField bloodText;
    private javax.swing.JButton buttonApprove;
    private javax.swing.JButton buttonReject;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser diagnosedDateChooser;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField genderText;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField labConfirmationText;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField stateText;
    private javax.swing.JTextField statusText;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}
