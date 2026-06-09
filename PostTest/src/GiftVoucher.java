public class GiftVoucher implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Memotong saldo Gift Voucher sebesar: " + amount);
    }
}
