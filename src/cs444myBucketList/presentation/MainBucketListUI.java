/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs444myBucketList.presentation;

import cs444myBucketList.domain.BucketListItem;
import cs444myBucketList.domain.*;
import cs444myBucketList.service.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carri
 */
public class MainBucketListUI extends javax.swing.JFrame {
    
    private Account account = null;                 //did this here and in CreateBucketListItemUI because I need the account on both windows(UI)
    private BucketListTableModel model = new BucketListTableModel();  
    private int selectedRow = -1;
    
    
    public void setAccount(Account account){
        this.account = account;
        
        this.account = account;
        model.setBucketListItems(account.getBucketListItems());
        
    }

    

    /**
     * Creates new form MainBucketListUI
     */
    public MainBucketListUI() {
        initComponents();
        
        bucketListTable.setModel(model);
        model.fireTableDataChanged();       //I have to do this instead of the the create button (maybe UI)
        
        bucketListTable.addMouseListener(new java.awt.event.MouseAdapter() {        //on click listner
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                int row = bucketListTable.rowAtPoint(evt.getPoint());
                if(row >= 0){
                    selectedRow = row;
                    System.out.println("***cliked row: " + row);
                    
                }
            }
        
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bucketListTable = new javax.swing.JTable();
        createBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        retrieveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        trackProgressBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Main Menu"));

        bucketListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Estimated Completion Date", "Completed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bucketListTable);
        if (bucketListTable.getColumnModel().getColumnCount() > 0) {
            bucketListTable.getColumnModel().getColumn(0).setResizable(false);
            bucketListTable.getColumnModel().getColumn(1).setResizable(false);
            bucketListTable.getColumnModel().getColumn(2).setResizable(false);
        }

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        retrieveBtn.setText("Item Details");
        retrieveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        trackProgressBtn.setText("Track Progress");
        trackProgressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackProgressBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(retrieveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(trackProgressBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(retrieveBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(trackProgressBtn))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(logoutBtn)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane optionPane = new JOptionPane();
        
        if(selectedRow >= 0){
            int selectedOption = optionPane.showConfirmDialog(null,"Delete the selected row?", "Yes/No",JOptionPane.YES_NO_CANCEL_OPTION);
            if(selectedOption == JOptionPane.YES_OPTION){
                account.getBucketListItems().remove(selectedRow);
                model.fireTableDataChanged();
                
            }
        }
        
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void trackProgressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackProgressBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BucketListProgressUI bar = new BucketListProgressUI();
        bar.setProgressBar(account);
        bar.setVisible(true);
        
        
    }//GEN-LAST:event_trackProgressBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CreateBucketListItemUI createBucketListItemUI = new CreateBucketListItemUI();                        //directs you to create bucketList UI
        createBucketListItemUI.setAccount(account);                                             //send users accounts to createBucketListItemUI
        createBucketListItemUI.setVisible(true); 
   
    }//GEN-LAST:event_createBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       
        if(selectedRow >= 0){
            //BucketListItem bucketListItem = account.getBucketListItems().get(selectedRow);
            //account.getBucketListItems().get(selectedRow).setItemName(model.getValueAt(selectedRow, 0).toString());
            //account.getBucketListItems().get(selectedRow).setEstCompletionDate(model.getValueAt(selectedRow, 1).toString());
            //account.getBucketListItems().get(selectedRow).setIsCompleted(model.getValueAt(selectedRow, 2).toString());
            
            
            this.setVisible(false);
            UpdateBucketListItemUI updateUI = new UpdateBucketListItemUI();
            updateUI.setAccountBucketListValue(account,selectedRow);
            updateUI.setVisible(true);
            
            
            
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void retrieveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveBtnActionPerformed
        // TODO add your handling code here:
        
        try{
            this.setVisible(false);
            RetrieveBucketListItemUI retrieveUI = new RetrieveBucketListItemUI();
            retrieveUI.setAccountBucketListValue(account,selectedRow);
            retrieveUI.setVisible(true);
        }catch(Exception e){
            System.out.println("ERROR*** There might not be a item in the list " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_retrieveBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginUI bar = new LoginUI();
        bar.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainBucketListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainBucketListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainBucketListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainBucketListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainBucketListUI().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bucketListTable;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton retrieveBtn;
    private javax.swing.JButton trackProgressBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
