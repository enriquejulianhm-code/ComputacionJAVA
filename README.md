# Proyecto: Calculadora de Calificaciones en Java

## Descripción

Programa en Java que calcula el promedio y la calificación final de un estudiante a partir de cinco calificaciones de materias.

## Estructura del Proyecto

```
proyecto-calificaciones/
└── src/
    └── Estudiante.java
```

## Clase `Estudiante`

### Atributos
| Atributo | Tipo | Descripción |
|---|---|---|
| `nombre` | `String` | Nombre del participante |
| `calificaciones` | `double[]` | Arreglo con 5 calificaciones |

### Métodos

| Método | Parámetros | Retorno | Descripción |
|---|---|---|---|
| `calcularPromedio` | `double[]` | `double` | Calcula el promedio de las 5 calificaciones |
| `obtenerCalificacion` | `double` | `char` | Retorna la letra según el promedio |
| `imprimirResultados` | `String, double, char` | `void` | Imprime los resultados en pantalla |

### Tabla de Calificaciones

| Rango | Calificación |
|---|---|
| <= 50 | F |
| 51 – 60 | E |
| 61 – 70 | D |
| 71 – 80 | C |
| 81 – 90 | B |
| 91 – 100 | A |

## Compilación y Ejecución

```bash
cd src
javac Estudiante.java
java Estudiante
```

## Ejemplo de Salida

```
Nombre del estudiante: Ana García
Calificación 1: 95.0
Calificación 2: 88.0
Calificación 3: 92.0
Calificación 4: 97.0
Calificación 5: 90.0
Promedio: 92.40
Calificación: A
--------------------------------------------------
Nombre del estudiante: Carlos López
Calificación 1: 75.0
Calificación 2: 78.0
Calificación 3: 72.0
Calificación 4: 80.0
Calificación 5: 76.0
Promedio: 76.20
Calificación: C
--------------------------------------------------
Nombre del estudiante: Luis Martínez
Calificación 1: 40.0
Calificación 2: 45.0
Calificación 3: 38.0
Calificación 4: 50.0
Calificación 5: 42.0
Promedio: 43.00
Calificación: F
```
