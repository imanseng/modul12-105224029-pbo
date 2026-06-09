public class OrderService {
    private PaymentMethod paymentMethod;
    private UserNotifier userNotifier;
    private OrderRepository orderRepository;

    public OrderService(PaymentMethod paymentMethod, UserNotifier userNotifier, OrderRepository orderRepository) {
        this.paymentMethod = paymentMethod;
        this.userNotifier = userNotifier;
        this.orderRepository = orderRepository;
    }

    public void processPayment(double amount) {
        orderRepository.save();
        paymentMethod.pay(amount);
        userNotifier.sendNotification();
    }
}
