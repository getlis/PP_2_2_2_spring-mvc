package web.models;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int price;
    private String model;
    private int speed;


    public Car() {
    }

    public Car(int price, String model, int speed) {
        this.price = price;
        this.model = model;
        this.speed = speed;
    }




    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }


}
