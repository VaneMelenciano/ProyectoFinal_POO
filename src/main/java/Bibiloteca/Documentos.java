/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;
import java.util.ArrayList;

/**
 *
 * @author Vanessa
 * @author Aaron
 */
public abstract class Documentos extends Descripcion{
    protected Usuario usuario;
    protected ArrayList<Libro> librosPrestados;
    protected String fechaAct; //fecha Actual
    public Documentos (){ 
        librosPrestados = new ArrayList();
    }
    public Documentos (ArrayList<Libro> lib, Usuario u, String fa, int id){ 
        librosPrestados = new ArrayList();
        librosPrestados = lib;
        usuario = u;
        fechaAct = fa;
        this.id = id;
    }
    public void setLibrosP(ArrayList<Libro> lib){
        librosPrestados=lib;
    }
    public ArrayList getLibrosP(){
        return librosPrestados;
    }
    public void setFechaA(String fa){
        fechaAct = fa;
    }
    public String getFecha(){
        return fechaAct;
    }
    public void setUsuario(Usuario u){
        usuario = u;
    }
    
     @Override
    public String getDescripcion(){
        String descripcion = "ID: "+id+" Fecha Solicitud: "+fechaAct+" Usuario: "+ usuario.getNombre() + "Usuario id:"
                + usuario.id +"\n Libros: \n"; 
        for(Libro l : librosPrestados){
            descripcion += l.getTitulo() + "id: " + l.id +"\n";
        }
        return descripcion;
    }
}
