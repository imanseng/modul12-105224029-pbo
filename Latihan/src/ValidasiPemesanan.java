public class ValidasiPemesanan {
    public void validasiPemesanan(Kereta keretaDipilih, String kodeKereta, int jumlahTiket) 
            throws RuteTidakDitemukanException, TiketHabisException {
        
        // 1. Validasi keberadaan kereta
        if (keretaDipilih == null) {
            throw new RuteTidakDitemukanException("Error: Kode kereta atau rute " + kodeKereta + " tidak ditemukan!");
        }

        // 2. Validasi ketersediaan kursi
        if (jumlahTiket > keretaDipilih.getSisaKursi()) {
            throw new TiketHabisException(keretaDipilih.getNamaKereta(), keretaDipilih.getSisaKursi());
        }
    }
}
