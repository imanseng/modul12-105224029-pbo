public class CetakKRSManager {
    public void cetakDraftKRS(String mahasiswa, String matakuliah) {
        System.out.println("Proses Cetak...");
        // Pada semester lalu, seorang pemrogram mengubah format kop surat pada file PDF KRS,
        // Simulasi perubahan format string/kop memicu interupsi/bug
        // boolean adaKesalahanFormatKop = true; 
        // if (adaKesalahanFormatKop) {
        //     System.out.println("Format Kop Surat Rusak! Proses dihentikan.");
        //     // Akibatnya baris kode penyimpanan di bawah terlewati/gagal dieksekusi
        //     return; 
        // }
        // Algoritma penyimpanan data sehingga ribuan data KRS mahasiswa gagal tersimpan ke database. 
        // db.hubungkan();
        // db.simpanKRS(mahasiswa, matakuliah);
    }
}
