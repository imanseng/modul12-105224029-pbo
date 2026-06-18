public class Main {
    public static void main(String[] args) throws Exception {
        // JIKA INGIN PAKAI MYSQL (LAMA):
        // DatabaseConnection dbInfrastruktur = new MySQLDatabaseConnection();
        
        // JIKA INGIN MIGRASI KE CLOUD NOSQL (BARU):
        DatabaseConnection dbInfrastruktur = new CloudNoSQLDatabaseConnection(); 
        
        // Masukkan database pilihan ke dalam manager
        SistemKRSManager managerKRS = new SistemKRSManager(dbInfrastruktur);
        
        // Inisialisasi komponen pembantu yang sudah dipecah 
        ValidatorAkademik validator = new ValidatorAkademik();
        CetakKRSManager pencetak = new CetakKRSManager();

        // Contoh Simulasi 1
        String mahasiswa1 = "Gionalndun";
        String mataKuliah1 = "Pemrograman Berorientasi Objek";
        // Step 1: Validasi dilakukan oleh validator
        if (validator.validasiPrasyaratMataKuliah(mahasiswa1, mataKuliah1)) {
            // Step 2: Kalkulasi UKT Jalur Reguler
            double uktGio = managerKRS.kalkulasiUKT(new UKTReguler());
            System.out.println("Tagihan UKT " + mahasiswa1 + " (Jalur Reguler): Rp " + uktGio);
            
            // Step 3: Cetak draft PDF dilakukan oleh pencetak.
            pencetak.cetakDraftKRS(mahasiswa1, mataKuliah1);
            
            // Step 4: Simpan data ke infrastruktur database yang sudah dipilih.
            managerKRS.simpanKRSKeDatabase(mahasiswa1, mataKuliah1);
        }

        // Contoh Simulasi 2
        String mahasiswa2 = "Siti Aminah";
        // Aturan baru (MBKM) langsung bisa dipakai dengan membuat objek baru, tanpa ada logika if-else baru yang diselipkan di dalam SistemKRSManager.
        double uktSiti = managerKRS.kalkulasiUKT(new UKTMBKM());
        System.out.println("Tagihan UKT " + mahasiswa2 + " (Jalur MBKM Baru): Rp " + uktSiti);

        // Membuat daftar mata kuliah
        OperasiMataKuliah mkTeori = new MataKuliahTeori("Aljabar Linier");
        OperasiMataKuliah mkPraktikum = new MataKuliahPraktikum("Pemrograman Berorientasi Objek");

        System.out.println("[Sistem] Memproses kelas 1:");
        mkTeori.registrasiKelas();
        System.out.println("[Sistem] Memproses kelas 2:");
        mkPraktikum.registrasiKelas();
        
        // Sistem memeriksa apakah kelas ini membutuhkan operasional lab
        if (mkPraktikum instanceof OperasiPraktikum) {
            // Dilakukan casting karena objeknya terbukti mendukung praktikum
            OperasiPraktikum kelasLab = (OperasiPraktikum) mkPraktikum;
            kelasLab.alokasiAsistenLab();
            kelasLab.cekPeralatanPraktikum();
        }
    }
}