interface UserNotifier {
    void sendEmail();
    void sendSMS();
    void sendWhatsApp();
}

class EmailSystem implements UserNotifier {
    public void sendEmail() {
        System.out.println("Mengirimkan notifikasi resi via Email.");
    }
    public void sendSMS() {} 
    public void sendWhatsApp() {}
}

interface PaymentMethod {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Mengeksekusi API Bank untuk Kartu Kredit.");
    }
    public void refund(double amount) {
        System.out.println("Refund Kartu Kredit sukses.");
    }
}

class GiftVoucher implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Memotong saldo Gift Voucher.");
    }
    public void refund(double amount) {
        throw new UnsupportedOperationException("Voucher tidak dapat di-refund!");
    }
}

class OrderService {
    private CreditCard payment;
    private EmailSystem notifier;

    public OrderService() {
        this.payment = new CreditCard();
        this.notifier = new EmailSystem();
    }

    public void saveOrder() {
        System.out.println("Menyimpan data pesanan pelanggan langsung.");
    }

    public void processPayment(String methodType, double amount) {
        if (methodType.equals("CreditCard")) {
            payment.pay(amount);
        } else if (methodType.equals("OVO")) {
            System.out.println("Memanggil API OVO...");
        } else if (methodType.equals("TransferBank")) {
            System.out.println("Memanggil API transfer bank reguler...");
        }
    }

    public void sendNotification() {
        notifier.sendEmail();
    }
}

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        
        orderService.saveOrder();
        orderService.processPayment("CreditCard", 500000);
        orderService.sendNotification();
    }
}
