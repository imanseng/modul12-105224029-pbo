public class SMSSystem implements SMSNotifier, UserNotifier {
    public void sendSMS() {
        System.out.println("Mengirimkan notifikasi resi via SMS.");
    }
    public void sendNotification() {
        sendSMS();
    }
}