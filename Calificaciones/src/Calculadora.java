/**
 * Clase que contiene la lógica para calcular
 * el promedio y la calificación final del estudiante.
 */
public class Calculadora {

    /**
     * Calcula el promedio aritmético de un arreglo de calificaciones.
     *
     * @param calificaciones Arreglo con las cinco calificaciones
     * @return Promedio como valor double
     */
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;
    }

    /**
     * Determina la calificación en letra según el promedio.
     *
     * Tabla:
     *  <= 50  → F
     *  51-60  → E
     *  61-70  → D
     *  71-80  → C
     *  81-90  → B
     *  91-100 → A
     *
     * @param promedio Valor numérico del promedio
     * @return Carácter con la calificación final
     */
    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
