public class Truck extends  Transport{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void serviceTransport() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышки грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика ");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }
}
