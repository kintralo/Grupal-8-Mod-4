import java.util.Scanner;
/*Integrantes
Juan Pablo Vasquez
Sebastián Araya
Victor Briso
Andrés Tapia
 */
public class EjercicioGrupal_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia, hora, lugar;
        int duracion, cantidad;
        System.out.println("Ingrese el dia de la capacitación: ");
        dia = entrada.nextLine();
        System.out.println("Ingrese la hora de la capacitación: ");
        hora = entrada.nextLine();
        System.out.println("Ingrese el lugar de la capacitación: ");
        lugar = entrada.nextLine();
        System.out.println("Ingrese la duracion de la capacitación: ");
        duracion = entrada.nextInt();
        System.out.println("Ingrese la cantidad de asistentes a la capacitación: ");
        cantidad = entrada.nextInt();

        String[] nombres = new String[cantidad];
        int[] calificaciones = new int[cantidad];
//llenado de Matriz
        int i;
        for (i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del asistente a la capacitación " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese la calificación entre (1 y 7) para " + nombres[i] + ": ");
            calificaciones[i] = Integer.parseInt(entrada.nextLine());
        }
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (i = 0; i < cantidad; i++) {
            suma += calificaciones[i];
            if (calificaciones[i] > maximo) {
                maximo = calificaciones[i];

            }
            if (calificaciones[i] < minimo) {
                minimo = calificaciones[i];
            }
        }
        //mostrar los resultados
        double promedio = (double) suma / cantidad;
        System.out.println("Datos de Capacitación: ");
        System.out.println("Día " + dia);
        System.out.println("Hora " + hora);
        System.out.println("Lugar " + lugar);
        System.out.println("Duración " + duracion);
        System.out.println("Cantidad de Asistentes " + cantidad);
        System.out.println("Asistentes y Calificaciones:");
        System.out.println("Nombre y Calificación");
        for (i = 0; i < cantidad; i++) {
            System.out.println(nombres[i] + "Calificación: " + calificaciones[i]);
        }
        System.out.println("Promedio de Notas " + promedio);
        System.out.println("Nota mínima " + minimo);
        System.out.println("Nota máxima " + maximo);
    }
}