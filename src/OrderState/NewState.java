package OrderState;

class NewState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Заказ в статусе новый, ожидает обработки.");
        order.setState(new ProcessingState());
    }
}