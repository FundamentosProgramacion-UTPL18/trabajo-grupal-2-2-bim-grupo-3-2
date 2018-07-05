package grupal3;

public class Principal {

    public static void main(String[] args) {
        //Declaramos variables donde almacenamos valores
        String[] nombres = {"José", "María", "Ana", "Paul", "David"};
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edades = {20, 19, 20, 19, 25};
        double[] calificaciones1 = {9.1, 10, 8, 7, 9.1};
        double[] calificaciones2 = {6.1, 5, 10, 7.2, 4.1};
        //creo una lista de estudiantes
        Estudiante[] estudiantes = new Estudiante[5];
        //Recorro con este ciclo los datos de nombre,apellido,edad,calificacione1 y calificacion2
        for (int i = 0; i < nombres.length; i++) {
            //creamos objeto estudiante
            Estudiante e = new Estudiante();
            //Asignamos valores al objeto estudiante
            e.nombre = nombres[i];
            e.apellido = apellidos[i];
            e.edad = edades[i];
            e.calificacion1 = calificaciones1[i];
            e.calificacion2 = calificaciones2[i];
            estudiantes[i]=e;
        }
        //imprimimos reporte
        String reporte = "";
        for (int i = 0; i < estudiantes.length; i++) {
            //obtenemos el promedio
            double promedio = (estudiantes[i].calificacion1 + estudiantes[i].calificacion2) / 2;
            reporte += String.format("\n%s %s\nEdad - %d\nCalificacion 1: %.2f\nCalificacion 2: %.2f\nPromedio: %.2f\n", estudiantes[i].nombre, estudiantes[i].apellido, estudiantes[i].edad, estudiantes[i].calificacion1, estudiantes[i].calificacion2, promedio);
        }
        System.out.println(reporte);
    }

}
