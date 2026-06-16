class MataKuliahPraktikum implements OperasiMataKuliah {
    private String nama;
    public MataKuliahPraktikum(String nama) { this.nama = nama; }

    @Override
    public void registrasiKelas() { System.out.println("Registrasi Praktikum: " + nama); }
    @Override
    public void alokasiAsistenLab() { System.out.println("Asisten Lab dialokasikan untuk " + nama); }
    @Override
    public void cekPeralatanPraktikum() { System.out.println("Peralatan Lab diperiksa untuk " + nama); }
}