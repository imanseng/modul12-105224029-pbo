class MataKuliahTeori implements OperasiMataKuliah {
    private String nama;
    public MataKuliahTeori(String nama) { this.nama = nama; }

    @Override
    public void registrasiKelas() { System.out.println("Registrasi Kuliah Teori: " + nama); }
}