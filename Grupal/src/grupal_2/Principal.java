package grupal_2;

public class Principal {

    public static void main(String[] args) {
        String[] nombres = {"José", "María", "Ana", "Paul", "David"};
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edades = {20, 19, 20, 19, 25};
        double[] calificaciones1 = {9.1, 10, 8, 7, 9.1};
        double[] calificaciones2 = {6.1, 5, 10, 7.2, 4.1};
        Estudiante[] estudiantes = new Estudiante[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(i);
            estudiantes[i].nombre = nombres[i];
            estudiantes[i].apellido = apellidos[i];
            estudiantes[i].edad = edades[i];
            estudiantes[i].calificacion1 = calificaciones1[i];
            estudiantes[i].calificacion2 = calificaciones2[i];
        }
        
        String reporte = "";
        for (int i = 0; i < estudiantes.length; i++) {
            double promedio = (estudiantes[i].calificacion1 + estudiantes[i].calificacion2) / 2;
            reporte += String.format("\n%s %s\nEdad - %d\nCalificacion 1: %.2f\nCalificacion 2: %.2f\nPromedio: %.2f\n", estudiantes[i].nombre, estudiantes[i].apellido, estudiantes[i].edad, estudiantes[i].calificacion1, estudiantes[i].calificacion2, promedio);
        }
        System.out.println(reporte);
    }

}
