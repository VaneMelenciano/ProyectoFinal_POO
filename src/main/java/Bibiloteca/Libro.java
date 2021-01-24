package Bibiloteca;
/**
 *
 * @author Aaron
 * @author Vanessa
 */
public class Libro extends Descripcion{
    private String titulo, autor, editorial, pais;
    private int anioEdicion, numUnidades, numPrestados;
    
    public Libro(){
        numUnidades =0; numPrestados =0;
    }
    public Libro(String titulo, String autor, String editorial, String pais, int anioEdicion, int numUnidades){
        //this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.pais = pais;
        this.anioEdicion = anioEdicion;
        this.numUnidades = numUnidades;
        this.numPrestados = 0;
    }
    
    public void setTitulo(String titulo){this.titulo = titulo;}
    public void setAutor(String autor){this.autor = autor;}
    public void setEditorial(String editorial){this.editorial = editorial;}
    public void setPais(String pais){this.pais = pais;}
    public void setAnioEdicion(int anioEdicion){this.anioEdicion = anioEdicion;}
    public void setNumUnidades(int numUnidades){this.numUnidades = numUnidades;}
    public void setNumPrestados(int numPrestados){this.numPrestados = numPrestados;}
    
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public String getEditorial(){return editorial;}
    public String getPais(){return pais;}
    public int getAnioEdicion(){return anioEdicion;}
    public int getNumUnidades(){return numUnidades;}
    public int getNumPrestados(){return numPrestados;}
    
    @Override
    public String getDescripcion(){
        return "ID: "+id+" Titulo: "+titulo+" Autor: "+autor
                +"\nEditorial: "+editorial+" Pais: "+pais+" Año de Edicion: "+anioEdicion
                +"\nNumero de Unidades: "+numUnidades+" Numero de unidades prestadas: "+numPrestados;
    }
}
