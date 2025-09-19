public interface BeverageBuilder {
    
    // Se agregan los métodos que permiten reiniciar, configurar la bebida y obtenerla.

    void reset();
    void setBase(String base);
    void setMilkType(String milktype);
    void setFlavour(String flavour);
    void setIceCream(boolean iceCream);
    Beverage getBeverage();
}