/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDanInterface;

/**
 *
 * @author RIYANA
 */
abstract class TenagaPendidik extends WargaSekolah {

    private String MataPelajaran;
    
        /**
     * @return the MataPelajaran
     */
    protected String getMataPelajaran() {
        return MataPelajaran;
    }

    /**
     * @param MataPelajaran the MataPelajaran to set
     */
    protected void setMataPelajaran(String MataPelajaran) {
        this.MataPelajaran = MataPelajaran;
    }

    public TenagaPendidik(String Nama, String MataPelajaran) {
        super(Nama);
        this.MataPelajaran = MataPelajaran;
    }

    public abstract void mengajar();
}
