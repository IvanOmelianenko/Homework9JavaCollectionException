package Car;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine("Diesel");
        try {
            car.setMaxSpeed(310);
        } catch (OverMaxSpeedException ignored) {

        }


        try {
            car.setProducer("Dodge");
        } catch (NotElectricCarException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Program is closed");
        }



    }

}
