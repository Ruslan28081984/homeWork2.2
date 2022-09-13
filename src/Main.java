public class Main {
    public static void main(String[] args) {


        Car car = new Car("Веста",4);
        Truck truck = new Truck("Камаз",10);
        Bicycle bicycle = new Bicycle("Аист",2);


        ServiceStation station = new ServiceStation();

        station.check(car);
        System.out.println();
        station.check(truck);
        System.out.println();
        station.check(bicycle);

    }
    }
