package Bibiloteca;
import java.util.ArrayList;

/**
 *
 * @author Vanessa
 * @author Aaron
 */
public abstract class Documentos extends Descripcion{
    private int usuarioId;
    private String librosPrestados;
    private String fechaActual;
    
    public Documentos (int usuarioId, String librosPrestados, String fechaActual){ 
        this.usuarioId = usuarioId;
        this.librosPrestados = librosPrestados;
        this.fechaActual = fechaActual;
    }    
    public Documentos (int id, int usuarioId, String librosPrestados, String fechaActual){ 
        super(id);
        this.usuarioId = usuarioId;
        this.librosPrestados = librosPrestados;
        this.fechaActual = fechaActual;
    }
    public Documentos(){
        
    }
    public void setLibrosPrestados(String lib){
        librosPrestados=lib;
    }
    public String getLibrosPrestados(){
        return librosPrestados;
    }
    public void setFechaActual(String fa){
        fechaActual = fa;
    }
    public String getFechaActual(){
        return fechaActual;
    }
    public void setUsuarioId(int uId){
        usuarioId = uId;
    }
    public int getUsuarioId(){
        return usuarioId;
    }
    
     @Override
    public String getDescripcion(){
        String descripcion = "ID: "+this.getId()+" Fecha Solicitud: "+fechaActual+" Usuario id:"
                + usuarioId +"\n Id Libros Prestados: "+librosPrestados; 
        return descripcion;
    }
    @Override
    public String objetoATexto(){
        return getId()+"|"+usuarioId+"|"+librosPrestados+"|"+fechaActual;
    }
}
