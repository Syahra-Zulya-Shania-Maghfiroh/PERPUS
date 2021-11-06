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
public class Siswa implements User{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa(){
        this.namaSiswa.add("Syahra");
        this.alamat.add("Udanawu");
        this.telp.add("0815227718");
        this.status.add(true);
        
        this.namaSiswa.add("Rara");
        this.alamat.add("Blitar");
        this.telp.add("0815227718");
        this.status.add(false);
        
        this.namaSiswa.add("Nina");
        this.alamat.add("Malang");
        this.telp.add("0815227718");
        this.status.add(true);
    }
    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    public void setNama(String namaSiswa){
        this.namaSiswa.add(namaSiswa);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
       this.telp.add(telepon);
    }
    public void setStatus(Boolean status) {
       this.status.add(status);
    }
    public void editStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telp.get(idSiswa);
    }
    public Boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }
}
