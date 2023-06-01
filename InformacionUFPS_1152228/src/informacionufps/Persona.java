
package informacionufps;

public class Persona {
   int codigo;
   String nombre, apellido;
   
   
   public Persona(){
   }
   
   public Persona(String nombre, String apellido, int codigo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.codigo=codigo;
   }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
   
    
}
