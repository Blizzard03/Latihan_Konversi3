/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_konversi3.Latihan_Konversi3.Sub;

import latihan_konversi3.Latihan_Konversi3.Master.Provider;

/**
 *
 * @author mariq
 */
public class Paket_Data extends Provider {

    private final double hargaPaket;

    public Paket_Data(double hargaPaket, String layanan, String namaProvider, double abodemen) {
        super(layanan, namaProvider, abodemen);
        this.hargaPaket = hargaPaket;
    }

    public double getHargaPaket() {
        return hargaPaket;
    }

   

  
}
