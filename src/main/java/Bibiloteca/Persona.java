package Bibiloteca;
/**
 * @author Aaron
 * @author Vanessa
 */
public abstract class  Persona extends Descripcion{
    private String nombre, fechaNacimiento, telefono, direccion, correo, contrasenia;
    protected int edad;
    
    public Persona(String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
        this.contrasenia=con;
    }    
    public Persona(int id, String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con){
        super(id);
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
        this.contrasenia=con;
    }
    public Persona(){
        
    }
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setFechaNacimiento(String fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setCorreo(String correo){this.correo = correo;}
    public void setEdad(int edad){this.edad = edad;}
    public void setContrasenia(String contrasenia){this.contrasenia = contrasenia;}
    
    public String getNombre(){return nombre;}
    public String getFechaNacimiento(){return fechaNacimiento;}
    public String getTelefono(){return telefono;}
    public String getDireccion(){return direccion;}
    public String getCorreo(){return correo;}
    public int getEdad(){return edad;}
    public String getContrasenia(){return contrasenia;}
    
    @Override
    public String getDescripcion(){
        return "ID: "+this.getId()+" Nombre: "+nombre+" Fecha de Nacimiento: "+fechaNacimiento
                +"\nTelefono: "+telefono+" Direccion: "+direccion
                +"\nCorreo: "+correo+" Edad: "+edad;
    }
    @Override
    public String objetoATexto(){
        return getId()+"|"+nombre+"|"+fechaNacimiento+"|"+telefono+"|"+direccion+"|"+correo+"|"+edad+"|"+contrasenia;
    }
}
