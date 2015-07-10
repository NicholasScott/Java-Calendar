/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calendar;

import java.awt.Color;
import static java.lang.Math.abs;
import java.util.EventListener;
import java.util.GregorianCalendar;



/**
 *
 * @author Nick
 */
public class CalendarWindow extends javax.swing.JPanel implements EventListener{

    /**
     * Creates new form CalendarWindow
     */
    static int currentDay,currentWeek,currentMonth,currentYear;
    String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    String[] monthsOfYear = {"January","February","March","April","May","June","July","August","September","October","November","December"};
      GregorianCalendar cal = new GregorianCalendar();
    public CalendarWindow() {
        initComponents();
     
        MonthTable.setVisible(false);
        WeekTable.setVisible(false);
        DayTable.setVisible(true);
        YearPane.setVisible(false);
        MonthScrollPane.setVisible(false);
        WeekScrollPane.setVisible(false);
        DayScrollPane.setVisible(true);
        nextMonthButton.setVisible(false);
        previousMonthButton.setVisible(false);
      
        currentDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
        currentWeek = cal.get(GregorianCalendar.WEEK_OF_MONTH);
        currentMonth = cal.get(GregorianCalendar.MONTH);
        currentYear = cal.get(GregorianCalendar.YEAR);
        
        
      
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DayScrollPane = new javax.swing.JScrollPane();
        DayTable = new javax.swing.JTable();
        monthButton = new javax.swing.JButton();
        yearButton = new javax.swing.JButton();
        SortTypeLabel = new javax.swing.JLabel();
        MonthScrollPane = new javax.swing.JScrollPane();
        MonthTable = new javax.swing.JTable();
        weekButton = new javax.swing.JButton();
        WeekScrollPane = new javax.swing.JScrollPane();
        WeekTable = new javax.swing.JTable();
        dayButton = new javax.swing.JButton();
        YearPane = new javax.swing.JPanel();
        nextMonthButton = new javax.swing.JButton();
        previousMonthButton = new javax.swing.JButton();

        DayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00:00", null},
                {"01:00", null},
                {"02:00", null},
                {"03:00", null},
                {"04:00", null},
                {"05:00", null},
                {"06:00", null},
                {"07:00", null},
                {"08:00", null},
                {"09:00", null},
                {"10:00", null},
                {"11:00", null},
                {"12:00", null},
                {"13:00", null},
                {"14:00", null},
                {"15:00", null},
                {"16:00", null},
                {"17:00", null},
                {"18:00", null},
                {"19:00", null},
                {"20:00", null},
                {"21:00", null},
                {"22:00", null},
                {"23:00", null}
            },
            new String [] {
                "Time", "Event"
            }
        ));
        DayTable.getTableHeader().setReorderingAllowed(false);
        DayScrollPane.setViewportView(DayTable);
        if (DayTable.getColumnModel().getColumnCount() > 0) {
            DayTable.getColumnModel().getColumn(0).setMinWidth(60);
            DayTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            DayTable.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        monthButton.setText("Month");
        monthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthButtonActionPerformed(evt);
            }
        });

        yearButton.setText("Year");
        yearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearButtonActionPerformed(evt);
            }
        });

        SortTypeLabel.setText("Day Label");

        MonthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MonthTable.setRowHeight(65);
        MonthScrollPane.setViewportView(MonthTable);

        weekButton.setText("Week");
        weekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekButtonActionPerformed(evt);
            }
        });

        WeekTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ));
        WeekTable.setRowHeight(390);
        WeekScrollPane.setViewportView(WeekTable);

        dayButton.setText("Day");
        dayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout YearPaneLayout = new javax.swing.GroupLayout(YearPane);
        YearPane.setLayout(YearPaneLayout);
        YearPaneLayout.setHorizontalGroup(
            YearPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        YearPaneLayout.setVerticalGroup(
            YearPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );

        nextMonthButton.setText("Next");
        nextMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMonthButtonActionPerformed(evt);
            }
        });

        previousMonthButton.setText("Previous");
        previousMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousMonthButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(previousMonthButton)
                        .addGap(51, 51, 51)
                        .addComponent(SortTypeLabel)
                        .addGap(102, 102, 102)
                        .addComponent(nextMonthButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(YearPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(MonthScrollPane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WeekScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weekButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortTypeLabel)
                    .addComponent(nextMonthButton)
                    .addComponent(previousMonthButton))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DayScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(WeekScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(YearPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MonthScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(yearButton)
                .addGap(34, 34, 34)
                .addComponent(monthButton)
                .addGap(31, 31, 31)
                .addComponent(weekButton)
                .addGap(27, 27, 27)
                .addComponent(dayButton)
                .addGap(180, 180, 180))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearButtonActionPerformed
      
        MonthTable.setVisible(false);
        WeekTable.setVisible(false);
        DayTable.setVisible(false);
        YearPane.setVisible(true);
        MonthScrollPane.setVisible(false);
        WeekScrollPane.setVisible(false);
        DayScrollPane.setVisible(false);
          nextMonthButton.setVisible(false);
        previousMonthButton.setVisible(false);
         SortTypeLabel.setText("Year: " + currentYear);
    }//GEN-LAST:event_yearButtonActionPerformed

    private void weekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekButtonActionPerformed
       
        MonthTable.setVisible(false);
        WeekTable.setVisible(true);
        DayTable.setVisible(false);
        YearPane.setVisible(false);
        MonthScrollPane.setVisible(false);
        WeekScrollPane.setVisible(true);
        DayScrollPane.setVisible(false);
          nextMonthButton.setVisible(false);
        previousMonthButton.setVisible(false);
         SortTypeLabel.setText("Week: " + currentWeek);
    }//GEN-LAST:event_weekButtonActionPerformed

    private void dayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayButtonActionPerformed
        
        MonthTable.setVisible(false);
        WeekTable.setVisible(false);
        DayTable.setVisible(true);
        YearPane.setVisible(false);
        MonthScrollPane.setVisible(false);
        WeekScrollPane.setVisible(false);
        DayScrollPane.setVisible(true);
          nextMonthButton.setVisible(false);
        previousMonthButton.setVisible(false);
        SortTypeLabel.setText(daysOfWeek[currentDay%7] + " " + currentDay + " " + monthsOfYear[currentMonth]);
    }//GEN-LAST:event_dayButtonActionPerformed

    private void monthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthButtonActionPerformed
       
        MonthTable.setVisible(true);
        WeekTable.setVisible(false);
        DayTable.setVisible(false);
        YearPane.setVisible(false);
        MonthScrollPane.setVisible(true);
        WeekScrollPane.setVisible(false);
        DayScrollPane.setVisible(false);
          nextMonthButton.setVisible(true);
        previousMonthButton.setVisible(true);
      refreshMonthPage();
    }//GEN-LAST:event_monthButtonActionPerformed

    private void nextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthButtonActionPerformed
        if(currentMonth == 11){
            cal.add(cal.YEAR, 1);
            currentYear = cal.get(GregorianCalendar.YEAR);
        }
        cal.add(cal.MONTH,1);
        currentMonth = cal.get(GregorianCalendar.MONTH);
        refreshMonthPage();
    }//GEN-LAST:event_nextMonthButtonActionPerformed

    private void previousMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousMonthButtonActionPerformed
     cal.add(cal.MONTH,-1);
     currentMonth = cal.get(GregorianCalendar.MONTH);
     refreshMonthPage();
    }//GEN-LAST:event_previousMonthButtonActionPerformed
    private void refreshMonthPage(){
         for(int i=0;i<=5;i++)
       {
           for(int j=0;j<=6;j++){
          
               MonthTable.setValueAt(null,i,j);
               
           
        }
       }
          SortTypeLabel.setText(currentDay + " " + monthsOfYear[currentMonth] + " " + currentYear);
    
        GregorianCalendar cal2 = new GregorianCalendar(currentYear,currentMonth,1);
        int startOfMonth = cal2.get(GregorianCalendar.DAY_OF_WEEK);
        int numberOfDays = cal2.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        for(int i=0;i<numberOfDays;i++){
            
            int row = (i+startOfMonth-2)/7;
            int column = (i+startOfMonth-2)%7;
            if(column <0){column =6;}

            if(startOfMonth ==2){
                MonthTable.setValueAt(i+1,row+1,column);
            }
            else{
            MonthTable.setValueAt(i+1,row,column);   
        }
        }
       //fill up table of month before values
        cal2.roll(GregorianCalendar.MONTH, -1);
        int previousMonthsDays = cal2.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        for(int i=0;i<startOfMonth-2;i++){    
                int row = 0;
                int column = startOfMonth - i - 3; 
                MonthTable.setValueAt(previousMonthsDays-i,row,column);
        }
        if(startOfMonth ==2){
            int column = 0;
            for(int i = 6; i>=0; i--){ 
            int row = 0;
            MonthTable.setValueAt(previousMonthsDays-i,row,column);
            column++;
            }
        }
        
        
        //fill up end of table for month after
       cal2.roll(GregorianCalendar.MONTH, 2);
       startOfMonth = cal2.get(GregorianCalendar.DAY_OF_WEEK);
       //if next month starts on monday
        for(int i=1; i<=7; i++){
            if(startOfMonth ==2){
                MonthTable.setValueAt(i,5,i-1);
            }
        }
        //if it doesnt start on monday
       int count =1;
       for(int i=0;i<=5;i++)
       {
           for(int j=0;j<=6;j++){
           if(MonthTable.getValueAt(i, j)==null){
               MonthTable.setValueAt(count,i,j);
               count++;
           }
        }
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DayScrollPane;
    private javax.swing.JTable DayTable;
    private javax.swing.JScrollPane MonthScrollPane;
    private javax.swing.JTable MonthTable;
    private javax.swing.JLabel SortTypeLabel;
    private javax.swing.JScrollPane WeekScrollPane;
    private javax.swing.JTable WeekTable;
    private javax.swing.JPanel YearPane;
    private javax.swing.JButton dayButton;
    private javax.swing.JButton monthButton;
    private javax.swing.JButton nextMonthButton;
    private javax.swing.JButton previousMonthButton;
    private javax.swing.JButton weekButton;
    private javax.swing.JButton yearButton;
    // End of variables declaration//GEN-END:variables
}