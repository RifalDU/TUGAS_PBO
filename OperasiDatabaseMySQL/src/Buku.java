public class Buku {
    private int idBuku;
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String jenisBuku;

    public Buku(int idBuku, String judul, String pengarang, int tahunTerbit, String jenisBuku) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.jenisBuku = jenisBuku;
    }

    public Buku(String judul, String pengarang, int tahunTerbit, String jenisBuku) {
        this(0, judul, pengarang, tahunTerbit, jenisBuku);
    }

    public int getIdBuku() { return idBuku; }
    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }
    public int getTahunTerbit() { return tahunTerbit; }
    public String getJenisBuku() { return jenisBuku; }

    @Override
    public String toString() {
        return "ID: " + idBuku +
               ", Judul: " + judul +
               ", Pengarang: " + pengarang +
               ", Tahun: " + tahunTerbit +
               ", Jenis: " + jenisBuku;
    }
}
