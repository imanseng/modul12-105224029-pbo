class CloudNoSQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void hubungkan() {
        System.out.println("Menghubungkan ke Cloud NoSQL Database...");
    }

    @Override
    public void simpanKRS(String mahasiswa, String matakuliah) {
        System.out.println("DATA TERSIMPAN: KRS Mahasiswa " + mahasiswa + " sukses masuk cluster NoSQL.");
    }
}
