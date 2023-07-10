package app.builder;

public class Car {

    private String hood;
    private String door;
    private String trunk;
    private int price;
    private Cms cms;


    public void setHood(String hood) {
        this.hood = hood;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hood='" + hood + '\'' +
                ", door='" + door + '\'' +
                ", trunk='" + trunk + '\'' +
                ", price=" + price +
                ", cms=" + cms +
                '}';
    }
}
