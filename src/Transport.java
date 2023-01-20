

import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Mehanic;
import transport.Sponsor;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing, com.sun.jdi.connect.Transport {

    private String brand;
    private String model;
    private double engineVolume;

    private final List<driver.Driver<?>> drivers = new ArrayList<>();
    private final List<Mehanic<?>> mehanics = new ArrayList<>();
    private final List<Sponsor<?>> sponsors = new ArrayList<>();


    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;


    public Transport(String brand,
                     String model,
                     double engineVolume) {


        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = brand;
        }
        setEngineVolume(engineVolume);

    }



    public void addDriver(driver.Driver<?>... drivers) {
       this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMehanic(Mehanic<?> ... mehanics) {
        this.mehanics.addAll(Arrays.asList(mehanics));

    }
    public void addSponsor(Sponsor<?>...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<driver.Driver<?>> getDrivers() {
        return drivers;
    }

    public Mehanic<?> getMehanics() {
        return (Mehanic<?>) mehanics;
    }

    public List<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public abstract void startMove();

    public abstract void finischMove();

    public abstract boolean service();

    public abstract void repair();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = DEFAULT_ENGINE_VOLUME;
        }
        this.engineVolume = engineVolume;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public abstract void refill();

    public abstract void printOfType();

    public abstract void pitStop();

    public abstract void theBestTimeLap();

    public abstract void maxSpeed();

    public abstract void addDriver(DriverB иван);

    public abstract void addDriver(DriverC иван);

    public abstract void addDriver(DriverD иван);
}



