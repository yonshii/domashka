package hw12;

public class Car {
    public void start() {
        System.out.println("Старт");
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity() {
        System.out.println("запущена електрика");
    }

    private void startCommand() {
        System.out.println("запущена командна система");
    }

    private void startFuelSystem() {
        System.out.println("запущена паливна система");
    }
}