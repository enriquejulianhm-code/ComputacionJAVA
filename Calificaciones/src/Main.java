/**
 * Clase principal que orquesta la ejecución del programa.
 * Crea los estudiantes y usa Calculadora y Reporte.
 */
public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Reporte reporte = new Reporte();

        // ── Estudiante 1 ───────────────────────────────────────────
        double[] notas1 = {95, 88, 92, 97, 90};
        Estudiantes e1 = new Estudiantes("Ana García", notas1);
        double promedio1 = calculadora.calcularPromedio(e1.getCalificaciones());
        char calificacion1 = calculadora.obtenerCalificacion(promedio1);
        reporte.imprimirResultados(e1, promedio1, calificacion1);

        System.out.println("--------------------------------------------------");

        // ── Estudiante 2 ───────────────────────────────────────────
        double[] notas2 = {75, 78, 72, 80, 76};
        Estudiantes e2 = new Estudiantes("Carlos López", notas2);
        double promedio2 = calculadora.calcularPromedio(e2.getCalificaciones());
        char calificacion2 = calculadora.obtenerCalificacion(promedio2);
        reporte.imprimirResultados(e2, promedio2, calificacion2);

        System.out.println("--------------------------------------------------");

        // ── Estudiante 3 ───────────────────────────────────────────
        double[] notas3 = {40, 45, 38, 50, 42};
        Estudiantes e3 = new Estudiantes("Luis Martínez", notas3);
        double promedio3 = calculadora.calcularPromedio(e3.getCalificaciones());
        char calificacion3 = calculadora.obtenerCalificacion(promedio3);
        reporte.imprimirResultados(e3, promedio3, calificacion3);
    }
}
