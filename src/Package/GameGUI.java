/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package;

/**
 *
 * @author BK
 */
public class GameGUI extends javax.swing.JFrame {

    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SettingsB = new javax.swing.JLabel();
        StandB = new javax.swing.JLabel();
        HitB = new javax.swing.JLabel();
        DeckDeal = new javax.swing.JLabel();
        dCardLabel9 = new javax.swing.JLabel();
        dCardLabel8 = new javax.swing.JLabel();
        dCardLabel7 = new javax.swing.JLabel();
        dCardLabel6 = new javax.swing.JLabel();
        dCardLabel5 = new javax.swing.JLabel();
        dCardLabel4 = new javax.swing.JLabel();
        dCardLabel3 = new javax.swing.JLabel();
        dCardLabel2 = new javax.swing.JLabel();
        dCardLabel1 = new javax.swing.JLabel();
        pCardLabel9 = new javax.swing.JLabel();
        pCardLabel8 = new javax.swing.JLabel();
        pCardLabel7 = new javax.swing.JLabel();
        pCardLabel6 = new javax.swing.JLabel();
        pCardLabel5 = new javax.swing.JLabel();
        pCardLabel4 = new javax.swing.JLabel();
        pCardLabel3 = new javax.swing.JLabel();
        pCardLabel2 = new javax.swing.JLabel();
        pCardLabel1 = new javax.swing.JLabel();
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

        StandB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(StandB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 130, 50));

        HitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(HitB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 130, 50));
        getContentPane().add(DeckDeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 36, 90, 80));

        dCardLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 90, 135));

        dCardLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, 135));

        dCardLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 90, 135));

        dCardLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 90, 135));

        dCardLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 90, 135));

        dCardLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 90, 135));

        dCardLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 90, 135));

        dCardLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(dCardLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 90, 135));

        dCardLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/h10.png"))); // NOI18N
        getContentPane().add(dCardLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 90, 135));

        pCardLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(pCardLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 90, 135));

        pCardLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(pCardLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 90, 135));

        pCardLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(pCardLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, 135));

        pCardLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(pCardLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 90, 135));

        pCardLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(pCardLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 90, 135));

        pCardLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        pCardLabel4.setToolTipText("");
        getContentPane().add(pCardLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 90, 135));

        pCardLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png"))); // NOI18N
        getContentPane().add(pCardLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 135));

        pCardLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/d8.png"))); // NOI18N
        getContentPane().add(pCardLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, 135));

        pCardLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/c10.png"))); // NOI18N
        getContentPane().add(pCardLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 135));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/java src no cards.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 404));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SettingsBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsBMouseReleased
        new SettingsGUI().setVisible(true);

    }//GEN-LAST:event_SettingsBMouseReleased

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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel DeckDeal;
    private javax.swing.JLabel HitB;
    private javax.swing.JLabel SettingsB;
    private javax.swing.JLabel StandB;
    private javax.swing.JLabel dCardLabel1;
    private javax.swing.JLabel dCardLabel2;
    private javax.swing.JLabel dCardLabel3;
    private javax.swing.JLabel dCardLabel4;
    private javax.swing.JLabel dCardLabel5;
    private javax.swing.JLabel dCardLabel6;
    private javax.swing.JLabel dCardLabel7;
    private javax.swing.JLabel dCardLabel8;
    private javax.swing.JLabel dCardLabel9;
    private javax.swing.JLabel pCardLabel1;
    private javax.swing.JLabel pCardLabel2;
    private javax.swing.JLabel pCardLabel3;
    private javax.swing.JLabel pCardLabel4;
    private javax.swing.JLabel pCardLabel5;
    private javax.swing.JLabel pCardLabel6;
    private javax.swing.JLabel pCardLabel7;
    private javax.swing.JLabel pCardLabel8;
    private javax.swing.JLabel pCardLabel9;
    // End of variables declaration//GEN-END:variables
}
