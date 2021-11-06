/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36_syahra.zulya_1;

import java.util.ArrayList;

/**
 *
 * @author MOKLET-01
 */
public class Petugas implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    
    public Petugas() {
        this.namaKaryawan.add("Putra");
        this.alamat.add("Sawojajar");
        this.telp.add("08123333337");
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telp.add(telepon);
    }

    @Override
    public String getNama(int idKar) {
        return this.namaKaryawan.get(idKar);
    }

    @Override
    public String getAlamat(int idKar) {
        return this.alamat.get(idKar);
    }

    @Override
    public String getTelepon(int idKar) {
        return this.telp.get(idKar);
    }
}
