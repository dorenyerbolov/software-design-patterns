import fromMPHtoKPH.*;
import fromRetroCARtoModernCAR.*;

public class Main {
    public static void main(String args[]) {
        Ford ford = new Ford();
        System.out.println("MPH's getSpeed()");
        System.out.println(ford.getSpeed());

        Toyota tyt = new Toyota();
        System.out.println("KPH's getSpeed()");
        System.out.println(tyt.getSpeed());

        MPH mph = new MeterAdapter(tyt); // wrapping Toyota with KPH into MeterAdapter which makes it look like MPH
        System.out.println("MeterAdapter's getSpeed()");
        System.out.println(mph.getSpeed());

        System.out.println("------------------------");
        /// Adapter to Retro Car

        VintageDodge vd = new VintageDodge();
        System.out.println("RetroCar's launchRadio()");
        vd.launchRadio();

        ModernDodge md = new ModernDodge();
        System.out.println("ModernCar's launchAssistant()");
        md.launchAssistant();

        RetroCar rc = new CarAdapter(md);
        System.out.println("CarAdapter's launchRadio()");
        rc.launchRadio();
    }
}
