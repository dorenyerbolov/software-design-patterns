public class Main {
    public static void main(String args[]){
        Student s1 = new Middle(4, "girl");
        s1.getTransportType();
        s1.getSportClasses();
        s1.setTransportType(new HighPrivilegedTransportType());
        s1.setSportClasses(new LowPrivilegedSportClasses());
        s1.getTransportType();
        s1.getSportClasses();
    }
}
