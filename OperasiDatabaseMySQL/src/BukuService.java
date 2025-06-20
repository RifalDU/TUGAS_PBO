import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BukuService {
    public static void tampilkanDataBuku() {
        try (Connection conn = KoneksiDB.getConnection();
             Statement stmt = conn.createStatement()) {
            String sql = "SELECT * FROM buku";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("=== Daftar Buku ===");
            while (rs.next()) {
                Buku buku = new Buku(
                    rs.getInt("id_buku"),
                    rs.getString("judul"),
                    rs.getString("pengarang"),
                    rs.getInt("tahun_terbit"),
                    rs.getString("jenis_buku")
                );
                System.out.println(buku);
            }
        } catch (Exception e) {
            System.out.println("Gagal menampilkan data buku: " + e.getMessage());
        }
    }

    public static void tambahDataBuku(Buku buku) {
        String sql = "INSERT INTO buku (judul, pengarang, tahun_terbit, jenis_buku) VALUES (?, ?, ?, ?)";
        try (Connection conn = KoneksiDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, buku.getJudul());
            pstmt.setString(2, buku.getPengarang());
            pstmt.setInt(3, buku.getTahunTerbit());
            pstmt.setString(4, buku.getJenisBuku());
            pstmt.executeUpdate();
            System.out.println("Data buku berhasil ditambahkan.");
        } catch (Exception e) {
            System.out.println("Gagal menambahkan data buku: " + e.getMessage());
        }
    }
}


