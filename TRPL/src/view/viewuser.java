/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class viewuser extends javax.swing.JFrame {

    /**
     * Creates new form viewuser
     */
    public viewuser() {
        initComponents();
    }

    public void klikexit(ActionListener action) {
        tombolexit.addActionListener(action);
    }

    public void klikminimize(ActionListener action) {
        tombolminimize.addActionListener(action);
    }

    public void klikinventaris(ActionListener action) {
        klikinventaris.addActionListener(action);
    }

    public void klikramalan(ActionListener action) {
        klikramalan.addActionListener(action);
    }

    public void kliktebar(ActionListener action) {
        kliktebar.addActionListener(action);
    }

    public void klikforum(ActionListener action) {
        klikforum.addActionListener(action);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tombolminimize = new javax.swing.JButton();
        tombolexit = new javax.swing.JButton();
        klikinventaris = new javax.swing.JButton();
        klikramalan = new javax.swing.JButton();
        kliktebar = new javax.swing.JButton();
        klikforum = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tombolminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/All_Minimize.png"))); // NOI18N
        tombolminimize.setBorder(null);
        tombolminimize.setBorderPainted(false);
        tombolminimize.setContentAreaFilled(false);
        tombolminimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/All_MinimizeMouseOver.png"))); // NOI18N
        getContentPane().add(tombolminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, -1, 20));

        tombolexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Login_Close.png"))); // NOI18N
        tombolexit.setBorderPainted(false);
        tombolexit.setContentAreaFilled(false);
        tombolexit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Login_CloseMouseOver.png"))); // NOI18N
        getContentPane().add(tombolexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 20));

        klikinventaris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_meminjam.png"))); // NOI18N
        klikinventaris.setText("jButton1");
        klikinventaris.setBorderPainted(false);
        klikinventaris.setContentAreaFilled(false);
        klikinventaris.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_meminjamPeminjaman.png"))); // NOI18N
        getContentPane().add(klikinventaris, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 240, 260));

        klikramalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_Ramalan.png"))); // NOI18N
        klikramalan.setText("jButton2");
        klikramalan.setBorderPainted(false);
        klikramalan.setContentAreaFilled(false);
        klikramalan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_RamalanMouseOver.png"))); // NOI18N
        getContentPane().add(klikramalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 240, 260));

        kliktebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_Penebaran.png"))); // NOI18N
        kliktebar.setText("jButton3");
        kliktebar.setBorderPainted(false);
        kliktebar.setContentAreaFilled(false);
        kliktebar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_PenebaranMouseOver.png"))); // NOI18N
        getContentPane().add(kliktebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 240, 260));

        klikforum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_Forum.png"))); // NOI18N
        klikforum.setText("jButton4");
        klikforum.setBorderPainted(false);
        klikforum.setContentAreaFilled(false);
        klikforum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_ForumMouseOver.png"))); // NOI18N
        getContentPane().add(klikforum, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, 240, 260));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/HomeAnggotaKelompok.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton klikforum;
    private javax.swing.JButton klikinventaris;
    private javax.swing.JButton klikramalan;
    private javax.swing.JButton kliktebar;
    private javax.swing.JButton tombolexit;
    private javax.swing.JButton tombolminimize;
    // End of variables declaration//GEN-END:variables
}
