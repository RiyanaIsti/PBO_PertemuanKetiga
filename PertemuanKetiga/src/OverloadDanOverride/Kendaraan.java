/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadDanOverride;

/**
 *
 * @author RIYANA
 */
public class Kendaraan {

    private String Nama;

    /**
     * @return the nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @param nama the nama to set
     */
    protected void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Kendaraan(String Nama) {
        this.Nama = Nama;
    }

    public void info() {
        System.out.println("Kali ini aku naik " + getNama());
    }
}
