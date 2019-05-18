package fromRetroCARtoModernCAR;

public class CarAdapter implements RetroCar {
    ModernCar modernCar;

    public CarAdapter(ModernCar modernCar) {
        this.modernCar = modernCar;
    }

    @Override
    public void launchRadio() {
        modernCar.launchAssistant();
    }
}
