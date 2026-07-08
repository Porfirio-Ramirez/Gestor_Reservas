import java.util.Scanner;

public class Menu {
    /*
     * Aqui contiene dos metodos, uno para el menu y
     * otro para leer la opcion deseada por el usuadio
     */
    public static void mostrarMenu() {
        System.out.println("[1] Agendar cita");
        System.out.println("[2] Listado de reservas");
        System.out.println("[3] Cancelar reserva");
        System.out.println("[4] Ver reporte del dia");
        System.out.println("[5] Salir");
    }

    public static int leerOpcion(Scanner sc) {
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }
}
