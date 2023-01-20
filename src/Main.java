import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Mehanic;
import transport.Sponsor;

import java.sql.Driver;
import java.util.List;

public class Main {
    public static <kia> void main(String[] args) {
        Mehanic<Car> g= new Mehanic<Car>("tim","Николаев","Dunlop");

        Sponsor lukoil = new Sponsor<>("Лукойл", 20_000);
        Sponsor mihelin = new Sponsor<>("Mihelin", 25_000);


        Car kia = new Car("Kia", "sorento", 1.3, TypeOfBody.SEDAN);
        kia.addDriver(new DriverB("Иван", true, 10));
        kia.addMehanic();
        kia.addSponsor(mihelin);

        Car bmw = new Car("BMW", "three", 3, TypeOfBody.SEDAN);
        Car toyota = new Car("toyota", "sorento", 1.3, TypeOfBody.SEDAN);
        Car mercedes = new Car("Mercedes", "three", 3, TypeOfBody.SEDAN);


        Truck kamaz = new Truck("kamaz", "4430", 12, Weight.N2);
        kamaz.addDriver(new DriverD("Иван", true, 10));
        kamaz.addMehanic();
        kamaz.addSponsor(lukoil,mihelin);


        Truck kamaz1 = new Truck("kamaz", "1230", 12, Weight.N1);
        Truck kamaz2 = new Truck("kamaz", "3530", 12, Weight.N3);


        Bus kr = new Bus("kamaz", "4430", 12, Capacity.LARGE);
        kr.addDriver(new DriverC("Иван", true, 10));
        kr.addMehanic();
        kr.addSponsor(lukoil,mihelin);

        Bus kr1 = new Bus("kamaz", "4430", 12, Capacity.MEDIUM);

        java.util.List<Transport> transports = List.of
                (kia, kamaz, kr);

        for (Transport transport : transports) {
            printInfo(transport);
        }

    }

    private static void printInfo (Transport transport) {
        System.out.println("Информация по автомобилю" + transport.getBrand() + transport.getModel());
        System.out.println("Водители" + transport.getDrivers());
        System.out.println("Спонсоры" + transport.getSponsors());
        System.out.println("Механики" + transport.getMehanics());
        System.out.println();
    }

}



