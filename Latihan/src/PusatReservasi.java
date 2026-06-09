public class PusatReservasi {
    private DataKereta cekDataKereta;
    private ValidasiNik cekNik;
    private TiketPrinter cekPrint;
    private BookingService cekKursi;
    private ValidasiPemesanan cekPemesanan;

    public PusatReservasi(DataKereta cekDataKereta, ValidasiNik cekNik, TiketPrinter cekPrint, BookingService cekKursi, ValidasiPemesanan cekPemesanan) {
        this.cekDataKereta = cekDataKereta;
        this.cekNik = cekNik;
        this.cekPrint = cekPrint;
        this.cekKursi = cekKursi;
        this.cekPemesanan = cekPemesanan;
    }

    public void pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket) throws RuteTidakDitemukanException, TiketHabisException, DataPenumpangTidakValidException {
        cekNik.validasi(nik);
        Kereta keretaDipilih = cekDataKereta.cariKodeKereta(kodeKereta);
        cekPemesanan.validasiPemesanan(cekDataKereta.cariKodeKereta(kodeKereta), kodeKereta, jumlahTiket);
        cekKursi.pesanKursi(keretaDipilih, jumlahTiket);
        cekPrint.cetakStruk(namaPenumpang, keretaDipilih, jumlahTiket);
    }
}
