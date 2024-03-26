package view;

import javax.swing.JOptionPane;
import controller.TaskController;
import controller.UserController;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/icons/icon.png")).getImage();
        this.setIconImage(icon);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonUsers = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jButtonReports = new javax.swing.JButton();
        jButtonAccount = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldTaskName = new javax.swing.JTextField();
        jButtonAddTask = new javax.swing.JButton();
        jButtonRemoveTask = new javax.swing.JButton();
        jButtonEditTask = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxDeadline = new javax.swing.JComboBox<>();
        jComboBoxStream = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTaskList = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jCalendar = new com.toedter.calendar.JCalendar();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaTaskDetails = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuEdit = new javax.swing.JMenu();
        jMenuView = new javax.swing.JMenu();
        jMenuUsers = new javax.swing.JMenu();
        jMenuSettings = new javax.swing.JMenu();
        jMenuReports = new javax.swing.JMenu();
        jMenuAccount = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Management System");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 515));

        jButtonNew.setText("New");
        jButtonNew.setMaximumSize(new java.awt.Dimension(76, 76));
        jButtonNew.setMinimumSize(new java.awt.Dimension(76, 76));
        jButtonNew.setPreferredSize(new java.awt.Dimension(76, 76));
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonUsers.setText("Users");
        jButtonUsers.setMaximumSize(new java.awt.Dimension(76, 76));
        jButtonUsers.setMinimumSize(new java.awt.Dimension(76, 76));
        jButtonUsers.setPreferredSize(new java.awt.Dimension(76, 76));
        jButtonUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsersActionPerformed(evt);
            }
        });

        jButtonSettings.setText("Settings");
        jButtonSettings.setMaximumSize(new java.awt.Dimension(76, 76));
        jButtonSettings.setMinimumSize(new java.awt.Dimension(76, 76));
        jButtonSettings.setPreferredSize(new java.awt.Dimension(76, 76));
        jButtonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingsActionPerformed(evt);
            }
        });

        jButtonReports.setText("Reports");
        jButtonReports.setMaximumSize(new java.awt.Dimension(76, 76));
        jButtonReports.setMinimumSize(new java.awt.Dimension(76, 76));
        jButtonReports.setPreferredSize(new java.awt.Dimension(76, 76));
        jButtonReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportsActionPerformed(evt);
            }
        });

        jButtonAccount.setText("Account");
        jButtonAccount.setMaximumSize(new java.awt.Dimension(76, 76));
        jButtonAccount.setMinimumSize(new java.awt.Dimension(76, 76));
        jButtonAccount.setPreferredSize(new java.awt.Dimension(76, 76));
        jButtonAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccountActionPerformed(evt);
            }
        });

        jButtonLogout.setText("Logout");
        jButtonLogout.setMaximumSize(new java.awt.Dimension(76, 76));
        jButtonLogout.setMinimumSize(new java.awt.Dimension(76, 76));
        jButtonLogout.setPreferredSize(new java.awt.Dimension(76, 76));
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Tasks"));

        jTextFieldTaskName.setToolTipText("Enter the task name");

        jButtonAddTask.setText("Add Task");
        jButtonAddTask.setMaximumSize(new java.awt.Dimension(100, 22));
        jButtonAddTask.setMinimumSize(new java.awt.Dimension(100, 22));
        jButtonAddTask.setPreferredSize(new java.awt.Dimension(100, 22));
        jButtonAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTaskActionPerformed(evt);
            }
        });

        jButtonRemoveTask.setText("Remove Task");
        jButtonRemoveTask.setMaximumSize(new java.awt.Dimension(100, 22));
        jButtonRemoveTask.setMinimumSize(new java.awt.Dimension(100, 22));
        jButtonRemoveTask.setPreferredSize(new java.awt.Dimension(100, 22));
        jButtonRemoveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveTaskActionPerformed(evt);
            }
        });

        jButtonEditTask.setText("Edit Task");
        jButtonEditTask.setMaximumSize(new java.awt.Dimension(100, 22));
        jButtonEditTask.setMinimumSize(new java.awt.Dimension(100, 22));
        jButtonEditTask.setPreferredSize(new java.awt.Dimension(100, 22));
        jButtonEditTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTaskActionPerformed(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.setMaximumSize(new java.awt.Dimension(100, 22));
        jButtonRefresh.setMinimumSize(new java.awt.Dimension(100, 22));
        jButtonRefresh.setPreferredSize(new java.awt.Dimension(100, 22));
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTaskName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAddTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextFieldTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemoveTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Tasks"));
        jPanel3.setPreferredSize(new java.awt.Dimension(322, 79));

        jComboBoxDeadline.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Set Deadline", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", " " }));

        jComboBoxStream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Set Stream", "Mathematics", "Science", "Arts", "Technology", "Commerce" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxStream, javax.swing.GroupLayout.Alignment.TRAILING, 0, 300, Short.MAX_VALUE)
                    .addComponent(jComboBoxDeadline, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jComboBoxDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxStream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Task List"));

        jTableTaskList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issued By", "Status", "Task", "Deadline"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTaskList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Calendar"));
        jPanel5.setPreferredSize(new java.awt.Dimension(322, 283));

        jCalendar.setPreferredSize(new java.awt.Dimension(300, 254));
        jCalendar.setWeekOfYearVisible(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCalendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Task Details"));
        jPanel6.setPreferredSize(new java.awt.Dimension(322, 141));

        jTextAreaTaskDetails.setColumns(20);
        jTextAreaTaskDetails.setRows(5);
        jScrollPane3.setViewportView(jTextAreaTaskDetails);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jMenuFile.setText("File");
        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuBar1.add(jMenuEdit);

        jMenuView.setText("View");
        jMenuBar1.add(jMenuView);

        jMenuUsers.setText("Users");
        jMenuBar1.add(jMenuUsers);

        jMenuSettings.setText("Settings");
        jMenuBar1.add(jMenuSettings);

        jMenuReports.setText("Reports");
        jMenuBar1.add(jMenuReports);

        jMenuAccount.setText("Account");
        jMenuBar1.add(jMenuAccount);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButtonUsersActionPerformed(java.awt.event.ActionEvent evt) {
        if ("Admin".equals(UserController.getUserType())) {
            new UsersForm().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Admin access needed to perform this function");
        }
    }

    private void jButtonAccountActionPerformed(java.awt.event.ActionEvent evt) {
        new AccountForm().setVisible(true);
    }

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        new LoginForm().setVisible(true);
        dispose();
    }

    private void jButtonSettingsActionPerformed(java.awt.event.ActionEvent evt) {
        new SettingsForm().setVisible(true);
    }

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {
        LoginForm newLoginForm = new LoginForm();
        newLoginForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        newLoginForm.setVisible(true);
    }

    private void jButtonReportsActionPerformed(java.awt.event.ActionEvent evt) {
        if ("Admin".equals(UserController.getUserType())) {
            new ReportsForm().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Admin access needed to perform this function");
        }
    }

    private void jButtonEditTaskActionPerformed(java.awt.event.ActionEvent evt) {
        new EditTaskForm().setVisible(true);
    }

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        TaskController.loadTableTasksList(jTableTaskList);
    }

    private void jButtonAddTaskActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldTaskName.getText().isBlank() || jComboBoxDeadline.getSelectedIndex() == 0 || jComboBoxStream.getSelectedIndex() == 0 || jTextAreaTaskDetails.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please fill all the necessary fields");
        } else {
            String issued_by = UserController.getUserName();
            String status = "Pending";
            String task = jTextFieldTaskName.getText();
            String details = jTextAreaTaskDetails.getText();
            String deadline = jComboBoxDeadline.getSelectedItem().toString();
            String stream = jComboBoxStream.getSelectedItem().toString();

            if (TaskController.insertTask(issued_by, status, task, details, deadline, stream)) {
                TaskController.loadTableTasksList(jTableTaskList);
                jTextFieldTaskName.setText("");
                jTextAreaTaskDetails.setText("");
                jComboBoxDeadline.setSelectedIndex(0);
                jComboBoxStream.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Task successfully inserted");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert the task");
            }
        }
    }

    private void jButtonRemoveTaskActionPerformed(java.awt.event.ActionEvent evt) {
        if (!"Student".equals(UserController.getUserType())) {
            String task = jTableTaskList.getValueAt(jTableTaskList.getSelectedRow(), 2).toString();

            if (TaskController.removeTask(task)) {
                TaskController.loadTableTasksList(jTableTaskList);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete the task");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Students can not remove tasks");
        }
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        TaskController.loadTableTasksList(jTableTaskList);
    }

    private javax.swing.JButton jButtonAccount;
    private javax.swing.JButton jButtonAddTask;
    private javax.swing.JButton jButtonEditTask;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRemoveTask;
    private javax.swing.JButton jButtonReports;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JButton jButtonUsers;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JComboBox<String> jComboBoxDeadline;
    private javax.swing.JComboBox<String> jComboBoxStream;
    private javax.swing.JMenu jMenuAccount;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuReports;
    private javax.swing.JMenu jMenuSettings;
    private javax.swing.JMenu jMenuUsers;
    private javax.swing.JMenu jMenuView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableTaskList;
    private javax.swing.JTextArea jTextAreaTaskDetails;
    private javax.swing.JTextField jTextFieldTaskName;
}