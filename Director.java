import java.util.Scanner;

public class Director {

    // Método que construye la bebida ChocoTin
    public void makeChocoTin(BeverageBuilder builder, Scanner sc){
        builder.reset();
        builder.setBase("Leche");

        // Se agrega una variable para el comportamiento del While
        boolean salir = false;
        while(!salir){
            System.out.println("\tSeleccione el tipo de leche que desea:");
            System.out.println("1. Leche entera");
            System.out.println("2. Leche deslactosada");
            System.out.println("3. Leche de almendras");

            int opcion = sc.nextInt();
            sc.nextLine(); //Limpiar buffer

            // Se asigna el tipo de lecge según la opción
            switch (opcion) {
                case 1: {
                    builder.setMilkType("Entera");
                    salir = true;
                    break;
                }
                    
                case 2: {
                    builder.setMilkType("Deslactosada");
                    salir = true;
                    break;
                }    

                case 3: {
                    builder.setMilkType("Almendras");
                    salir = true;
                    break;
                }       

                default:
                    System.out.println("Opción no valida, por favor, ingrese una opción del menú");
                    break;
            }
        }

        // Se establecen sabor y si lleva helado
        builder.setFlavour("Chocolate");
        builder.setIceCream(true);
    }

    // Método que construye la bebida Frezzberry
    public void makeFrezzberry(BeverageBuilder builder){
        builder.reset();
        builder.setBase("Agua");
        builder.setFlavour("Arándano");
        builder.setIceCream(false);

    }

    // Método que construye la bebida Bananini
    public void makeBananini(BeverageBuilder builder, Scanner sc){
        builder.reset();
        builder.setBase("Leche");

        // Se agrega una variable para el comportamiento del While
        boolean salir = false;
        while(!salir){
            System.out.println("\tSeleccione el tipo de leche que desea:");
            System.out.println("1. Leche entera");
            System.out.println("2. Leche deslactosada");
            System.out.println("3. Leche de almendras");

            int opcion = sc.nextInt();
            sc.nextLine(); //Limpiar buffer

            // Se asigna el tipo de lecge según la opción
            switch (opcion) {
                case 1: {
                    builder.setMilkType("Entera");
                    salir = true;
                    break;
                }
                    
                case 2: {
                    builder.setMilkType("Deslactosada");
                    salir = true;
                    break;
                }    

                case 3: {
                    builder.setMilkType("Almendras");
                    salir = true;
                    break;
                }       

                default:
                    System.out.println("Opción no valida, por favor, ingrese una opción del menú");
                    break;
            }
        }

        // Se establecen sabor y si lleva helado
        builder.setFlavour("Banano");
        builder.setIceCream(true);
    }
}
