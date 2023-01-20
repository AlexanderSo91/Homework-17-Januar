import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public  class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void repair() {
        System.out.println(" Автобус" + getBrand() + getModel() + " починен");
    }

    @Override
    public void startMove() {
        System.out.println("Автобус начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Автобус закончил движение");

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
        if (capacity == null) {
            System.out.println("Данных не достаточно");
        } else {
            System.out.println("Вместимость автобуса от " + capacity.getFrom() + " до " + capacity.getTo());
        }

    }

    @Override
    public void pitStop() {
        System.out.println("Питстоп");
    }

    @Override
    public void theBestTimeLap() {
        System.out.println("Лучшее время круга автобуса");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса");

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


