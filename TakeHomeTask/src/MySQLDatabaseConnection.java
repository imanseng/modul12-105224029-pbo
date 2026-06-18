class MySQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void hubungkan() {
        System.out.println("Menghubungkan ke MySQL Database Server Kampus...");
    }

    @Override
    public void simpanKRS(String mahasiswa, String matakuliah) {
        System.out.println("KRS Mahasiswa " + mahasiswa + " dengan kelas [" + matakuliah + "] sukses masuk tabel MySQL.");
    }
}
