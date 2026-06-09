public class EmailSystem implements EmailNotifier, UserNotifier {
    public void sendEmail() {
        System.out.println("Mengirimkan notifikasi resi via Email.");
    }
    public void sendNotification() {
        sendEmail();
    }
}