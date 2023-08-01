package dia_9.models;

import java.util.Date;


/**
 * @author Juan Vásquez, Andrés Tapia, Sebastián Araya, Víctor Briso.
 * @version 1.0
 */
public class Usuario {
    //Atributos
    String Nombre;
    Date Fecha_de_nacimiento;
    String RUN;

    /**
     *
     */
    public Usuario() {
    }

    /**
     *
     * @param nombre
     * @param fecha_de_nacimiento
     * @param RUN
     */
    public Usuario(String nombre, Date fecha_de_nacimiento, String RUN) {
        Nombre = nombre;
        Fecha_de_nacimiento = fecha_de_nacimiento;
        this.RUN = RUN;
    }

    /**
     *
     * @param maría
     * @param s
     * @param run
     */
    public Usuario(String maría, String s, String run) {
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /**
     *
     * @return Fecha_de_nacimiento
     */
    public Date getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }

    /**
     *
     * @param fecha_de_nacimiento
     */
    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        Fecha_de_nacimiento = fecha_de_nacimiento;
    }

    /**
     *
     * @return RUN
     */
    public String getRUN() {
        return RUN;
    }

    /**
     *
     * @param RUN
     */
    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Fecha_de_nacimiento=" + Fecha_de_nacimiento +
                ", RUN='" + RUN + '\'' +
                '}';
    }
}
