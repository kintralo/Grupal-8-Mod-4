package dia_10;
import java.util.Scanner;
/**
 * @author Juan Vásquez, Andrés Tapia, Sebastián Araya, Víctor Briso.
 * @version 1.0
 */
public class Grupal_10 {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int notas[];
        int participantes, iteral=0, auxNota, min;
        float acumuladorNotas=0;
        String nombres[], datosGenerales[], auxNombre;
        datosGenerales          =   new String[6];
        System.out.println("Ingrese el nombre de la capacitación");
        Scanner leer            =   new Scanner (System.in);
        datosGenerales[0]       =   leer.nextLine();
        System.out.println("Ingrese el día de la capacitación");
        leer                    =   new Scanner (System.in);
        datosGenerales[1]       =   leer.nextLine();
        System.out.println("Ingrese la hora de la capacitación");
        leer                    =   new Scanner (System.in);
        datosGenerales[2]       =   leer.nextLine();
        System.out.println("Ingrese el lugar de la capacitación");
        leer                    =   new Scanner (System.in);
        datosGenerales[3]       =   leer.nextLine();
        System.out.println("Ingrese la duración de la capacitación");
        leer                    =   new Scanner (System.in);
        datosGenerales[4]       =   leer.nextLine();
        System.out.println("Ingrese la cantidad de participantes de la capacitación");
        leer                    =   new Scanner (System.in);
        participantes           =   leer.nextInt();
        datosGenerales[5]       =   String.valueOf(participantes);
        notas                   =   new int[participantes];
        nombres                 =   new String[participantes];
        for (int i = 0; i<participantes; i++){
            System.out.println("Ingrese el nombre del participante "+(i+1));
            leer                =   new Scanner (System.in);
            nombres[i]          =   leer.nextLine();
            System.out.println("Ingrese la nota de "+ nombres[i]);
            leer                =   new Scanner (System.in);
            notas[i]            =   leer.nextInt();
            acumuladorNotas     =   acumuladorNotas+notas[i];
        }
        for (int i=0; i<participantes; i++){
            min=i;
            for (int k=(i+1); k<participantes; k++){
                if(notas[k]<notas[min]){
                    min=k;
                }
            }
            auxNota         =       notas[i];
            notas[i]        =       notas[min];
            notas[min]      =       auxNota;
            auxNombre       =       nombres[i];
            nombres[i]      =       nombres[min];
            nombres[min]    =       auxNombre;
        }
        System.out.println("Nombre capacitación: "+datosGenerales[0]);
        System.out.println("Día capacitación: "+datosGenerales[1]);
        System.out.println("Hora capacitación: "+datosGenerales[2]);
        System.out.println("Lugar capacitación: "+datosGenerales[3]);
        System.out.println("Duración capacitación: "+datosGenerales[4]);
        System.out.println("Participantes capacitación: "+datosGenerales[5]);
        System.out.println("La nota más alta fue del alumno "+nombres[participantes-1]+" con una nota de: "+notas[participantes-1]);
        System.out.println("La nota más baja fue del alumno "+nombres[0]+" con una nota de: "+notas[0]);
        System.out.println("El promedio de la capacitación fue de: "+acumuladorNotas/participantes);
    }
}