/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;
import java.util.ArrayList;
/**
 *
 * @author Aaron
 * @author Vanessa
 */
public class Prestamo extends Documentos{
    private String plazoDev, fechaDev;
    public Prestamo(){
        super();
        plazoDev = "";
        fechaDev = "";
    }
    public Prestamo(String pd, String de, ArrayList<Libro> lib, Usuario u, String fa, int id){
        super();
        this.plazoDev = pd;
        this.fechaDev = de;
        this.librosPrestados = lib;
        this.usuario = u;
        this.fechaAct = fa;
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
}
