
package modeloVO;

/**
 *
 * @author 57320
 */
public class Votante {
    private int id;
    private String nombre;
    private String email;
    private String documento;
    private int tipoDocumento;
    private int eleccion;
    public Votante(){
        
    }
    public Votante(int id, String nombre, String email, String documento, int tipoDocumento, int eleccion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.eleccion = eleccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }
}
