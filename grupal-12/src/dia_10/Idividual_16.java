package dia_10;

import java.util.Scanner;

/**
 * @author Juan Vásquez, Andrés Tapia, Sebastián Araya, Víctor Briso.
 * @version 1.0
 */
public class Idividual_16 {
    /**
     *
     * @param leer: Variable que contiene el ingreso por teclado.
     * @param password: Contraseña definida por el usuario.
     * @param contador: Cuenta los intentos de ingreso de contraseña
     * @param cont, cont2, cont3: Contraseñas ingresadas en los intentos.
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


