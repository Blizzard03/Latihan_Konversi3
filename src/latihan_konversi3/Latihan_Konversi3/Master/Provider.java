/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_konversi3.Latihan_Konversi3.Master;

/**
 *
 * @author mariq
 */
public class Provider {
      private String layanan;
      private String namaProvider;
      private double abodemen;

      public Provider(String layanan, String namaProvider, double abodemen) {
            this.layanan = layanan;
            this.namaProvider = namaProvider;
            this.abodemen = abodemen;
      }

      public String getLayanan() {
            return layanan;
      }

      public void setLayanan(String layanan) {
            this.layanan = layanan;
      }

      public String getNamaProvider() {
            return namaProvider;
      }

      public void setNamaProvider(String namaProvider) {
            this.namaProvider = namaProvider;
      }

      public double getAbodemen() {
            return abodemen;
      }

      public void setAbodemen(double abodemen) {
            this.abodemen = abodemen;
      }

}
