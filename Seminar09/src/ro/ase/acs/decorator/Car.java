package ro.ase.acs.decorator;

public class Car implements Vehicle {
    private String producer;
    private float price;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void start() {
        System.out.println("The car has started");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped");
    }
}
