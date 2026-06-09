public class BookingService {
    public void pesanKursi(Kereta kereta, int jumlahTiket) throws TiketHabisException {
        if (kereta.getSisaKursi() < jumlahTiket) {
            throw new TiketHabisException(kereta.getNamaKereta(), kereta.getSisaKursi());
        }
        int kursiBaru = kereta.getSisaKursi() - jumlahTiket;
        kereta.setSisaKursi(kursiBaru);
        System.out.println("Berhasil memesan " + jumlahTiket + " kursi untuk " + kereta.getNamaKereta());
    }
}
