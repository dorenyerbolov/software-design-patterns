package fromMPHtoKPH;

public class MeterAdapter implements MPH {
    private KPH kph;

    public MeterAdapter(KPH kph) {
        this.kph = kph;
    }

    @Override
    public double getSpeed() {
        return kph.getSpeed();
    }
}
