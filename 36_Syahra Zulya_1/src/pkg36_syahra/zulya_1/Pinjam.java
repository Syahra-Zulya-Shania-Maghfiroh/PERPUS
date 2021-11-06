/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36_syahra.zulya_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MOKLET-01
 */
public class Pinjam extends Zulya_1{
    ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    ArrayList<Integer> idBuku = new ArrayList<Integer>();
    ArrayList<Integer> banyakBuku = new ArrayList<Integer>();
    
    Scanner input = new Scanner(System.in);
    
    public void Proses(Siswa oSiswa, Petugas oPetugas, Buku oBuku, Laporan oLaporan, Pinjam oPinjam){
        super.ucapan();
        System.out.print("Masukkan id siswa : ");
        int idSiswaInput = input.nextInt();
        
        do{
            if (oSiswa.getStatus(idSiswaInput) == true) {
                System.out.println("Halo " + oSiswa.getNama(idSiswaInput) + " status anda adalah true. Anda bisa meminjam buku");
                oLaporan.Laporan(oBuku);
                System.out.println("=========================================");

                System.out.print("Masukkan id buku yang ingin anda pinjam : ");
                int idBukuPinjam = input.nextInt();

                System.out.print("Masukkan jumlah buku yang ingin anda pinjam : ");
                int JmlBukuP = input.nextInt();
                int stok = oBuku.getStok(idBukuPinjam);
                int total = stok - JmlBukuP;

                updateDataPinjam(oBuku, idSiswaInput, idBukuPinjam, JmlBukuP, oSiswa);
                
                
                System.out.println("========================================");
                System.out.println("Berikut detail peminjaman buku");
                System.out.println("Nama \t Buku \t Jumlah\t \t Petugas \t Sisa \t Status");
                
                int x = oPinjam.getJmlPeminjaman();
                for(int i = 0; i < x; i++){
                    System.out.println(oSiswa.getNama(oPinjam.getIdSiswa(i)) + "\t" + oBuku.getNama(oPinjam.getIdBuku(i)) + "\t\t" + oPinjam.getBanyakBuku(i) + "\t" + oPetugas.getNama(i) + "\t" 
                            + total +"\t"+ oSiswa.getStatus(oPinjam.getIdSiswa(i)));
                }
            } else {
                System.out.println("Halo " + oSiswa.getNama(idSiswaInput) + " status anda adalah false. Anda harus mengembalikan buku terlebih dahulu.");
                oLaporan.Laporan(oBuku);
                
                System.out.println("========================================");
                System.out.print("Masukkan id buku yang ingin anda kembalikan : ");
                int idBukuReturn = input.nextInt();

                System.out.print("Masukkan jumlah buku yang ingin anda kembalikan : ");
                int JmlBukuK = input.nextInt();
                
                oSiswa.editStatus(idSiswaInput, true);
                oBuku.editStok(idBukuReturn, oBuku.getStok(idBukuReturn) + JmlBukuK);
                
                System.out.println("========================================");
                System.out.println("Buku " + oBuku.getNama(idBukuReturn) + " sebanyak " + JmlBukuK + " berhasil dikembalikan");
                System.out.println("========================================");
            }
        } while(oSiswa.getStatus(idSiswaInput) == true);
        
    }
    
    public void updateDataPinjam(Buku oBuku, int idSiswa, int idBuku, int banyakBuku, Siswa oSiswa){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyakBuku.add(banyakBuku);
        
        //edit stok buku
        oBuku.editStok(idBuku, oBuku.getStok(idBuku) - banyakBuku);
        //edit status siswa
        oSiswa.editStatus(idSiswa, false);
    }
    
    //method size
    public int getJmlPeminjaman(){
        return this.idSiswa.size();
    }
    
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }
    
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }
    
    public int getBanyakBuku(int id){
        return this.banyakBuku.get(id);
    }
}
