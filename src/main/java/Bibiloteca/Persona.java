package Bibiloteca;
/**
 * @author Aaron
 * @author Vanessa
 */
public abstract class  Persona extends Descripcion{
    protected String nombre, fechaNacimiento, telefono, direccion, correo;
    protected int edad;
    
    public Persona(){}
    public Persona(int id, String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad){
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setFechaNacimiento(String fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setCorreo(String correo){this.correo = correo;}
    public void setEdad(int edad){this.edad = edad;}
    
    public String getNombre(){return nombre;}
    public String getFechaNacimiento(){return fechaNacimiento;}
    public String getTelefono(){return telefono;}
    public String getDireccion(){return direccion;}
    public String getCorreo(){return correo;}
    public int getEdad(){return edad;}
    
    @Override
    public String getDescripcion(){
        //se le pueden poner "\n" para que no esté todo en una sola linea.
        return "ID: "+id+" Nombre: "+nombre+" Fecha de Nacimiento: "+fechaNacimiento+" Telefono: "+telefono
                +" Direccion: "+direccion+" Correo: "+correo+" Edad: "+edad;
    }
}
