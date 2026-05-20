/**
 * Clase responsable de imprimir los resultados
 * del estudiante en el formato requerido.
 */
public class Reporte {

    /**
     * Imprime en consola toda la información del estudiante.
     *
     * @param estudiante   Objeto con nombre y calificaciones
     * @param promedio     Promedio calculado
     * @param calificacion Calificación en letra
     */
    public void imprimirResultados(Estudiantes estudiante, double promedio, char calificacion) {
        double[] calificaciones = estudiante.getCalificaciones();

        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
