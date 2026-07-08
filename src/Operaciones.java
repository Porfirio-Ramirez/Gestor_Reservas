import java.util.Scanner;

public class Operaciones {
    static final int Max = 50;
    static String[] nombres = new String[Max];
    static int[] horas = new int[Max];
    static int[] codigos = new int[Max];
    static int total = 0;

    public static void agendar(Scanner cs) {
        // 1. ¿Hay cupo?
        if (total == Max) {
            System.out.println("No hay cupo disponible.");
            return;
        }

        // 2. Pide y valida el nombre
        String nombre;
        do {
            System.out.println("Ingrese su nombre:");
            nombre = cs.nextLine();
            if (!Validador.nombreValido(nombre)) {
                System.out.println("Nombre invalido, intenta de nuevo.");
            }
        } while (!Validador.nombreValido(nombre));

        // 3. Pide y valida la hora
        int hora;
        do {
            System.out.println("Ingrese la hora (8-17):");
            hora = Integer.parseInt(cs.nextLine());
            if (!Validador.horaValida(hora)) {
                System.out.println("Hora invalida, debe ser entre 8 y 17.");
            }
        } while (!Validador.horaValida(hora));

        // 4. ¿Esa hora ya está ocupada?
        for (int i = 0; i < total; i++) {
            if (horas[i] == hora) {
                System.out.println("Esa hora ya esta ocupada.");
                return;
            }
        }

        // 5. Pide y valida el servicio
        int servicio;
        do {
            System.out.println("Ingrese el servicio (1-Corte, 2-Tinte, 3-Manicure):");
            servicio = Integer.parseInt(cs.nextLine());
            if (!Validador.servicioValido(servicio)) {
                System.out.println("Servicio invalido, elige 1, 2 o 3.");
            }
        } while (!Validador.servicioValido(servicio));

        // 6. Guarda y aumenta el contador
        nombres[total] = nombre;
        horas[total] = hora;
        codigos[total] = servicio;
        total++;
        System.out.println("Reserva agendada correctamente.");
    }

    public static void listar() {
        if (total == 0) {
            System.out.println("Aun no hay reservas.");
            return;
        }
        for (int i = 0; i < total; i++) {
            System.out.println("====================");
            System.out.println("Reserva #" + (i + 1));
            System.out.println("Nombre:   " + nombres[i]);
            System.out.println("Hora:     " + horas[i] + ":00");
            System.out.println("Servicio: " + nombreServicio(codigos[i]));
        }
    }

    public static void cancelar(Scanner cs) {
        if (total == 0) {
            System.out.println("No hay reservas para cancelar.");
            return;
        }
        System.out.println("Ingrese el numero de reserva a cancelar (1-" + total + "):");
        int numero = Integer.parseInt(cs.nextLine()) - 1;

        if (numero < 0 || numero >= total) {
            System.out.println("Reserva no existe.");
            return;
        }

        // mueve todas las reservas una posición hacia atrás
        for (int i = numero; i < total - 1; i++) {
            nombres[i] = nombres[i + 1];
            horas[i] = horas[i + 1];
            codigos[i] = codigos[i + 1];
        }
        total--;
        System.out.println("Reserva cancelada correctamente.");
    }

    public static void reporte() {
        System.out.println("====================");
        System.out.println("REPORTE DEL DIA");
        System.out.println("====================");
        System.out.println("Total de citas: " + total);

        double facturado = 0;
        for (int i = 0; i < total; i++) {
            switch (codigos[i]) {
                case 1:
                    facturado += 500;
                    break;
                case 2:
                    facturado += 800;
                    break;
                case 3:
                    facturado += 350;
                    break;
            }
        }
        System.out.println("Total facturado: $" + facturado);
    }

    // traduce el código 1,2,3 a su nombre
    private static String nombreServicio(int codigo) {
        switch (codigo) {
            case 1:
                return "Corte";
            case 2:
                return "Tinte";
            case 3:
                return "Manicure";
            default:
                return "Desconocido";
        }
    }
}
