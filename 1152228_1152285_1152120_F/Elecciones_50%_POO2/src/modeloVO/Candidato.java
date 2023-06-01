
package modeloVO;

/**
 *
 * @author 57320
 */
public class Candidato {
    
    Integer id, eleccion, numero;
    String documento, nombre, apellido;
    
    public Candidato(){
        
    }

    public Candidato(Integer id, String documento, String nombre, String apellido, Integer eleccion, Integer numero   ) {
        this.id = id;
        this.eleccion = eleccion;
        this.numero = numero;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEleccion() {
        return eleccion;
    }

    public void setEleccion(Integer eleccion) {
        this.eleccion = eleccion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
