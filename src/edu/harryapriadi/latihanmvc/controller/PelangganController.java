/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harryapriadi.latihanmvc.controller;

import edu.harryapriadi.latihanmvc.model.PelangganModel;
import edu.harryapriadi.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtNotelp().getText();
        
    }
    
    public void simpanForm(PelangganView view){
        
      
       if (nama.equals("") && email.equals("") && noTlp.equals("")) {

        } else {

            model.resetForm();
        }

    }

    public void simpanForm(PelangganView view) {

        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
        } else {
            model.simpanForm();
        }
    }

}