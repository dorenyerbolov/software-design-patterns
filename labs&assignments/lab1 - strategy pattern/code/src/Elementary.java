public class Elementary extends Student {

    public Elementary(int age, String sex){
        super(age, sex);
        setTransportType(new LowPrivilegedTransportType());
        setSportClasses(new LowPrivilegedSportClasses());
    }
}
