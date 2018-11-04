/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Item_Master_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Item_Master_Frame
     */
    
    Connection con;
    Statement st;
    PreparedStatement pstins;
    PreparedStatement pstupd;
    PreparedStatement pstdel;
    PreparedStatement pstqry;
    ResultSet rs;
    
    
    
    
    public Item_Master_Frame() {
        initComponents();
        
        try
        {
   Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/item_master?zeroDateTimeBehavior=convertToNull", "root","");
            pstins=con.prepareStatement("insert into item_master values(?,?,?)");
            pstupd=con.prepareStatement("update item_master set iname=?, rate=? where icode=?");
            pstdel=con.prepareStatement("delete from item_master where icode=?");
            pstqry=con.prepareStatement("select * from item_master where icode=?");
            st=con.createStatement();
             JOptionPane.showMessageDialog(null,"Error!!","sucess", JOptionPane.ERROR_MESSAGE);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
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

        jLabel1 = new javax.swing.JLabel();
        txtICode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmdAdd = new javax.swing.JButton();
        cmdView = new javax.swing.JButton();
        cmdEdit = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Item Code");

        txtICode.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        txtRate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Rate");

        cmdAdd.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cmdAdd.setText("Add");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdView.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cmdView.setText("View");
        cmdView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewActionPerformed(evt);
            }
        });

        cmdEdit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cmdEdit.setText("Edit");
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdDelete.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdView, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(txtRate))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(txtName))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(txtICode, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtICode, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAdd)
                    .addComponent(cmdView)
                    .addComponent(cmdEdit)
                    .addComponent(cmdDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
        try
        {
        //pstqry.setString(1, txtICode.getText());
        rs=st.executeQuery("select * from item_master where icode='"+txtICode.getText()+"'");
        
        if(rs.next()==true)
        {
            JOptionPane.showMessageDialog(null, "ICode Exists!!!", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pstins.setString(1, txtICode.getText());
        pstins.setString(2, txtName.getText());
        pstins.setFloat(3, Float.parseFloat(txtRate.getText()));
        pstins.executeUpdate();
        JOptionPane.showMessageDialog(null,"Error!!","sucess", JOptionPane.ERROR_MESSAGE);
            
        rs.close();
        }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
      
        
        
        
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewActionPerformed
        // TODO add your handling code here:
        try
        {
        rs=st.executeQuery("select * from item_master where icode='"+txtICode.getText()+"'");
        if(rs.next()==true)
        {
            txtName.setText(rs.getString("iname"));
            txtRate.setText(String.valueOf(rs.getFloat("rate")));
            
        }
        rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
          
    }//GEN-LAST:event_cmdViewActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        // TODO add your handling code here:
        try
        {
        pstupd.setString(1, txtName.getText());
        pstupd.setFloat(2, Float.parseFloat(txtRate.getText()));
        pstupd.setString(3, txtICode.getText());
        pstupd.executeUpdate();
             JOptionPane.showMessageDialog(null,"updated!!","updated", JOptionPane.ERROR_MESSAGE);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
    }//GEN-LAST:event_cmdEditActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        
        try
        {
            pstdel.setString(1, txtICode.getText());
            pstdel.executeUpdate();
             JOptionPane.showMessageDialog(null,"deleted!!","deleted", JOptionPane.ERROR_MESSAGE);
            
        }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_cmdDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Item_Master_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item_Master_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item_Master_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item_Master_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item_Master_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdEdit;
    private javax.swing.JButton cmdView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtICode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables
}