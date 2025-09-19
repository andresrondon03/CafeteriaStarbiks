public class BeverageMaker implements BeverageBuilder {

    // Objeto de tipo Beverage que se está construyendo
    private Beverage beverage;

    // Constructor: inicializa el builder reiniciando la bebida
    public BeverageMaker(){
        reset();
    }

    // Se agregan los metodos que se implementan desde BeverageBuilder
    public void reset(){
        beverage = new Beverage();
    }

    public void setBase(String base) {
        beverage.setBase(base);
    }

    public void setMilkType(String milkType) {
        beverage.setMilkType(milkType);
    }

    public void setFlavour(String flavour) {
        beverage.setFlavour(flavour);
    }

    public void setIceCream(boolean iceCream) {
        beverage.setIceCream(iceCream);
    }

    // Devuelve la bebida construida
    public Beverage getBeverage(){
        return this.beverage;
    }
}
