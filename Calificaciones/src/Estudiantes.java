
    public class Estudiantes {

        // Atributo tipo String: nombre del participante
        private String nombre;

        // Atributo tipo array: calificaciones de cinco materias
        private double[] calificaciones;

        /**
         * Constructor de la clase Estudiante.
         *
         * @param nombre         Nombre del estudiante
         * @param calificaciones Arreglo con las cinco calificaciones
         */
        public Estudiantes(String nombre, double[] calificaciones) {
            this.nombre = nombre;
            this.calificaciones = calificaciones;
        }

        /**
         * Método 1: Calcula el promedio de las cinco calificaciones.
         *
         * @param calificaciones Arreglo con las cinco calificaciones
         * @return El promedio como valor numérico (double)
         */
        public double calcularPromedio(double[] calificaciones) {
            double suma = 0;
            for (double cal : calificaciones) {
                suma += cal;
            }
            return suma / calificaciones.length;
        }

        /**
         * Método 2: Obtiene la calificación final (letra) a partir del promedio.
         *
         * Tabla de equivalencias:
         *  <= 50  → F
         *  51-60  → E
         *  61-70  → D
         *  71-80  → C
         *  81-90  → B
         *  91-100 → A
         *
         * @param promedio Valor numérico del promedio
         * @return Carácter que representa la calificación final
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

        /**
         * Método 3: Imprime en pantalla los resultados del estudiante.
         *
         * @param nombre       Nombre del estudiante
         * @param promedio     Promedio calculado
         * @param calificacion Calificación en letra
         */
        public void imprimirResultados(String nombre, double promedio, char calificacion) {
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Calificación 1: " + calificaciones[0]);
            System.out.println("Calificación 2: " + calificaciones[1]);
            System.out.println("Calificación 3: " + calificaciones[2]);
            System.out.println("Calificación 4: " + calificaciones[3]);
            System.out.println("Calificación 5: " + calificaciones[4]);
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.println("Calificación: " + calificacion);
        }

        // ─── Programa principal ────────────────────────────────────────────────────

        public static void main(String[] args) {

            // Ejemplo 1: Estudiante con calificación A
            double[] notas1 = {95, 88, 92, 97, 90};
            Estudiantes e1 = new Estudiantes("Ana García", notas1);
            double promedio1 = e1.calcularPromedio(notas1);
            char calificacion1 = e1.obtenerCalificacion(promedio1);
            e1.imprimirResultados(e1.nombre, promedio1, calificacion1);

            System.out.println("--------------------------------------------------");

            // Ejemplo 2: Estudiante con calificación C
            double[] notas2 = {75, 78, 72, 80, 76};
            Estudiantes e2 = new Estudiantes("Carlos López", notas2);
            double promedio2 = e2.calcularPromedio(notas2);
            char calificacion2 = e2.obtenerCalificacion(promedio2);
            e2.imprimirResultados(e2.nombre, promedio2, calificacion2);

            System.out.println("--------------------------------------------------");

            // Ejemplo 3: Estudiante con calificación F
            double[] notas3 = {40, 45, 38, 50, 42};
            Estudiantes e3 = new Estudiantes("Luis Martínez", notas3);
            double promedio3 = e3.calcularPromedio(notas3);
            char calificacion3 = e3.obtenerCalificacion(promedio3);
            e3.imprimirResultados(e3.nombre, promedio3, calificacion3);
        }
    }