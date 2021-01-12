/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;

/**
 *
 * @author Aaron
 * @author Vanessa
 */
public class Libro {
    private String titulo, clave_libro, editorial, anio, pais;
    public Libro(){
        
    }
    public Libro(String tit, String cl, String edi, String a, String p){
        titulo=tit;
        clave_libro = cl;
        editorial = edi;
        anio = a;
        pais = p;
    }
}
