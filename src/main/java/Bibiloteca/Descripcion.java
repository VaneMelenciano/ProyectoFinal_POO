package Bibiloteca;
/**
 * @author Aaron
 * @author Vanessa
 */
public abstract class Descripcion {
    protected int id;

    public void setId(int id){this.id = id;}
    public int getId(){return id;}
    
    public abstract String getDescripcion();
}
