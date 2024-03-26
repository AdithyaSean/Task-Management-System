package view;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controller.UserController;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.DatabaseModel;

public class AccountForm extends javax.swing.JFrame {

    public AccountForm() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/icons/icon.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldCurrent1 = new javax.swing.JPasswordField();
        jTextFieldNewUsername = new javax.swing.JTextField();
        jButtonResetUsername = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldCurrent2 = new javax.swing.JPasswordField();
        jPasswordFieldNew = new javax.swing.JPasswordField();
        jPasswordFieldNewRenter = new javax.swing.JPasswordField();
        jButtonChangePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        jLabel1.setText("Enter the current password:");

        jLabel2.setText("Enter the new Username:");

        jButtonResetUsername.setText("Reset Username");
        jButtonResetUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonResetUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldCurrent1)
                    .addComponent(jTextFieldNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordFieldCurrent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonResetUsername)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Username", jPanel2);

        jLabel3.setText("Enter the current password:");

        jLabel4.setText("Enter the new password:");

        jLabel5.setText("Renter the new password:");

        jButtonChangePassword.setText("Change Password");
        jButtonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordFieldCurrent2)
                    .addComponent(jPasswordFieldNew)
                    .addComponent(jPasswordFieldNewRenter)
                    .addComponent(jButtonChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldCurrent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldNewRenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonChangePassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetUsernameActionPerformed
        try {
            char[] charCurrentPassword = jPasswordFieldCurrent1.getPassword();
            String currentPassword = new String(charCurrentPassword);
            String newUsername = jTextFieldNewUsername.getText();

            if (currentPassword.equals(UserController.getUserPassword())) {
                try (PreparedStatement statement = DatabaseModel.createConnection().prepareStatement("UPDATE users SET username = ? WHERE username = ?")) {
                    statement.setString(1, newUsername);
                    statement.setString(2, UserController.getUserName());

                    if (statement.executeUpdate() > 0) {
                        if ("Student".equals(UserController.getUserType())) {
                            try (PreparedStatement statement2 = DatabaseModel.createConnection().prepareStatement("UPDATE students SET username = ? WHERE username = ?")) {
                                statement2.setString(1, newUsername);
                                statement2.setString(2, UserController.getUserName());

                                if (statement2.executeUpdate() > 0) {
                                    UserController.setUserName(newUsername);
                                    JOptionPane.showMessageDialog(null, "Username successfully updated");
                                }
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        } else if ("Teacher".equals(UserController.getUserType())) {
                            try (PreparedStatement statement3 = DatabaseModel.createConnection().prepareStatement("UPDATE teachers SET username = ? WHERE username = ?")) {
                                statement3.setString(1, newUsername);
                                statement3.setString(2, UserController.getUserName());

                                if (statement3.executeUpdate() > 0) {
                                    UserController.setUserName(newUsername);
                                    JOptionPane.showMessageDialog(null, "Username successfully updated");
                                }
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid user type");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to update username");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Passwords does not match");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonResetUsernameActionPerformed

    private void jButtonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePasswordActionPerformed
        try {
            char[] charCurrentPassword = jPasswordFieldCurrent2.getPassword();
            String currentPassword = new String(charCurrentPassword);
            char[] charNewPassword = jPasswordFieldNew.getPassword();
            String newPassword = new String(charNewPassword);
            char[] charNewPasswordRenter = jPasswordFieldNewRenter.getPassword();
            String newPasswordRenter = new String(charNewPasswordRenter);

            if (currentPassword.equals(UserController.getUserPassword()) && newPassword.equals(newPasswordRenter)) {
                try (PreparedStatement statement = DatabaseModel.createConnection().prepareStatement("UPDATE users SET password = ? WHERE password = ? AND username = ?")) {
                    statement.setString(1, newPassword);
                    statement.setString(2, currentPassword);
                    statement.setString(3, UserController.getUserName());

                    if (statement.executeUpdate() > 0) {
                        UserController.setUserPassword(newPassword);
                        JOptionPane.showMessageDialog(null, "Password successfully updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to update username");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Passwords does not match");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonChangePasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangePassword;
    private javax.swing.JButton jButtonResetUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldCurrent1;
    private javax.swing.JPasswordField jPasswordFieldCurrent2;
    private javax.swing.JPasswordField jPasswordFieldNew;
    private javax.swing.JPasswordField jPasswordFieldNewRenter;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldNewUsername;
    // End of variables declaration//GEN-END:variables
}
