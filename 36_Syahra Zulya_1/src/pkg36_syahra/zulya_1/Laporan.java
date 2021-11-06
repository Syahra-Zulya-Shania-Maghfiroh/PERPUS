/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36_syahra.zulya_1;

/**
 *
 * @author MOKLET-01
 */
public class Laporan {
    public void Laporan(Buku oBuku){
        int x = oBuku.getJmlBuku();
        
        System.out.println("======================================");
        System.out.println("====Laporan buku====");
        System.out.println("Nama buku \t Stok \t Harga");
        for (int i = 0; i<x; i++){
            System.out.println(oBuku.getNama(i) + "\t" + oBuku.getStok(i) + "\t" + oBuku.getHarga(i));
        }
        
    }
    public void Laporan(Siswa oSiswa){
        int x = oSiswa.getJmlSiswa();
        
        System.out.println("======================================");
        System.out.println("====Laporan Siswa====");
        System.out.println("Nama siswa \t Alamat \t Telp \t Status");
        for (int i = 0; i<x; i++){
            System.out.println(oSiswa.getNama(i)+"\t" + oSiswa.getAlamat(i) + "\t" + oSiswa.getTelepon(i) + "\t" + oSiswa.getStatus(i));
        }
    }
    
}
