/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDanInterface;

/**
 *
 * @author RIYANA
 */
abstract class GuruTetap extends TenagaPendidik {
    
    private int TahunMengajar;

    /**
     * @return the TahunMengajar
     */
    protected int getTahunMengajar() {
        return TahunMengajar;
    }

    /**
     * @param TahunMengajar the TahunMengajar to set
     */
    protected void setTahunMengajar(int TahunMengajar) {
        this.TahunMengajar = TahunMengajar;
    }

    public GuruTetap(String Nama, String MataPelajaran, int TahunMengajar) {
        super(Nama, MataPelajaran);
        this.TahunMengajar = TahunMengajar;
    }

    public abstract void mengikutiRapat();
}
