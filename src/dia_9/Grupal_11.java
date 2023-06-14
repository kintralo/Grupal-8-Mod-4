package dia_9;

/**
 * @author Juan Vásquez, Andrés Tapia, Sebastián Araya, Víctor Briso.
 * @version 1.0
 */
public class Grupal_11 {
    /**
     * @param valorConstante: Variable booleana que está configurada como falso.
     * @param mensaje: Frase genérica que se muestra.
     * @param ola: Variable n umericxa que cuenta hasta 10 veces
     * @param   i: Variable que parte desde cero.
     */
    public static void main(String[] args) {
        final boolean valorConstante = false;
        String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Donec facilisis est ac ante viverra, " +
                "vel efficitur leo consequat.Maecenas quis lorem sit amet diam consequat lacinia non nec lacus.Phasellus" +
                " egestas quam non dui dictum, sed fermentum dolor efficitur.Aliquam volutpat ex sodales pulvinar " +
                "scelerisque.Donec sodales cursus tortor eu aliquam.Curabitur id purus arcu.Vestibulum ante ipsum primis" +
                " in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse pretium, quam non consectetur " +
                "scelerisque, diam tortor iaculis arcu, nec tincidunt diam eros sed urna.Ut at consequat enim." +
                "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.Donec sit " +
                "amet ultricies dui.Donec aliquet rhoncus velit et sollicitudin.";

        
        int ola = 10;
        for (int i = 0; i < ola; i++) {
            System.out.println("Valor: " + (i * i));
        }

        // Esto es un comentario demasiado grande para que esté en una sola línea
        
        System.out.println("El mensaje es" + mensaje);
        System.out.println("El valor de la constante es: " + valorConstante);
    }

}
