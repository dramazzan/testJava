package OrderState;

class DeliveredState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Заказ доставлен.");
    }
}