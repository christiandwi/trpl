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
    public class viewHomeKetuaUmum extends javax.swing.JFrame {

    /**
     * Creates new form viewuser
     */
    public viewHomeKetuaUmum() {
        initComponents();
    }
    public void SetName(String text) {
        Nametag.setText(text);
    }
    public String Getname(){
        String name ;
        name = Nametag.getText();
        return name ;
    }

    public void klikexit(ActionListener action) {
        tombolexit.addActionListener(action);
    }
    public void klikLogout (ActionListener a) {
        btnLogout.addActionListener(a);
    }

    public void klikminimize(ActionListener action) {
        tombolminimize.addActionListener(action);
    }

    public void klikLihatinventaris(ActionListener action) {
        klikLihatinventaris.addActionListener(action);
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
        klikLihatinventaris = new javax.swing.JButton();
        klikramalan = new javax.swing.JButton();
        kliktebar = new javax.swing.JButton();
        klikforum = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        Nametag = new javax.swing.JLabel();
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

        klikLihatinventaris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_lihatpeminjamanInventaris.png"))); // NOI18N
        klikLihatinventaris.setText("jButton1");
        klikLihatinventaris.setBorderPainted(false);
        klikLihatinventaris.setContentAreaFilled(false);
        klikLihatinventaris.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_lihatpeminjamanInventarisMouseOver.png"))); // NOI18N
        getContentPane().add(klikLihatinventaris, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 240, 260));

        klikramalan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_Ramalan.png"))); // NOI18N
        klikramalan.setText("jButton2");
        klikramalan.setBorderPainted(false);
        klikramalan.setContentAreaFilled(false);
        klikramalan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_RamalanMouseOver.png"))); // NOI18N
        getContentPane().add(klikramalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 240, 260));

        kliktebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_Penebaran.png"))); // NOI18N
        kliktebar.setText("jButton3");
        kliktebar.setBorderPainted(false);
        kliktebar.setContentAreaFilled(false);
        kliktebar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_PenebaranMouseOver.png"))); // NOI18N
        getContentPane().add(kliktebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 240, 260));

        klikforum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_Forum.png"))); // NOI18N
        klikforum.setText("jButton4");
        klikforum.setBorderPainted(false);
        klikforum.setContentAreaFilled(false);
        klikforum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/button_ForumMouseOver.png"))); // NOI18N
        getContentPane().add(klikforum, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 270, 240, 260));

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logout.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logoutMouseOver.png"))); // NOI18N
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 90, 130, -1));

        Nametag.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Nametag.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Nametag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 130, -1, 30));

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
            java.util.logging.Logger.getLogger(viewHomeKetuaUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewHomeKetuaUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewHomeKetuaUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewHomeKetuaUmum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewHomeKetuaUmum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nametag;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton klikLihatinventaris;
    private javax.swing.JButton klikforum;
    private javax.swing.JButton klikramalan;
    private javax.swing.JButton kliktebar;
    private javax.swing.JButton tombolexit;
    private javax.swing.JButton tombolminimize;
    // End of variables declaration//GEN-END:variables
}
