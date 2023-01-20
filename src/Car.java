import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public  class Car extends Transport implements Competing{

    private TypeOfBody typeOfBody;

    public Car(String brand,
               String model,
               double engineVolume,
               TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;

    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Автомобиль закончил движение");


    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println(" Машина" + getBrand() + getModel() + " починена");

    }

    @Override
    public void refill() {

    }

    @Override
    public void printOfType() {
        if (typeOfBody == null) {
            System.out.println("Данных не достаточно");
        } else {
            System.out.println("Тип кузова авто " + typeOfBody);

        }
    }

    @Override
    public void pitStop() {
        System.out.println("Питстоп");
    }

    @Override
    public void theBestTimeLap() {
        System.out.println("Лучшее время круга автомобиля");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля");

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

