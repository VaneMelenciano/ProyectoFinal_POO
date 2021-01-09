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
 */
public class Prestamo {
    private Usuario usuario;
    private ArrayList<Libro> libros;
    private String fecha_salida, fecha_max, fecha_devolucion;
    public Prestamo(){
       libros = new ArrayList(); 
    }
    public Prestamo(Usuario u, ArrayList<Libro> lib, String fs, String fm, String fd){
        libros = new ArrayList(); 
        usuario = u;
        libros = lib;
        fecha_salida = fs;
        fecha_max = fm;
        fecha_devolucion = fd;
    }
}
