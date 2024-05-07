package OrderState;

class Order {
    private OrderState state;

    public Order() {
        this.state = new NewState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.processOrder(this);
    }
}