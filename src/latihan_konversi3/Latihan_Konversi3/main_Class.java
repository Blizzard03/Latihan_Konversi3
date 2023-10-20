/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_konversi3.Latihan_Konversi3;

import java.text.NumberFormat;
import java.util.Locale;
import latihan_konversi3.Latihan_Konversi3.Sub.Internet;
import latihan_konversi3.Latihan_Konversi3.Sub.Telepon;
import latihan_konversi3.Latihan_Konversi3.Sub.Paket_Data;

/**
 *
 * @author mariq
 */
public class main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Curency Formatter
        Locale Indonesia = new Locale("in", "ID");
        NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);
        Internet matrix = new Internet("Matrix", "Indosat", 30000, "GSM");
        Telepon hallo = new Telepon("Hallo", "Telkomsel", 50000, 500);
        Paket_Data flash = new Paket_Data(200000, "Flash", "Telkomsel", 0);

        // Mengakses atribut dari instance
        System.out.println("Layanan: " + matrix.getLayanan());
        System.out.println("Provider: " + matrix.getNamaProvider());
        System.out.println("Abodemen: " + matrix.getAbodemen());
        System.out.println("Koneksi: " + matrix.getKoneksi());
    }

}
