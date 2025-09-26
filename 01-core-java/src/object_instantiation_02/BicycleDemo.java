package object_instantiation_02;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle byk1 = new Bicycle();
        Bicycle byk2 = new Bicycle();

        byk1.changeCadence(50);
        byk1.speedUp(10);
        byk1.changeGear(2);
        byk1.printStates();

        byk2.changeCadence(50);
        byk2.speedUp(10);
        byk2.changeGear(2);
        byk2.changeCadence(40);
        byk2.speedUp(10);
        byk2.changeGear(3);
        byk2.printStates();
    }
}
