class MataKuliahTeori implements OperasiMataKuliah {
    private String nama;
    public MataKuliahTeori(String nama) { this.nama = nama; }

    @Override
    public void registrasiKelas() { System.out.println("Registrasi Kuliah Teori: " + nama); }
    
    @Override
    public void alokasiAsistenLab() { 
        throw new UnsupportedOperationException("Error: Kuliah teori tidak butuh Asisten Lab!"); 
    }
    @Override
    public void cekPeralatanPraktikum() { 
        throw new UnsupportedOperationException("Error: Kuliah teori tidak punya peralatan praktikum!"); 
    }
}