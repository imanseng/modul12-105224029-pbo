interface KalkulasiJalurUKT {
    double hitung();
}

class UKTReguler implements KalkulasiJalurUKT {
    @Override
    public double hitung() { return 5000000; }
}

class UKTKaryawan implements KalkulasiJalurUKT {
    @Override
    public double hitung() { return 7500000; }
}

class UKTInternasional implements KalkulasiJalurUKT {
    @Override
    public double hitung() { return 15000000; }
}

class UKTBidikmisi implements KalkulasiJalurUKT {
    @Override
    public double hitung() { return 0; }
}

// Baru
class UKTMBKM implements KalkulasiJalurUKT {
    @Override
    public double hitung() { return 2500000; }
}