package Bibiloteca;
/**
 *
 * @author Aaron
 * @author Vanessa
 */
public class Usuario extends Persona{
    private String fechaRegistro;
    
    public Usuario(String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con, String fechaRegistro){
        super(nombre, fechaNacimiento, telefono, direccion, correo, edad, con);
        this.fechaRegistro = fechaRegistro;
    }
    public Usuario(int id, String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con, String fechaRegistro){
        super(id, nombre, fechaNacimiento, telefono, direccion, correo, edad, con);
        this.fechaRegistro = fechaRegistro;
    }
    
    public void setFechaRegistro(String fechaRegistro){this.fechaRegistro = fechaRegistro;}
    public String getFechaRegistro(){return fechaRegistro;}
    
    @Override
    public String getDescripcion(){
        return super.getDescripcion()
                +"\nFechaRegistro:"+fechaRegistro;
    }
    @Override
    public String objetoATexto(){
        return super.objetoATexto()+"|"+fechaRegistro;
    }
}