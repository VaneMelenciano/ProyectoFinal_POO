package Bibiloteca;
/**
 * @author Aaron
 * @author Vanessa
 */
public class Empleado extends Persona{
    private String puesto;
    private float sueldo;
    
    public Empleado(String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con, String puesto, float sueldo){
        super(nombre, fechaNacimiento, telefono, direccion, correo, edad, con);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }    
    public Empleado(int id, String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con, String puesto, float sueldo){
        super(id, nombre, fechaNacimiento, telefono, direccion, correo, edad, con);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    public Empleado(){
        super();
    }
    
    public void setPuesto(String puesto){this.puesto = puesto;}
    public void setSueldo(float sueldo){this.sueldo = sueldo;}
    
    public String getPuesto(){return puesto;}
    public float getSueldo(){return sueldo;}
    
    @Override
    public String getDescripcion(){
        return super.getDescripcion()
                +"\nPuesto: "+puesto+" Sueldo: "+sueldo;
    }
    @Override
    public String objetoATexto(){
        return super.objetoATexto()+"|"+puesto+"|"+sueldo;
    }
}
