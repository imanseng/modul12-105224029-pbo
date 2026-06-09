public class ValidasiNik {
    public void validasi(String nik) throws DataPenumpangTidakValidException {
        if (nik == null || nik.length() != 16 || !nik.matches("[0-9]+")) {
            throw new DataPenumpangTidakValidException("Error: NIK harus tepat 16 digit dan hanya berisi angka!");
        }
    }
}
