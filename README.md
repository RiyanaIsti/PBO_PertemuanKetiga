# Tugas PBO Pertemuan Ketiga
Tugas ini bertujuan untuk mengimplementasikan konsep-konsep Pemrograman Berorientasi Objek (PBO) menggunakan Java, yaitu:
- Abstract Class
- Interface
- Method Overloading
- Method Overriding

Dalam tugas ini, saya membuat:
- 3 Abstract Class
- 3 Interface
- Subclass yang mengimplementasikan abstract class dan interface
- Contoh penggunaan overloading dan overriding dalam 3 class
  
# Petunjuk Praktikum
1.	Buat project baru pada IDE Java (NetBeans).
2.	Definisikan sebuah kelas abstract beserta subclass-nya, sehingga instance dapat dibuat dari kelas turunan.
3.	Buat contoh implementasi method overloading dalam satu kelas dengan nama method yang sama tetapi parameter berbeda.
4.	Buat contoh method overriding pada subclass yang menuliskan ulang method dari superclass.
5.	Bandingkan implementasi method dari abstract class, interface, overloading, dan overriding agar terlihat perbedaannya.
6.	Pastikan setiap kode diberi komentar yang jelas untuk memudahkan penjelasan pada laporan.
7.	Jalankan program untuk memastikan seluruh konsep dapat berjalan sesuai teori.

# Abstract Class
Abstract class adalah kelas yang tidak dapat dibuat objek secara langsung. Untuk menggunakannya, kelas ini harus diturunkan ke subclass. Abstract class dapat memiliki atribut, method biasa, dan method abstract (tanpa implementasi). Fungsinya adalah sebagai blueprint agar setiap subclass memiliki perilaku tertentu yang sudah ditetapkan.

# Interface
Interface adalah kumpulan deklarasi method tanpa implementasi yang berfungsi sebagai kontrak bagi kelas yang menggunakannya. Interface memungkinkan satu kelas mengimplementasikan lebih dari satu interface, sehingga dapat menyamakan perilaku di berbagai kelas berbeda. Interface memberikan fleksibilitas lebih dibanding abstract class karena tidak membatasi pewarisan tunggal.

# Perbedaan antara Abstract class dan interface:

Abstract class
- Bisa punya atribut/field (misalnya String nama, String connectionString).
- Bisa punya constructor.
- Bisa punya method abstract dan method biasa.
  
Contoh coding

abstract class WargaSekolah {

    private String Nama;
    
    protected String getNama() {
        return Nama;
    }
    
    protected void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public WargaSekolah(String Nama) {
        this.Nama = Nama;
    }
    
    public abstract void hadir();
}


Interface

- Tidak boleh punya constructor.
- Tidak punya atribut (kecuali final static).
- Semua method otomatis abstract
  
Contoh Coding

interface MenilaiTugas {

    void MenilaiTugasHarian();
}

# Overloading
Overloading adalah konsep method dengan nama sama tetapi parameter berbeda dalam satu kelas. Overloading memungkinkan program memiliki beberapa versi method yang menyesuaikan kebutuhan berbeda, sehingga kode menjadi lebih fleksibel dan mudah dibaca.

Contoh coding

    public int hitung(int jam, int tarifPerJam) {
        return jam * tarifPerJam;
    }

    public int hitung(int jarak, int tarifPerKm, int biayaTetap) {
        return (jarak * tarifPerKm) + biayaTetap;
    }

# Overriding
Overriding adalah konsep penulisan ulang method dari superclass di subclass dengan implementasi berbeda. Hal ini memungkinkan subclass memberikan perilaku spesifik pada method yang sudah ada di superclass, sehingga mendukung polymorphism dalam OOP.

Contoh coding

Pada class Kendaraan

    public void info() {
        System.out.println("Kali ini aku naik " + getNama());
    }

Pada class Mobil

    public void info() {
        System.out.println("Tetapi besok aku naik " + getNama());
    }
