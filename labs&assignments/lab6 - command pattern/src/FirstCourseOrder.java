public class FirstCourseOrder implements Order {
    private Chef chef;

    public FirstCourseOrder(Chef chef){
       this.chef = chef;
    }

    public void execute(){
        chef.cookFirstCourse();
    }
}
