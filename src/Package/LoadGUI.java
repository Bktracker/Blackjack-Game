 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import Classes.Game;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author BK
 */
public class LoadGUI extends javax.swing.JFrame {

    Game loaded;
    StartGUI stg = null;
    SettingsGUI seg = null;
    String path = null;
   

    /**
     *
     */
    HashMap<String, JLabel> jlabelLoadByName;

    /**
     * Creates new form LoadGUI
     */
    public LoadGUI() {
        this.subInit();

    }

    /**
     *
     * @param aThis
     */
    LoadGUI(StartGUI aThis) {

        this.stg = aThis;
        this.subInit();

    }

    /**
     *
     * @param aThis
     */
    LoadGUI(SettingsGUI aThis) {
        this.seg = aThis;
        this.subInit();

    }

    /**
     *
     */
    private void subInit() {
        initComponents();
        jlabelLoadByName = myInit();
        this.path= SaveGUI.pathCreator();
        setLoadBoard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SettingsB = new javax.swing.JLabel();
        CloseScreen = new javax.swing.JLabel();
        LoadB = new javax.swing.JLabel();
        LoadLabel0 = new javax.swing.JLabel();
        LoadLabel1 = new javax.swing.JLabel();
        LoadLabel2 = new javax.swing.JLabel();
        LoadLabel3 = new javax.swing.JLabel();
        LoadLabel4 = new javax.swing.JLabel();
        LoadLabel5 = new javax.swing.JLabel();
        LoadLabel6 = new javax.swing.JLabel();
        LoadLabel7 = new javax.swing.JLabel();
        LoadLabel8 = new javax.swing.JLabel();
        LoadLabel9 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SettingsB.setAlignmentX(0.5F);
        SettingsB.setAlignmentY(0.0F);
        SettingsB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SettingsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SettingsBMouseReleased(evt);
            }
        });
        getContentPane().add(SettingsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 356, 35, 35));

        CloseScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseScreenMouseClicked(evt);
            }
        });
        getContentPane().add(CloseScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 80, 30, 20));

        LoadB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadBMouseReleased(evt);
            }
        });
        getContentPane().add(LoadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 190, 30));

        LoadLabel0.setText("-empty-");
        LoadLabel0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel0MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 125, 300, 15));

        LoadLabel1.setText("-empty-");
        LoadLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 300, 15));

        LoadLabel2.setText("-empty-");
        LoadLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 155, 300, 15));

        LoadLabel3.setText("-empty-");
        LoadLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 300, 15));

        LoadLabel4.setText("-empty-");
        LoadLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel4MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 185, 300, 15));

        LoadLabel5.setText("-empty-");
        LoadLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel5MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 300, 15));

        LoadLabel6.setText("-empty-");
        LoadLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel6MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 215, 300, 15));

        LoadLabel7.setText("-empty-");
        LoadLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel7MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 300, 15));

        LoadLabel8.setText("-empty-");
        LoadLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel8MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 245, 300, 15));

        LoadLabel9.setText("-empty-");
        LoadLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoadLabel9MouseReleased(evt);
            }
        });
        getContentPane().add(LoadLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 300, 15));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/java src Load clean.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @return
     */
    private HashMap<String, JLabel> myInit() {
        HashMap<String, JLabel> jlabelLoadByName = new HashMap<String, JLabel>();
        jlabelLoadByName.put("LoadLabel9", LoadLabel9);
        jlabelLoadByName.put("LoadLabel8", LoadLabel8);
        jlabelLoadByName.put("LoadLabel7", LoadLabel7);
        jlabelLoadByName.put("LoadLabel6", LoadLabel6);
        jlabelLoadByName.put("LoadLabel5", LoadLabel5);
        jlabelLoadByName.put("LoadLabel4", LoadLabel4);
        jlabelLoadByName.put("LoadLabel3", LoadLabel3);
        jlabelLoadByName.put("LoadLabel2", LoadLabel2);
        jlabelLoadByName.put("LoadLabel1", LoadLabel1);
        jlabelLoadByName.put("LoadLabel0", LoadLabel0);

        return jlabelLoadByName;

    }

    /**
     *
     */
    private void setLoadBoard() {
        

        File folder = new File(this.path);
        File[] listOfFiles = folder.listFiles();

        Arrays.sort(listOfFiles, new Comparator<File>() {

            public int compare(File f1, File f2) {
                return Long.valueOf(f2.lastModified()).compareTo(f1.lastModified());
            }
        });
        if (listOfFiles.length == 0) {
            this.LoadB.setVisible(false);
        }
        String st = null;
        String gSave = null;
        for (int i = 0; (i < 10); i++) {
            st = "LoadLabel" + Integer.toString(i);
            jlabelLoadByName.get(st).setVisible(false);

        }
        for (int i = 0; (i < listOfFiles.length); i++) {
            if (i >= 10) {
                listOfFiles[i].delete();
                continue;
            }
            st = "LoadLabel" + Integer.toString(i);
            gSave = i + ". " + listOfFiles[i].getName();
            jlabelLoadByName.get(st).setVisible(true);
            jlabelLoadByName.get(st).setText(gSave.substring(0, gSave.length() - 3));

        }
    }

    private void SettingsBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsBMouseReleased
        this.setVisible(false);

    }//GEN-LAST:event_SettingsBMouseReleased
    private void fixList(int theOne) {
        String st = null;
        for (int i = 0; (i < 10); i++) {
            if (i != theOne) {
                st = "LoadLabel" + Integer.toString(i);
                this.jlabelLoadByName.get(st).setForeground(Color.black);
            } else {
                continue;
            }
        }

    }
    private void CloseScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseScreenMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CloseScreenMouseClicked

    private void LoadBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadBMouseReleased
        // TODO add your handling code here:
        if (this.loaded != null) {
            new GameGUI(this.loaded, false).setVisible(true);
            if (stg != null) {
                stg.setVisible(false);
            }
            if (seg != null) {
                seg.setVisible(false);
            }
            this.setVisible(false);
        }

    }//GEN-LAST:event_LoadBMouseReleased

    /**
     *
     * @param fileStr
     */
    private void loadSavedGame(String fileStr) {
        String temp = this.path + fileStr.substring(3, fileStr.length()) + ".gm";

        GameGUI tempG = new GameGUI();
        Game loadedGame = null;

        try {
            loadedGame = tempG.loadGameFromFile(temp);

        } catch (IOException ex) {
            Logger.getLogger(LoadGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.loaded = loadedGame;

    }

    private void LoadLabel0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel0MouseReleased
        // TODO add your handling code here:
        this.LoadLabel0.setForeground(Color.white);
        this.fixList(0);
        this.loadSavedGame(this.LoadLabel0.getText());

    }//GEN-LAST:event_LoadLabel0MouseReleased

    private void LoadLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel1MouseReleased
        // TODO add your handling code here:
        this.LoadLabel1.setForeground(Color.white);
        this.fixList(1);
        this.loadSavedGame(this.LoadLabel1.getText());
    }//GEN-LAST:event_LoadLabel1MouseReleased

    private void LoadLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel2MouseReleased
        // TODO add your handling code here:
        this.LoadLabel2.setForeground(Color.white);
        this.fixList(2);
        this.loadSavedGame(this.LoadLabel2.getText());
    }//GEN-LAST:event_LoadLabel2MouseReleased

    private void LoadLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel3MouseReleased
        // TODO add your handling code here:
        this.LoadLabel3.setForeground(Color.white);
        this.fixList(3);
        this.loadSavedGame(this.LoadLabel3.getText());
    }//GEN-LAST:event_LoadLabel3MouseReleased

    private void LoadLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel4MouseReleased
        // TODO add your handling code here:
        this.LoadLabel4.setForeground(Color.white);
        this.fixList(4);
        this.loadSavedGame(this.LoadLabel4.getText());
    }//GEN-LAST:event_LoadLabel4MouseReleased

    private void LoadLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel5MouseReleased
        // TODO add your handling code here:
        this.LoadLabel5.setForeground(Color.white);
        this.fixList(5);
        this.loadSavedGame(this.LoadLabel5.getText());
    }//GEN-LAST:event_LoadLabel5MouseReleased

    private void LoadLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel6MouseReleased
        // TODO add your handling code here:
        this.LoadLabel6.setForeground(Color.white);
        this.fixList(6);
        this.loadSavedGame(this.LoadLabel6.getText());
    }//GEN-LAST:event_LoadLabel6MouseReleased

    private void LoadLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel7MouseReleased
        // TODO add your handling code here:
        this.LoadLabel7.setForeground(Color.white);
        this.fixList(7);
        this.loadSavedGame(this.LoadLabel7.getText());
    }//GEN-LAST:event_LoadLabel7MouseReleased

    private void LoadLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel8MouseReleased
        // TODO add your handling code here:
        this.LoadLabel8.setForeground(Color.white);
        this.fixList(8);
        this.loadSavedGame(this.LoadLabel8.getText());
    }//GEN-LAST:event_LoadLabel8MouseReleased

    private void LoadLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLabel9MouseReleased
        // TODO add your handling code here:
        this.LoadLabel9.setForeground(Color.white);
        this.fixList(9);
        this.loadSavedGame(this.LoadLabel9.getText());
    }//GEN-LAST:event_LoadLabel9MouseReleased

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
            java.util.logging.Logger.getLogger(LoadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CloseScreen;
    private javax.swing.JLabel LoadB;
    private javax.swing.JLabel LoadLabel0;
    private javax.swing.JLabel LoadLabel1;
    private javax.swing.JLabel LoadLabel2;
    private javax.swing.JLabel LoadLabel3;
    private javax.swing.JLabel LoadLabel4;
    private javax.swing.JLabel LoadLabel5;
    private javax.swing.JLabel LoadLabel6;
    private javax.swing.JLabel LoadLabel7;
    private javax.swing.JLabel LoadLabel8;
    private javax.swing.JLabel LoadLabel9;
    private javax.swing.JLabel SettingsB;
    // End of variables declaration//GEN-END:variables
}
