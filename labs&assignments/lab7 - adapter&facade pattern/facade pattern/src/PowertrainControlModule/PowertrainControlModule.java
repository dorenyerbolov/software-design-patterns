package PowertrainControlModule;

public class PowertrainControlModule {
    private AirCondition airCondition;
    private BatterySystem batterySystem;
    private EngineControl engineControl;
    private TransmissionControl transmissionControl;

    public PowertrainControlModule(AirCondition airCondition, BatterySystem batterySystem, EngineControl engineControl,
                                   TransmissionControl transmissionControl) {
        this.airCondition = airCondition;
        this.batterySystem = batterySystem;
        this.engineControl = engineControl;
        this.transmissionControl = transmissionControl;
    }

    public void check() {
        System.out.println("Starting the POWERTRAIN CONTROL MODULE.");
        batterySystem.display();
        engineControl.engineOn();
        transmissionControl.check();
        airCondition.start();
    }
}
