package view;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.DatabaseModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReportsForm extends javax.swing.JFrame {
    public ReportsForm() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/icons/icon.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxReportType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generate Reports");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reports"));

        jLabel1.setText("Select the Report Type:");

        jComboBoxReportType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "User Details Report", "Student Details Report", "Teacher Details Report", "Task Details Report" }));

        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Generate Reports For This User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxReportType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int report = jComboBoxReportType.getSelectedIndex();
            
            switch (report) {
                case 1 -> {
                    try {
                        JasperDesign jasperdesign = JRXmlLoader.load(getClass().getResourceAsStream("/reports/users.jrxml"));
                        JRDesignQuery designquery = new JRDesignQuery();
                        designquery.setText("""
                                            SELECT 
                                                users.`username`, 
                                                users.`password`, 
                                                users.`type`,
                                                COALESCE(students.`first_name`, teachers.`first_name`) AS `first_name`,
                                                COALESCE(students.`last_name`, teachers.`last_name`) AS `last_name`,
                                                COALESCE(students.`stream`, teachers.`stream`) AS `stream`,
                                                students.`grade`,
                                                students.`full_marks`
                                            FROM 
                                                users 
                                            LEFT JOIN 
                                                students ON users.`username` = students.`username`
                                            LEFT JOIN
                                            \tteachers ON users.`username` = teachers.`username`;""");
                        jasperdesign.setQuery(designquery);
                        JasperReport usersReport = JasperCompileManager.compileReport(jasperdesign);
                        JasperPrint printUsersReport = JasperFillManager.fillReport(usersReport, null, DatabaseModel.createConnection());
                        JasperViewer.viewReport(printUsersReport);
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        JasperDesign jasperdesign = JRXmlLoader.load(getClass().getResourceAsStream("/reports/students.jrxml"));
                        JRDesignQuery designquery = new JRDesignQuery();
                        designquery.setText("SELECT * FROM students");
                        jasperdesign.setQuery(designquery);
                        JasperReport studentsReport = JasperCompileManager.compileReport(jasperdesign);
                        JasperPrint printUsersReport = JasperFillManager.fillReport(studentsReport, null, DatabaseModel.createConnection());
                        JasperViewer.viewReport(printUsersReport);
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        JasperDesign jasperdesign = JRXmlLoader.load(getClass().getResourceAsStream("/reports/teachers.jrxml"));
                        JRDesignQuery designquery = new JRDesignQuery();
                        designquery.setText("SELECT * FROM teachers");
                        jasperdesign.setQuery(designquery);
                        JasperReport teachersReport = JasperCompileManager.compileReport(jasperdesign);
                        JasperPrint printUsersReport = JasperFillManager.fillReport(teachersReport, null, DatabaseModel.createConnection());
                        JasperViewer.viewReport(printUsersReport);
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        JasperDesign jasperdesign = JRXmlLoader.load(getClass().getResourceAsStream("/reports/tasks.jrxml"));
                        JRDesignQuery designquery = new JRDesignQuery();
                        designquery.setText("SELECT * FROM tasks");
                        jasperdesign.setQuery(designquery);
                        JasperReport tasksReport = JasperCompileManager.compileReport(jasperdesign);
                        JasperPrint printUsersReport = JasperFillManager.fillReport(tasksReport, null, DatabaseModel.createConnection());
                        JasperViewer.viewReport(printUsersReport);
                    } catch (JRException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                default -> JOptionPane.showMessageDialog(null, "Select the report type first");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxReportType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
