public class Beverage {

    // Se agregan las variables del programa
    private String base;
    private String milkType;
    private String flavour;
    private boolean iceCream;


    // Se agregan los métodos setter para las variables
    public void setBase(String base) {
        this.base = base;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setIceCream(boolean iceCream) {
        this.iceCream = iceCream;
    }

    // Método que imprime en pantalla la información de la bebida
    public void showSummary(){
        System.out.println("\t\t¡¡Resumen de la bebida elegida!!    ");
        System.out.println("\tBase: " + base);
        if (base.equalsIgnoreCase("leche")){
            System.out.println("\tTipo de leche: " + milkType);
        }
        System.out.println("\tSabor: " + flavour);
        System.out.println("\t¿Helado?: " + (iceCream ? "Sí" : "No"));
    }
}
