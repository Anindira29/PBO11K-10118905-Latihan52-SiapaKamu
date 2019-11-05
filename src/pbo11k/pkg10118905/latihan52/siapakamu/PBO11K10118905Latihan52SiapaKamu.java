/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan52.siapakamu;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Siapa Kamu
 */
public class PBO11K10118905Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Dosen ds = new Dosen();
        ds.setNama("Rizki Adam Kurniawan");
        ds.setUmur(27);
        ds.setNip("41227829930");
        ds.setMatakuliah("PBO");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO2");
        mhs.setNim("10110269");
        System.out.println("NIP DOSEN : "+ ds.getNip());
        ds.siapaKamu();
        ds.mengajarApa();
        System.out.println("");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
