class SistemKRSManager {
    private MySQLDatabaseConnection db; // Ketergantungan langsung (Hardcoded)

    public SistemKRSManager() {
        this.db = new MySQLDatabaseConnection(); // menginstansiasi secara langsung objek MySQLDatabaseConnection
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

    public void simpanKRSKeDatabase(String mahasiswa, String matakuliah) {
        db.hubungkan();
        db.simpanKRS(mahasiswa, matakuliah);
    }
}
