class SistemKRSManager {
    private MySQLDatabaseConnection db; // Ketergantungan langsung (Hardcoded)

    public SistemKRSManager() {
        this.db = new MySQLDatabaseConnection(); // menginstansiasi secara langsung objek MySQLDatabaseConnection
    }

    // Fungsi Validasi Prasyarat
    public boolean validasiPrasyaratMataKuliah(String mahasiswa, String matakuliah) {
        System.out.println("Memvalidasi prasyarat akademik untuk " + mahasiswa);
        return true; 
    }

    // If-Else untuk perhitungan UKT berdasarkan Jalur Masuk
    public double hitungUangKuliahTunggal(String jalurMasuk) {
        if (jalurMasuk.equalsIgnoreCase("Reguler")) {
            return 5000000;
        } else if (jalurMasuk.equalsIgnoreCase("Karyawan")) {
            return 7500000;
        } else if (jalurMasuk.equalsIgnoreCase("Internasional")) {
            return 15000000;
        } else if (jalurMasuk.equalsIgnoreCase("Bidikmisi")) {
            return 0;
        } else {
            return 3000000;
        }
    }

    // Fungsi Cetak PDF yang bercampur dengan logika penyimpanan database
    public void cetakDraftKRS(String mahasiswa, String matakuliah) {
        System.out.println("Proses Cetak...");
        // Pada semester lalu, seorang pemrogram mengubah format kop surat pada file PDF KRS,
        // Simulasi perubahan format string/kop memicu interupsi/bug
        boolean adaKesalahanFormatKop = true; 
        if (adaKesalahanFormatKop) {
            System.out.println("Format Kop Surat Rusak! Proses dihentikan.");
            // Akibatnya baris kode penyimpanan di bawah terlewati/gagal dieksekusi
            return; 
        }
        // Algoritma penyimpanan data sehingga ribuan data KRS mahasiswa gagal tersimpan ke database. 
        db.hubungkan();
        db.simpanKRS(mahasiswa, matakuliah);
    }
}
