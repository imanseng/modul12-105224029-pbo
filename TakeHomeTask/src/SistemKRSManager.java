class SistemKRSManager {
    private MySQLDatabaseConnection db; // Ketergantungan langsung (Hardcoded)

    public SistemKRSManager() {
        this.db = new MySQLDatabaseConnection(); // menginstansiasi secara langsung objek MySQLDatabaseConnection
    }

    public double kalkulasiUKT(KalkulasiJalurUKT jalurMasuk) {
        return jalurMasuk.hitung();
    }

    public void simpanKRSKeDatabase(String mahasiswa, String matakuliah) {
        db.hubungkan();
        db.simpanKRS(mahasiswa, matakuliah);
    }
}
