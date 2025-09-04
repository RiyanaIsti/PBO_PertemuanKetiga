/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDanInterface;

/**
 *
 * @author RIYANA
 */
public class GuruBahasaInggris extends GuruTetap implements MenilaiTugas, MembuatSoal, MembinaEkstra {

    public GuruBahasaInggris(String Nama, String MataPelajaran, int TahunMengajar) {
        super(Nama, MataPelajaran, TahunMengajar);
    }

    // Dari Abstract Class WargaSekolah
    public void hadir() {
        System.out.println(getNama() + " selalu hadir di sekolah.");
    }

    // Dari Abstract Class TenagaPendidik
    public void mengajar() {
        System.out.println(getNama() + " mengajar mata pelajaran " + getMataPelajaran() + ".");
    }

    // Dari Abstract Class GuruTetap
    public void mengikutiRapat() {
        System.out.println(getNama() + " mengikuti rapat guru setiap bulan.");
    }

    // Dari Interface BisaMembimbing
    public void MenilaiTugasHarian() {
        System.out.println(getNama() + " menilai tugas harian dengan teliti.");
    }

    // Dari Interface BisaMenilai
    public void MembuatSoalUjian() {
        System.out.println(getNama() + " membuat soal ujian Bahasa Inggris.");
    }

    // Dari Interface BisaEkstrakurikuler
    public void MembinaEkstrakurikuler() {
        System.out.println(getNama() + " melatih ekstrakurikuler English Club.");
    }

    public static void main(String[] args) {
        GuruBahasaInggris guru = new GuruBahasaInggris("Pak Anshori", "Bahasa Inggris", 8);
        
        System.out.println("Nama : " + guru.getNama());
        System.out.println("Mata Pelajaran : " + guru.getMataPelajaran());
        System.out.println("Tahun Mengajar : " + guru.getTahunMengajar());

        System.out.println("\nKegiatan Pak Anshori sebagai Guru: ");

        // Abstract class methods
        guru.hadir();
        guru.mengajar();
        guru.mengikutiRapat();

        // Interface methods
        guru.MenilaiTugasHarian();
        guru.MembuatSoalUjian();
        guru.MembinaEkstrakurikuler();
    }
}
