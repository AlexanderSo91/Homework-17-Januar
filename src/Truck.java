import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Truck extends Transport implements Competing {

    private Weight weight;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;

    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }


    @Override
    public void repair() {
        System.out.println(" Грузовик" + getBrand() + getModel() + " починен");
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Грузовик марки закончил движение");

    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void refill() {

    }

    @Override
    public void printOfType() {
        if (weight == null) {
            System.out.println("Данных не достаточно");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " ";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo();
            System.out.println("Грузоподьемность от " + from + to);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Питстоп");

    }

    @Override
    public void theBestTimeLap() {
        System.out.println("Лучшее время круга грузовика");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика");

    }

    @Override
    public void addDriver(DriverB иван) {

    }

    @Override
    public void addDriver(DriverC иван) {

    }

    @Override
    public void addDriver(DriverD иван) {

    }

    @Override
    public String name() {
        return null;
    }
}



