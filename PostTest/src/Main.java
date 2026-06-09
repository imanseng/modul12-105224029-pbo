public class Main {
    public static void main(String[] args) {
        OrderRepository database = new SqlOrderRepository();
        PaymentMethod voucher = new GiftVoucher();
        UserNotifier notifikasiKlien = new EmailSystem(); 

        OrderService order = new OrderService(voucher, notifikasiKlien, database);
        order.processPayment(150000);
    }
}
