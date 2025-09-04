/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadDanOverride;

/**
 *
 * @author RIYANA
 */
public class Mobil extends Kendaraan {

    public Mobil (String Nama) {
        super(Nama);
    }

    @Override
    public void info() {
        System.out.println("Tetapi besok aku naik " + getNama());
    }
    
    public static void main(String[] args) {
        Biaya b = new Biaya();
        System.out.println("Hasil dari Overloading: ");
        System.out.println("Biaya sewa berdasarkan jam: " + b.hitung(5, 20000));
        System.out.println("Biaya perjalanan berdasarkan jarak: " + b.hitung(10, 3000, 5000));
        
        System.out.println("\nHasil dari Overriding: ");
        Kendaraan Bus = new Kendaraan("Kendaraan Umum");
        Mobil Avanza = new Mobil ("Avanza");

        Bus.info(); 
        Avanza.info(); 
    }
}
