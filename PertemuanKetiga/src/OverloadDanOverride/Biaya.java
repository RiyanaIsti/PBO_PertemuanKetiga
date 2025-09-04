/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadDanOverride;

/**
 *
 * @author RIYANA
 */
public class Biaya {

    public int hitung(int jam, int tarifPerJam) {
        return jam * tarifPerJam;
    }

    public int hitung(int jarak, int tarifPerKm, int biayaTetap) {
        return (jarak * tarifPerKm) + biayaTetap;
    }
}
