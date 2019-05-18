import BodyControlSystem.*;
import PowertrainControlModule.*;

public class Main {
    public static void main(String args[]){
        BodyControlSystem bcs = new BodyControlSystem(new SeatingSystem(), new LightControl(), new DefoggerSystem(),
                new WiperControl(), new LockingSystem());
        PowertrainControlModule pcm = new PowertrainControlModule(new AirCondition(), new BatterySystem(), new EngineControl(),
                new TransmissionControl());


        bcs.check();
        System.out.println("-----------------------------");
        pcm.check();


    }
}
