public class TiketPrinter {
    public void cetakStruk(String namaPenumpang, Kereta kereta, int jumlahTiket) {
        System.out.println("RESERVASI BERHASIL");
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Kereta: " + kereta.getNamaKereta());
        System.out.println("Rute: " + kereta.getRute());
        System.out.println("Jumlah Tiket: " + jumlahTiket + " kursi");
    }
}
