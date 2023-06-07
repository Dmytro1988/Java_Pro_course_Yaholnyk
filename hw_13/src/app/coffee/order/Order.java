package app.coffee.order;

public record Order(int orderNum, String name) {

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNum +
                ", name='" + name + '\'' +
                '}';
    }
}
