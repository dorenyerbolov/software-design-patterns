public class SecondCourseOrder implements Order {
    private Chef chef;

    public SecondCourseOrder(Chef chef){
        this.chef = chef;
    }

    public void execute(){
        chef.cookSecondCourse();
    }
}
