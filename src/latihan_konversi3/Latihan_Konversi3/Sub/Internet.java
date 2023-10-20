package latihan_konversi3.Latihan_Konversi3.Sub;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import latihan_konversi3.Latihan_Konversi3.Master.Provider;

/**
 *
 * @author mariq
 */
public class Internet extends Provider {
     private final String koneksi;

    public Internet(String layanan, String namaProvider, int abodemen, String koneksi) {
        super(layanan, namaProvider, abodemen);
        this.koneksi = koneksi;
    }

    public String getKoneksi() {
        return koneksi;
    }
}
