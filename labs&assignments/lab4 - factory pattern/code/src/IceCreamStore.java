public abstract class IceCreamStore {
    public IceCream orderIceCream(String type){
        IceCream ic;

        ic = createIceCream(type);
        ic.prepare();
        ic.pack();

        return ic;
    }

    protected abstract IceCream createIceCream(String type);
}
