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
public class Zulya_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Siswa a = new Siswa();
        Petugas b = new Petugas();
        Buku c = new Buku();
        Laporan d = new Laporan();
        
        Pinjam run = new Pinjam();
                
        run.Proses(a, b, c, d, run);
    }
    public void ucapan(){
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN MOKLET");
        System.out.println("===========================================");
    }
    
}
