interface OrderRepository {
    void save();
}

class SqlOrderRepository implements OrderRepository {
    public void save() {
        System.out.println("LOG database: Berhasil menyimpan data pesanan pelanggan ke SQL Database.");
    }
}
