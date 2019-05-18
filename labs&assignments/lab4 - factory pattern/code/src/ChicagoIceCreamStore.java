public class ChicagoIceCreamStore extends IceCreamStore {
    @Override
    protected IceCream createIceCream(String type){
        switch(type){
            case "rocky":
                return new ChicagoRockyRoad();
            case "peanut":
                return new ChicagoPeanutCream();
            case "cookie":
                return new ChicagoCookieDough();
            case "cherry":
                return new ChicagoCherryBlossom();
            default:
                return null;
        }
    }
}
