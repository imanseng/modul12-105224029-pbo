interface CariBuku {
    void cariJudulBuku(String judul);
}

interface PinjamBuku {
    void anggotaPinjamBuku(String idAnggota, String idBuku);
}

interface HitungDenda {
    double hitungDendaKeterlambatan(int hari);
}

interface StrukLaporan {
    String formatStrukLaporan(double jumlahDenda);
}

class PencarianJudulBuku implements CariBuku {
    @Override
    public void cariJudulBuku(String title) {
        // Logika pencarian buku berdasarkan judul
    }
}

class PeminjamanBuku implements PinjamBuku {
    @Override
    public void anggotaPinjamBuku(String memberId, String bookId) {
        // Logika peminjaman buku oleh anggota
    }
}

class HitungDendaKeterlambatan implements HitungDenda {
    @Override
    public double hitungDendaKeterlambatan(int hari) {
        return hari * 9000000;
    }
}

class FormatStrukLaporan implements StrukLaporan {
    @Override
    public String formatStrukLaporan(double jumlahDenda) {
        return "| Total Denda | " + jumlahDenda + " |";
    }
}

class LibraryManager {
    private CariBuku pencarian;
    private PinjamBuku peminjaman;
    private HitungDenda hitung;
    private StrukLaporan format;

    public LibraryManager(CariBuku pencarian, PinjamBuku peminjaman, HitungDenda hitung, StrukLaporan format) {
        this.pencarian = pencarian;
        this.peminjaman = peminjaman;
        this.hitung = hitung;
        this.format = format;
    }
}
