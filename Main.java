import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Variable de control para salir del programa
        boolean salir = false;
        System.out.println("\t\t\t¡¡Bienvenido a Cafeteria Starbiks!!");

        while(!salir){
            System.out.println("\tPor favor, elija una de las siguientes opciones: ");
            System.out.println("1. Pedir ChocoTin");
            System.out.println("2. Pedir Frezzberry");
            System.out.println("3. Pedir Bananini");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); //Limpiar buffer

            // Se crean los objetos necesarios para preparar la bebida
            Director director = new Director();
            BeverageBuilder builder = new BeverageMaker();
            Beverage bebida = null;

            // Se evalúa la opción seleccionada
            switch (opcion) {
                case 1: {
                    // Preparar un ChocoTin
                    director.makeChocoTin(builder, sc);
                    bebida = builder.getBeverage();

                    // Mostrar resumen
                    System.out.println("\t\t\t¡¡Bebida preparada!!");
                    bebida.showSummary();
                    System.out.println("\t\t¡¡Disfruta tu ChocoTin!!\n");
                    break;
                }
                    
                case 2: {
                    // Preparar un Frezzberry
                    director.makeFrezzberry(builder);
                    bebida = builder.getBeverage();

                    // Mostrar resumen
                    System.out.println("\t\t\t¡¡Bebida preparada!!");
                    bebida.showSummary();
                    System.out.println("\t\t¡¡Disfruta tu Frezzberry!!\n");
                    break;
                }    

                case 3: {
                    // Preparar un Bananini
                    director.makeBananini(builder, sc);
                    bebida = builder.getBeverage();

                    // Mostrar resumen
                    System.out.println("\t\t\t¡¡Bebida preparada!!");
                    bebida.showSummary();
                    System.out.println("\t¡¡Disfruta tu Bananini!!\n");
                    break;
                }       

                case 4:
                    // Finalizar el programa
                    salir = true;
                    System.out.println("\t\tGracias por visitar Cafeteria Starbiks, esperamos verte pronto");
                    break;
                default:
                    // Validacion de un posible error por parte del usuario
                    System.out.println("\t\t\t¡¡Opción no valida, por favor, ingrese una opción del menú!!\n");
                    break;
            }
        }
        sc.close();
    }
}