package OrderState;

class ProcessingState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Заказ обрабатывается.");
        order.setState(new ShippedState());
    }
}
