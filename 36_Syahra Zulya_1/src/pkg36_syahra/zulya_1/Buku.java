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
public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku() {
        this.namaBuku.add("Matematika");
        this.stok.add(10);
        this.harga.add(50000);
        
        this.namaBuku.add("Biologi");
        this.stok.add(15);
        this.harga.add(100000);
        
        this.namaBuku.add("Fisika");
        this.stok.add(20);
        this.harga.add(500000);
    }
    public int getJmlBuku(){
        return this.namaBuku.size();
    }
    public void setNama(String namaBuku){
        this.namaBuku.add(namaBuku);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public void editStok(int idBuku, int stok){
        this.stok.set(idBuku, stok);;
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public String getNama(int idBuku){
        return this.namaBuku.get(idBuku);
    }
    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    }
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }
}
