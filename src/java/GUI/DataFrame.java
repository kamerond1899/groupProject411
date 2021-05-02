/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SharedClasses.Database;
import SharedClasses.Dataset;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author RIVER
 */
public class DataFrame extends javax.swing.JFrame {

    /**
     * Creates new form DataFrame
     */
    public DataFrame() {
        initComponents();
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        comboPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        tableTypeLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        tableTypeCombo = new javax.swing.JComboBox<>();
        stateCombo = new javax.swing.JComboBox<>();
        monthCombo = new javax.swing.JComboBox<>();
        tablePanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 102)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboPanel.setBackground(new java.awt.Color(0, 204, 0));
        comboPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboPanel.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filters:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 255, 102))); // NOI18N

        tableTypeLabel.setBackground(new java.awt.Color(255, 255, 255));
        tableTypeLabel.setText("Table Type:");

        monthLabel.setBackground(new java.awt.Color(255, 255, 255));
        monthLabel.setText("Month:");

        stateLabel.setBackground(new java.awt.Color(255, 255, 255));
        stateLabel.setText("State:");

        updateButton.setBackground(new java.awt.Color(0, 102, 0));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Go");
        updateButton.setFocusable(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        tableTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Monthly Cases And Deaths", "Monthly Vaccine Information", "Monthly Trends" }));
        tableTypeCombo.setFocusable(false);
        tableTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableTypeComboActionPerformed(evt);
            }
        });

        stateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
        stateCombo.setFocusable(false);

        monthCombo.setFocusable(false);
        monthCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tableTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(monthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthCombo, 0, 181, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(stateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(stateLabel)
                    .addComponent(monthLabel)
                    .addComponent(tableTypeLabel)
                    .addComponent(tableTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout comboPanelLayout = new javax.swing.GroupLayout(comboPanel);
        comboPanel.setLayout(comboPanelLayout);
        comboPanelLayout.setHorizontalGroup(
            comboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        comboPanelLayout.setVerticalGroup(
            comboPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comboPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(396, 396, 396))
        );

        jPanel3.add(comboPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 840, 120));

        tablePanel.setBackground(new java.awt.Color(51, 153, 0));
        tablePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(51, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 255, 102))); // NOI18N

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dataTable.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(dataTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(tablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 840, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboActionPerformed

    private void tableTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableTypeComboActionPerformed
        monthCombo.removeAllItems();
        if ("Monthly Cases And Deaths".equals(String.valueOf(tableTypeCombo.getSelectedItem()))){
            monthCombo.addItem("January, 2020");
            monthCombo.addItem("February, 2020");
            monthCombo.addItem("March, 2020");
            monthCombo.addItem("April, 2020");
            monthCombo.addItem("May, 2020");
            monthCombo.addItem("June, 2020");
            monthCombo.addItem("July, 2020");
            monthCombo.addItem("August, 2020");
            monthCombo.addItem("Septemer, 2020");
            monthCombo.addItem("October, 2020");
            monthCombo.addItem("November, 2020");
            monthCombo.addItem("December, 2020");
            monthCombo.addItem("January, 2021");
            monthCombo.addItem("February, 2021");
            monthCombo.addItem("March, 2021");
            monthCombo.addItem("April, 2021");
        } else if ("Monthly Vaccine Information".equals(String.valueOf(tableTypeCombo.getSelectedItem()))) {
            monthCombo.addItem("January, 2021");
            monthCombo.addItem("February, 2021");
            monthCombo.addItem("March, 2021");
            monthCombo.addItem("April, 2021");
            //jComboBox3.addItem("May, 2021");
        } else if ("Monthly Trends".equals(String.valueOf(tableTypeCombo.getSelectedItem()))) {
            monthCombo.addItem("January-February, 2021");
            monthCombo.addItem("February-March, 2021");
            monthCombo.addItem("March-April, 2021");
        }
    }//GEN-LAST:event_tableTypeComboActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Database db = new Database();
        try {
            ArrayList<Dataset> tableRows = new ArrayList<Dataset>();
            tableRows = db.selectData(String.valueOf(tableTypeCombo.getSelectedItem())
                                     ,String.valueOf(monthCombo.getSelectedItem())
                                     ,String.valueOf(stateCombo.getSelectedItem()));
            
            int tableColumnsSize = 0;
            
            System.out.println("test");
            if (tableRows.get(0).getConstructorFlag() == 1) {
                tableColumnsSize = 0;
            } else if (tableRows.get(0).getConstructorFlag() == 2) {
                tableColumnsSize = 4;
            } else if (tableRows.get(0).getConstructorFlag() == 3) {
                tableColumnsSize = 7;
            } else if (tableRows.get(0).getConstructorFlag() == 4) {
                tableColumnsSize = 8;
            }
            
            Object[][] tableRowsObj = new Object[tableRows.size()][tableColumnsSize];
            String[] columnNames = new String[tableColumnsSize];
            
            if (tableColumnsSize == 4) {
                for (int i = 0; i < tableRows.size(); i++){
                    tableRowsObj[i][0] = tableRows.get(i).getDate();
                    tableRowsObj[i][1] = tableRows.get(i).getState();
                    tableRowsObj[i][2] = tableRows.get(i).getCases();
                    tableRowsObj[i][3] = tableRows.get(i).getDeaths();
                }
                columnNames[0] = "Date";
                columnNames[1] = "State";
                columnNames[2] = "Cases";
                columnNames[3] = "Deaths";
                
            } else if (tableColumnsSize == 7) {
                for (int i = 0; i < tableRows.size(); i++){
                    tableRowsObj[i][0] = tableRows.get(i).getDate();
                    tableRowsObj[i][1] = tableRows.get(i).getState();
                    tableRowsObj[i][2] = tableRows.get(i).getTotalVac();
                    tableRowsObj[i][3] = tableRows.get(i).getTotalDis();
                    tableRowsObj[i][4] = tableRows.get(i).getPeopleVac();
                    tableRowsObj[i][5] = tableRows.get(i).getPeopleFullyVac();
                    tableRowsObj[i][6] = tableRows.get(i).getDailyVac();
                }
                columnNames[0] = "Date";
                columnNames[1] = "State";
                columnNames[2] = "Total Vaccines";
                columnNames[3] = "Total Distributed";
                columnNames[4] = "People Vaccinated";
                columnNames[5] = "People Fully Vaccinated";
                columnNames[6] = "Daily Vaccinated";
                
            } else if (tableColumnsSize == 8) {
                for (int i = 0; i < tableRows.size(); i++){
                    tableRowsObj[i][0] = tableRows.get(i).getState();
                    if (tableRows.get(i).getCases() <= 0){ //if cases are negative or zero, keep sign
                        tableRowsObj[i][1] = tableRows.get(i).getCases();
                    } else if (tableRows.get(i).getCases() > 0) { //if cases are positive, add plus sign
                        tableRowsObj[i][1] = "+"+String.valueOf(tableRows.get(i).getCases());
                    }
                    if (tableRows.get(i).getDeaths() <= 0){ //if deaths are negative or zero, keep sign
                        tableRowsObj[i][2] = tableRows.get(i).getDeaths();
                    } else if (tableRows.get(i).getDeaths() > 0) { //if deaths are positive, add plus sign
                        tableRowsObj[i][2] = "+"+String.valueOf(tableRows.get(i).getDeaths());
                    }
                    if (tableRows.get(i).getTotalVac() <= 0){ //if totalVacs are negative or zero, keep sign
                        tableRowsObj[i][3] = tableRows.get(i).getTotalVac();
                    } else if (tableRows.get(i).getTotalVac() > 0) { //if totalVacs are positive, add plus sign
                        tableRowsObj[i][3] = "+"+String.valueOf(tableRows.get(i).getTotalVac());
                    }
                    if (tableRows.get(i).getTotalDis() <= 0){ //if totalDis are negative or zero, keep sign
                        tableRowsObj[i][4] = tableRows.get(i).getTotalDis();
                    } else if (tableRows.get(i).getTotalDis() > 0) { //if totalDis are positive, add plus sign
                        tableRowsObj[i][4] = "+"+String.valueOf(tableRows.get(i).getTotalDis());
                    }
                    if (tableRows.get(i).getPeopleVac() <= 0){ //if peopleVacs are negative or zero, keep sign
                        tableRowsObj[i][5] = tableRows.get(i).getPeopleVac();
                    } else if (tableRows.get(i).getPeopleVac() > 0) { //if peopleVacs are positive, add plus sign
                        tableRowsObj[i][5] = "+"+String.valueOf(tableRows.get(i).getPeopleVac());
                    }
                    if (tableRows.get(i).getPeopleFullyVac() <= 0){ //if peopleFullyVacs are negative or zero, keep sign
                        tableRowsObj[i][6] = tableRows.get(i).getPeopleFullyVac();
                    } else if (tableRows.get(i).getPeopleFullyVac() > 0) { //if peopleFullyVacs are positive, add plus sign
                        tableRowsObj[i][6] = "+"+String.valueOf(tableRows.get(i).getPeopleFullyVac());
                    }
                    if (tableRows.get(i).getDailyVac() <= 0){ //if dailyVacs are negative or zero, keep sign
                        tableRowsObj[i][7] = tableRows.get(i).getDailyVac();
                    } else if (tableRows.get(i).getDailyVac() > 0) { //if dailyVacs are positive, add plus sign
                        tableRowsObj[i][7] = "+"+String.valueOf(tableRows.get(i).getDailyVac());
                    }
                }
                columnNames[0] = "State";
                columnNames[1] = "Cases";
                columnNames[2] = "Deaths";
                columnNames[3] = "Total Vaccines";
                columnNames[4] = "Total Distributed";
                columnNames[5] = "People Vaccinated";
                columnNames[6] = "People Fully Vaccinated";
                columnNames[7] = "Daily Vaccinated";
            }
           
            DataTableModel tableModel = new DataTableModel(columnNames, tableRowsObj){
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            dataTable.setModel(tableModel);
            
            dataTable.setRowHeight(50);
            for(int i = 0; i < tableColumnsSize; i++){
                dataTable.getColumnModel().getColumn(i).setPreferredWidth(150);
            }
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            dataTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            dataTable.setDefaultRenderer(String.class, centerRenderer);
            dataTable.setDefaultRenderer(Integer.class, centerRenderer);
            
        } catch (SQLException ex) {
            Logger.getLogger(DataFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel comboPanel;
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> monthCombo;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JComboBox<String> stateCombo;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JComboBox<String> tableTypeCombo;
    private javax.swing.JLabel tableTypeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
