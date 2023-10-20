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
public class Telepon extends Provider {

    private final int durasiTelepon;

    public Telepon(String layanan, String namaProvider, int abodemen, int durasiTelepon) {
        super(layanan, namaProvider, abodemen);
        this.durasiTelepon = durasiTelepon;
    }

    public int getDurasiTelepon() {
        return durasiTelepon;
    }
}
