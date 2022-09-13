public class Car extends Transport {

    public Car (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void serviceTransport() {
        updateTyre();
        checkEngine();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышки машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}
