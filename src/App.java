import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Aqui es donde corre el sistema y se selecciona la opcion deseada
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            Menu.mostrarMenu();
            opcion = Menu.leerOpcion(entrada);

            switch (opcion) {
                case 1:
                    Operaciones.agendar(entrada);
                    break;
                case 2:
                    Operaciones.listar();
                    break;
                case 3:
                    Operaciones.cancelar(entrada);
                    break;

                case 4:
                    Operaciones.reporte();
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor seleccionar una opcion dentro de 1  5");
                    break;
            }
        }

    }
}
