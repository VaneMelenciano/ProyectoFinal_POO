package Bibiloteca;
/**
 * @author Aaron
 * @author Vanessa
 */
public abstract class Descripcion {
    private int id;
    
    public Descripcion(){}
    public Descripcion(int id){
        this.id = id;
    }
    
    public void setId(int id){this.id = id;}
    public int getId(){return id;}
    
    public abstract String getDescripcion();
}
