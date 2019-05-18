public class Client {
    public static void main(String[] args){
        Chef Ramsay = new Chef();
        Waiter jay = new Waiter();
        // performing first course order by chef Gordon Ramsay
        jay.setOrder(new FirstCourseOrder(Ramsay));
        jay.placeOrder();

        // performing second course order by chef Gordon Ramsay
        jay.setOrder(new SecondCourseOrder(Ramsay));
        jay.placeOrder();
    }
}
