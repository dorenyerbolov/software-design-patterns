package BodyControlSystem;

public class BodyControlSystem {
    private SeatingSystem seatingSystem;
    private LightControl lightControl;
    private DefoggerSystem defoggerSystem;
    private WiperControl wiperControl;
    private LockingSystem lockingSystem;

    public BodyControlSystem(SeatingSystem seatingSystem, LightControl lightControl, DefoggerSystem defoggerSystem,
                             WiperControl wiperControl, LockingSystem lockingSystem) {
        this.seatingSystem = seatingSystem;
        this.lightControl = lightControl;
        this.defoggerSystem = defoggerSystem;
        this.wiperControl = wiperControl;
        this.lockingSystem = lockingSystem;
    }

    public void check() {
        System.out.println("Checking the BODY CONTROL SYSTEM.");
        lockingSystem.unlock();
        seatingSystem.adjust();
        wiperControl.start();
        defoggerSystem.remove();
        lightControl.turnOn();
    }
}
