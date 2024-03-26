package view;

import javax.swing.JOptionPane;

import controller.UpdateMarksController;
import controller.TaskController;
import controller.UserController;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;

public class EditTaskForm extends javax.swing.JFrame {
    public EditTaskForm() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/icons/icon.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewTask = new javax.swing.JTable();
        jButtonComplete = new javax.swing.JButton();
        jTextFieldDetails = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Task");
        setMinimumSize(new java.awt.Dimension(720, 256));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("View Task"));

        jTableViewTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Issued By", "Status", "Task", "Details", "Deadline", "Stream", "Done By", "Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableViewTask);

        jButtonComplete.setText("Complete");
        jButtonComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonComplete)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComplete)
                    .addComponent(jTextFieldDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TaskController.loadTableViewTask(jTableViewTask);
    }//GEN-LAST:event_formWindowActivated

    private void jButtonCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompleteActionPerformed
        try {
            String userType = UserController.getUserType();
            int id = Integer.parseInt(jTableViewTask.getValueAt(jTableViewTask.getSelectedRow(), 0).toString());
            String issued_by = jTableViewTask.getValueAt(jTableViewTask.getSelectedRow(), 1).toString();
            String status = "Complete";
            String task = jTableViewTask.getValueAt(jTableViewTask.getSelectedRow(), 3).toString();
            String details = jTextFieldDetails.getText();
            String deadline = jTableViewTask.getValueAt(jTableViewTask.getSelectedRow(), 5).toString();
            String stream = jTableViewTask.getValueAt(jTableViewTask.getSelectedRow(), 6).toString();
            String done_byCurrentUser = UserController.getUserName();
            String done_by = jTableViewTask.getValueAt(jTableViewTask.getSelectedRow(), 7).toString();
            int marks = Integer.parseInt(jTableViewTask.getValueAt(jTableViewTask.getSelectedRow(), 8).toString());

            if ("Student".equals(userType)) {
                if (TaskController.completeTaskStudent(issued_by, status, task, details, deadline, stream, done_byCurrentUser)) {
                    if(!TaskController.loadTableViewTask(jTableViewTask)) {
                        JOptionPane.showMessageDialog(null, "Failed to load jTable");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to complete the task");
                }
            } else {
                if (TaskController.completeTaskTeacher(marks, id)) {
                    if (!TaskController.loadTableViewTask(jTableViewTask)) {
                        JOptionPane.showMessageDialog(null, "Failed to load jTable");
                    } else {
                        if (!UpdateMarksController.updateMarks(done_by, marks)) {
                            JOptionPane.showMessageDialog(null, "Failed to update marks to the database");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update the task");
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonCompleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComplete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewTask;
    private javax.swing.JTextField jTextFieldDetails;
    // End of variables declaration//GEN-END:variables
}
