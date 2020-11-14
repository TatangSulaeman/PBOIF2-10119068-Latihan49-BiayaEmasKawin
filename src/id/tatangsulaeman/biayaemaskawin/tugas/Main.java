/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.biayaemaskawin.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Hasil biaya untuk maskawin
 * 
 */
public class Main {
    public static void main(String []args){
        Biaya dataBiaya = new Biaya();
        
        //set value berat
        dataBiaya.setBerat(15.7);
        
        //set value harqa
        dataBiaya.setHarga(570000);
        
        String outputText = 
                "Harga Emas untuk Mahar = " + dataBiaya.getHarga() + "\n" +
                "Berat seluruh mahar    = " + dataBiaya.getBerat()+ "\n" +
                "Total Seluruh Biaya    = " + dataBiaya.hitungBiaya(dataBiaya.getHarga(), dataBiaya.getBerat()) + "\n" +
                "";
        System.out.println(outputText);
    }
}
