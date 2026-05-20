
/**
 * Clase modelo que representa a un estudiante.
 * Almacena el nombre y las cinco calificaciones.
 */
public class Estudiantes {

    private String nombre;
    private double[] calificaciones;

    public Estudiantes(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }
}