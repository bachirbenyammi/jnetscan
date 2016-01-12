package MainPackage;

import MainPackage.*;
import Components.ButtonTabComponent;
import Components.MyTableModel;
import java.awt.event.MouseEvent;
import javax.swing.SwingWorker;
import java.util.*;
import java.util.concurrent.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author  benbac
 */
public class ObjectFrame extends javax.swing.JInternalFrame{

    private MyTableModel tableModal = new MyTableModel();
    public ScanObjects.Scan newScan;
    private MainFrame mainFrame;
    
    /** Creates new form ObjectFrame */
    public ObjectFrame(String title, MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
        jTable1.setModel(tableModal);  
        setTitle(title);
        newScan = new ScanObjects.Scan(this, ScanObjects.ObjectsList.getObject(title));         
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemPing = new javax.swing.JMenuItem();
        jMenuItemTrace = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBrowse = new javax.swing.JMenu();
        jMenuItemExplore = new javax.swing.JMenuItem();
        jMenuItemHttp = new javax.swing.JMenuItem();
        jMenuItemFTP = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItemMsg = new javax.swing.JMenuItem();
        pane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnState = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelHost = new javax.swing.JLabel();
        jProgressBarHosts = new javax.swing.JProgressBar();
        jLabelHostTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelState = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelHostFound = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPortTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelPortFound = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelPort = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBarPorts = new javax.swing.JProgressBar();

        jMenuItemPing.setText("Ping");
        jMenuItemPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPingActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemPing);

