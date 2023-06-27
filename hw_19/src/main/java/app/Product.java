package app;



import java.time.LocalDate;



public class Product {

    private final int id;
    private final String type;
    private double price;
    private final boolean discount;
    private final  LocalDate dateCreate;

    private final double discountAmount = 0.9;
    public double getDiscountAmount() {
        return discountAmount;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public Product(int id, String type, double price, boolean discount, LocalDate dateCreate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateCreate = dateCreate;

    }


    @Override
    public String toString() {
        return "Product{" +
                "id = " + id +
                ", type = '" + type + '\'' +
                ", price = " + price +
                ", discount = " + discount +
                ", dateCreate = " + dateCreate +
                '}';
    }



}



