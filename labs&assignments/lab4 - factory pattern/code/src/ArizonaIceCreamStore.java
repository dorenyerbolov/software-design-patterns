public class ArizonaIceCreamStore extends IceCreamStore {
    @Override
    protected IceCream createIceCream(String type){
        switch(type){
            case "rocky":
                return new ArizonaRockyRoad();
            case "peanut":
                return new ArizonaPeanutCream();
            case "cookie":
                return new ArizonaCookieDough();
            case "cherry":
                return new ArizonaCherryBlossom();
            default:
                return null;
        }
    }
}
