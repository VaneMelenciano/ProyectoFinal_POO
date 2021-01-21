package Bibiloteca;
/**
 *
 * @author Aaron
 * @author Vanessa
 */
public class Usuario extends Persona{
    private String fechaRegistro;
    
    public Usuario(){}
    public Usuario(int id, String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String fechaRegistro){
        super(id, nombre, fechaNacimiento, telefono, direccion, correo, edad);
        this.fechaRegistro = fechaRegistro;
    }
    
    public void setFechaRegistro(String fechaRegistro){this.fechaRegistro = fechaRegistro;}
    public String getFechaRegistro(){return fechaRegistro;}
    
    @Override
    public String getDescripcion(){
        return super.getDescripcion()+" FechaRegistro:"+fechaRegistro;
    }
}