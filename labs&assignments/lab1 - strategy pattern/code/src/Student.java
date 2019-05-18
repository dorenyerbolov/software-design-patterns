public abstract class Student {
    private int grade;
    private String sex;
    TransportType transportType;
    SportClasses sportClasses;

    public Student(int grade, String sex) {
        this.grade = grade;
        this.sex = sex;
    }

    public void getTransportType() {
        transportType.getToSchool();
    }

    public void getSportClasses() {
        sportClasses.allowableClasses();
    }

    public void setTransportType(TransportType tp) {
        transportType = tp;
    }

    public void setSportClasses(SportClasses sp) {
        sportClasses = sp;
    }


}
