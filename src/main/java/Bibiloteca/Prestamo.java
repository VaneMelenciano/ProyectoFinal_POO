package Bibiloteca;
import java.util.ArrayList;
/**
 *
 * @author Aaron
 * @author Vanessa
 */
public class Prestamo extends Documentos{
    private String plazoDev, fechaDev;
    
    public Prestamo(int usuarioId, String librosPrestados, String fechaActual, String plazoDev, String fechaDev){
        super(usuarioId, librosPrestados, fechaActual);
        this.plazoDev = plazoDev;
        this.fechaDev = fechaDev;
    }  
    public Prestamo(int id, int usuarioId, String librosPrestados, String fechaActual, String plazoDev, String fechaDev){
        super(id, usuarioId, librosPrestados, fechaActual);
        this.plazoDev = plazoDev;
        this.fechaDev = fechaDev;
    }
    public Prestamo(){
        
    }
    
    public void setFechaDev(String fd){
        fechaDev = fd;
    }
    public String getFechaDev(){
        return fechaDev;
    }
    public void setPlazoDev(String pd){
        plazoDev = pd;
    }
    public String getPlazoDev(){
        return plazoDev;
    }
    @Override
    public String getDescripcion() {
        return super.getDescripcion()
                +"Plazo de devolución: " + plazoDev + "   Fecha de devolucion: " + fechaDev;
    }
    @Override
    public String objetoATexto(){
        return super.objetoATexto()+"|"+plazoDev+"|"+fechaDev+"|P";
    }
}
