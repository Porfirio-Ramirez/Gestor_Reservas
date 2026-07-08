public class Validador {
    // validamos que los datos sean correctos
    public static boolean horaValida(int hora) {
        return hora >= 8 && hora <= 17;
    }

    public static boolean nombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    public static boolean servicioValido(int servicio) {
        return servicio == 1 || servicio == 2 || servicio == 3;
    }
}
