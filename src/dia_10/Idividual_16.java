package dia_10;

import java.util.Scanner;

/**
 * @author Juan Vásquez
 */
public class Idividual_16 {
    /***
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String password = "pass123";
        int contador = 1;
        System.out.println("ingrese contraseña oportunidad " + contador);
        String cont = leer.nextLine();
        if (cont.equals(password)) {
            System.out.println("la contraseña es correcta");
        } else {
            contador++;
            System.out.println("Reingrese contraseña. Reingrese contraseña oportunidad " + contador);
            String cont2 = leer.nextLine();
            if (cont2.equals(password)) {
                System.out.println("la contrasenia es correcta");
            } else {
                contador++;
                System.out.println("Contraseña incorrecta. Reingrese la contraseña oportunidad " + contador);
                String cont3 = leer.nextLine();
                if (cont3.equals(password)) {
                    System.out.println("la contrasenia es correcta");
                } else {
                    contador++;
                    System.out.println("Contraseña incorrecta. No hay mas oportunidades");
                }
            }
        }

    }
}
