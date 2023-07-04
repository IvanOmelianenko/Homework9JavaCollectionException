package Car;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Car {
    private String engine;
    private String transmission;
    private String producer;
    private int maxSpeed;

    private String color;

    public Car(String engine, String transmission, String producer, int maxSpeed, String color) {
        this.engine = engine;
        this.transmission = transmission;
        this.producer = producer;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }
    public Car() {
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine (String engine) {
        if (!engine.equals("electric")) {
            System.out.println("This is not an electric car");
        } else {
            System.out.println("This is an electric car");
        }
        this.engine = engine;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission (String transmission) {
        this.transmission = transmission;
    }
    public String getProducer () {
        return producer;
    }
    public void setProducer (String producer) {
        String[] electricProducers = {"Tesla", "Porsche", "BMW", "Nissan"};
        if (Arrays.asList(electricProducers).contains(producer)) {
            System.out.println("It's true electric car");
        } else {
            throw new NotElectricCarException("This producer don't make electric cars");
        }
        this.producer = producer;
    }

    public int getMaxSpeed () {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 300) {
            //Exception added
            throw new OverMaxSpeedException("This is not available for serial production");
        } else {
            System.out.println("Model for cities");
        }
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if(color.equals("camo")) {
            System.out.println("Test model");
        } else {
            System.out.println("Serial color");
        }
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car:" +
                "Engine=" + engine + " " +
                "Transmission=" + transmission + " " +
                "Producer=" + producer + " " +
                "Maximum speed=" + maxSpeed + " " +
                "Color=" + color;
    }
}

