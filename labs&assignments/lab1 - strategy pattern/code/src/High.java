public class High extends Student {

    public High(int age, String sex){
        super(age, sex);
        setTransportType(new HighPrivilegedTransportType());
        setSportClasses(new HighPrivilegedSportClasses());
    }
}
