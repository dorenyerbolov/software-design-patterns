public class Middle extends Student {

    public Middle(int age, String sex){
        super(age, sex);
        setTransportType(new MediumPrivilegedTransportType());
        setSportClasses(new MediumPrivilegedSportClasses());
    }
}
