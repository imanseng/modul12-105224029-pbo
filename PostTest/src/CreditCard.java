public class CreditCard implements PaymentMethod, Refundable {
    public void pay(double amount) {
        System.out.println("Mengeksekusi API Bank untuk pembayaran Kartu Kredit sebesar: " + amount);
    }
    public void refund(double amount) {
        System.out.println("Mengembalikan dana ke Kartu Kredit sebesar: " + amount);
    }
}
