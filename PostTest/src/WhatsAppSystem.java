public class WhatsAppSystem implements WhatsAppNotifier, UserNotifier {
    public void sendWhatsApp() {
        System.out.println("Mengirimkan notifikasi resi via WhatsApp.");
    }
    public void sendNotification() {
        sendWhatsApp();
    }
}