/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harryapriadi.latihanmvc.model;

import edu.harryapriadi.latihanmvc.event.PelangganListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String noTelp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnchange();
    }

    public String getEmail() {
        return email;
        
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnchange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnchange();
    }
    
    protected void fireOnchange(){
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
        }
        
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
         
    }
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        
    }
}
