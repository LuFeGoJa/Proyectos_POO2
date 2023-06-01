package modeloVO;

import java.sql.Date;

/**
 *
 * @author 57320
 */
public class Eleccion {
    private Integer id;
    private String nombre;
    private String cargo;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Eleccion() {
        
    }

    public Eleccion(Integer id, String nombre, String cargo, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