        jMenuItemTrace.setText("Trace route");
        jMenuItemTrace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTraceActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemTrace);
        jPopupMenu1.add(jSeparator1);

        jMenuBrowse.setText("Browse");

        jMenuItemExplore.setText("Shared Ressources");
        jMenuItemExplore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExploreActionPerformed(evt);
            }
        });
        jMenuBrowse.add(jMenuItemExplore);

        jMenuItemHttp.setText("as Http Server");
        jMenuItemHttp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHttpActionPerformed(evt);
            }
        });
        jMenuBrowse.add(jMenuItemHttp);

        jMenuItemFTP.setText("as FTP Server");
        jMenuItemFTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFTPActionPerformed(evt);
            }
        });
        jMenuBrowse.add(jMenuItemFTP);

        jPopupMenu1.add(jMenuBrowse);
        jPopupMenu1.add(jSeparator2);

        jMenuItemMsg.setText("Send Message");
        jMenuItemMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMsgActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemMsg);

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("127.0.0.1");
        setMinimumSize(new java.awt.Dimension(0, 0));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnState.setText("Start");
        btnState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateActionPerformed(evt);
            }
        });

        jLabel3.setText("Host:");

        jLabelHost.setText("0/0");

        jProgressBarHosts.setStringPainted(true);

        jLabelHostTime.setText("0/0");

        jLabel4.setText("Time:");

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelState.setText("Ready");

        jLabel1.setText("Status:");

        jLabelHostFound.setText("0/0");

        jLabel5.setText("Found:");

        jLabelPortTime.setText("0/0");

        jLabel6.setText("Time:");

        jLabelPortFound.setText("0/0");

        jLabel7.setText("Found:");

        jLabelPort.setText("0/0");

        jLabel8.setText("Port:");

        jProgressBarPorts.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnState, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPort, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPortFound, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPortTime, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                    .addComponent(jProgressBarHosts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHost, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHostFound, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHostTime, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addComponent(jProgressBarPorts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabelHost, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabelHostTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabelHostFound)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarHosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabelPort, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabelPortTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabelPortFound)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarPorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pane.addTab("Scanner", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateActionPerformed
        if (newScan.isRunning())
        {
            btnState.setText("Start");       
            jLabelState.setText("Stopped");
            newScan.Stop();            
        }
        else
        {
            btnState.setText("Stop"); 
            jLabelState.setText("Scanning ...");        
            InitialData();
            newScan = new ScanObjects.Scan(this, ScanObjects.ObjectsList.getObject(title));              
            UpdateHostsData();             
        }
}//GEN-LAST:event_btnStateActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        newScan.Stop();
        mainFrame.jMenuIPAddress.setEnabled(false);
    }//GEN-LAST:event_formInternalFrameClosed

    private void jMenuItemPingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPingActionPerformed
        ExecuteCmd("Ping ", getSelectedAdr());
    }//GEN-LAST:event_jMenuItemPingActionPerformed

    private void jMenuItemTraceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTraceActionPerformed
        ExecuteCmd("Tracert ", getSelectedAdr());
    }//GEN-LAST:event_jMenuItemTraceActionPerformed

    private void jMenuItemExploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExploreActionPerformed
        ExecuteProcess("Explorer file://" + getSelectedAdr() + "/");
    }//GEN-LAST:event_jMenuItemExploreActionPerformed

    private void jMenuItemHttpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHttpActionPerformed
        ExecuteProcess("Explorer http://" + getSelectedAdr() + "/");
    }//GEN-LAST:event_jMenuItemHttpActionPerformed

    private void jMenuItemFTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFTPActionPerformed
        ExecuteProcess("Explorer ftp://" + getSelectedAdr() + "/");  
    }//GEN-LAST:event_jMenuItemFTPActionPerformed

    private void jMenuItemMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMsgActionPerformed
        String msg = JOptionPane.showInputDialog(ObjectFrame.this, 
            "Type the message you want to send ");
        if (msg == null) return;        
        ExecuteProcess("net send " + getSelectedAdr() + " " + msg);
    }//GEN-LAST:event_jMenuItemMsgActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        mainFrame.jMenuIPAddress.setEnabled(jTable1.getSelectedRowCount() == 1); 
        
        if (evt.getButton() != MouseEvent.BUTTON3)  return;
        if (jTable1.getSelectedRow() == jTable1.rowAtPoint(evt.getPoint()))                  
            jPopupMenu1.show(jTable1, evt.getX(), evt.getY());    
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        mainFrame.jMenuIPAddress.setEnabled(jTable1.getSelectedRowCount() == 1);
    }//GEN-LAST:event_jTable1KeyPressed

    public String getSelectedAdr()
    {
        int index = jTable1.getSelectedRow();
        if (index == -1) return null;
        return tableModal.getValueAt(index, 0).toString();        
    }
    
    public void ExecuteCmd(final String cmd, final String IPAdr)
    {
        if (IPAdr == null) return;
       new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                JTextArea ta = new JTextArea();
                pane.add(cmd + IPAdr + " [loading ...]", ta);
                int index = pane.getTabCount()-1;
                pane.setTabComponentAt(index, new ButtonTabComponent(pane)); 
                Utilities.executeCmd(ta, cmd + IPAdr);
                pane.setTitleAt(index, cmd + IPAdr);
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }.execute();         
    }
    
    public void ExecuteProcess(final String process)
    {
        if (process == null) return;
       new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                Utilities.ExecuteProcess(process);
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }.execute();         
    }

   public  void InitialTableData(String NetAdr, ArrayList<Integer> list, int count)
   {
       tableModal.InitialData(NetAdr, list, count);    
       jTable1.revalidate();        
   }
   
   public void InitialData()
   {
        jLabelPortTime.setText("0/0"); 
        jLabelPort.setText("0/0"); 
        jLabelPortFound.setText("0/0");       
        jLabelHostTime.setText("0/0"); 
        jLabelHost.setText("0/0"); 
        jLabelHostFound.setText("0/0");
        jProgressBarHosts.setValue(0);       
        jProgressBarPorts.setValue(0);
        tableModal.clearData();
        jTable1.revalidate();
   } 
   
   public  void AddNewRow(int index, Object[] vector)
   {
       try {
            tableModal.setValueAt(vector[0], index, 1);
            tableModal.setValueAt(vector[1], index, 2);
            tableModal.setValueAt(vector[2], index, 3);
       } catch (Exception e) 
        {System.out.print(e.getMessage());}
   }
   
   public  void AddPort(int Port, int row, int col)
    { 
      try {       
          String strValue;
            Object value = tableModal.getValueAt(row, col);
            if (value != null)
               strValue = value + " " + String.valueOf(Port);
            else
                strValue = String.valueOf(Port);
              tableModal.setValueAt(strValue, row, col);
       } catch (Exception e) 
        {System.out.println(e.getMessage());}
    }
   
   public  void UpdateHostsInofs(int timeDiff, int timeHostEstim, 
    int currentHost, int foundHosts, int count)
   {            
        jLabelHostTime.setText(String.valueOf(timeDiff / 1000) 
              + "/" + String.valueOf(timeHostEstim / 1000));                
        jLabelHost.setText(String.valueOf(currentHost) 
                    + "/" + String.valueOf(count)); 
        jLabelHostFound.setText(String.valueOf(foundHosts)
                    + "/" + String.valueOf(count));   
        
        jProgressBarHosts.setMaximum(timeHostEstim);
        jProgressBarHosts.setValue(timeDiff);        
   }
   
   public  void UpdatePortsInofs(int timeDiff, int timePortEstim, 
           int currentPort, int foundPorts, int countPorts)
   {            
        jLabelPortTime.setText(String.valueOf(timeDiff / 1000) 
              + "/" + String.valueOf(timePortEstim / 1000));  
        jLabelPort.setText(String.valueOf(currentPort) 
                    + "/" + String.valueOf(countPorts)); 
        jLabelPortFound.setText(String.valueOf(foundPorts)
                    + "/" + String.valueOf(countPorts));  
        
        jProgressBarPorts.setMaximum(timePortEstim);
        jProgressBarPorts.setValue(timeDiff);          
   }   
   
   public void done()
   {
        btnState.setText("Start"); 
        jLabelState.setText("Finished");                           
   }  

   public void UpdateHostsData ()
   {             
        SwingWorker ObjectScanner = new SwingWorker() {
            @Override
            public Void doInBackground(){
                newScan.so.run();
                return null;   
            }               
        };  
        
        SwingWorker PortScanner = new SwingWorker() {
            @Override
            public Void doInBackground(){
                newScan.sp.run();
                return null;   
            }            
        };
        
        // Update hosts, ports, time and progress every helf second
        SwingWorker Updates = new SwingWorker() {
            @Override
            public Void doInBackground(){
                newScan.su.run();
                return null;
            }  
        };  
        
        PortScanner.execute();        
        ObjectScanner.execute(); 
        Updates.execute();   
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelHostFound;
    private javax.swing.JLabel jLabelHostTime;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelPortFound;
    private javax.swing.JLabel jLabelPortTime;
    private javax.swing.JLabel jLabelState;
    private javax.swing.JMenu jMenuBrowse;
    private javax.swing.JMenuItem jMenuItemExplore;
    private javax.swing.JMenuItem jMenuItemFTP;
    private javax.swing.JMenuItem jMenuItemHttp;
    private javax.swing.JMenuItem jMenuItemMsg;
    private javax.swing.JMenuItem jMenuItemPing;
    private javax.swing.JMenuItem jMenuItemTrace;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBarHosts;
    private javax.swing.JProgressBar jProgressBarPorts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane pane;
    // End of variables declaration//GEN-END:variables
}