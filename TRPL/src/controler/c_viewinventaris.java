/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_inventaris;
import view.popup_inputpinjaman;
import view.view_inventaris;

/**
 *
 * @author acer
 */
public class c_viewinventaris {

    view_inventaris view;
    m_inventaris model;
    popup_inputpinjaman popup;

    public c_viewinventaris(view_inventaris view, m_inventaris model, popup_inputpinjaman popup) throws SQLException {
        this.view = view;
        this.model= model;
        this.popup=popup;
        this.view.setVisible(true);
        view.klikexit(new exitaction());
        view.klikminimize(new minimizeaction());
        view.klikpinjam(new pinjambarang());
        this.view.setTableModel(model.getDatainventaris());
        view.setVisible(true);
//        popup.setVisible(true);
    }

    public void viewpopup() {
        this.popup.setVisible(true);
    }

    public void setpopup(String[] data) throws SQLException {
        popup.setdata(data);
    }

    private class pinjambarang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getSelectedRow() == -1) {
                view.message("Pilih Dulu Gan");
            } else {
                try {
                    setpopup(model.getDataWithID(view.GetIDTable()));
                    viewpopup();
                } catch (SQLException ex) {
                    Logger.getLogger(c_viewinventaris.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }

            }
        }
    }

    private class exitaction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_viewuser a = new controler.c_viewuser(new view.viewuser());
            view.dispose();
        }

    }

    private class minimizeaction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setState(Frame.ICONIFIED);
        }

    }
}
