package dia_9.models;

/**
 * @author Juan Vásquez, Andrés Tapia, Sebastián Araya, Víctor Briso.
 * @version 1.0
 */
public class Capacitacion {
    //Atributos
    private int identificador;
    private String RUTCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    /**
     *
     */
    public Capacitacion() {

    }

    /**
     *
     * @param identificador
     * @param RUTCliente
     * @param dia
     * @param hora
     * @param lugar
     * @param duracion
     * @param cantidadAsistentes
     */
    public Capacitacion(int identificador, String RUTCliente, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.RUTCliente = RUTCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     *
     * @return identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     *
     * @param identificador
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     *
     * @return RUTCliente
     */
    public String getRUTCliente() {
        return RUTCliente;
    }

    /**
     *
     * @param RUTCliente
     */
    public void setRUTCliente(String RUTCliente) {
        this.RUTCliente = RUTCliente;
    }

    /**
     *
     * @return dia
     */
    public String getDia() {
        return dia;
    }

    /**
     *
     * @param dia
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     *
     * @return hora
     */
    public String getHora() {
        return hora;
    }

    /**
     *
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     *
     * @return lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     *
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     *
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     *
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     *
     * @return cantidadAsistentes
     */
    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    /**
     *
     * @param cantidadAsistentes
     */
    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", RUTCliente='" + RUTCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
