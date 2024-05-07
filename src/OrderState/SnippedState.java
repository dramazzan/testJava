package OrderState;

class ShippedState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Заказ отправлен.");
        order.setState(new DeliveredState());
    }
}