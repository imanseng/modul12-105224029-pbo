class SistemKRSManager {
    private DatabaseConnection db;

    public SistemKRSManager(DatabaseConnection db) {
        this.db = db;
    }

    public double kalkulasiUKT(KalkulasiJalurUKT jalurMasuk) {
        return jalurMasuk.hitung();
    }

    public void simpanKRSKeDatabase(String mahasiswa, String matakuliah) {
        db.hubungkan();
        db.simpanKRS(mahasiswa, matakuliah);
    }
}
