/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;

/**
 *
 * @author Vanessa
 */
public class Libro {
    private Autor autor;
    private String titulo, clave_libro, editorial, anio, pais;
    public Libro(){
        
    }
    public Libro(Autor au, String tit, String cl, String edi, String a, String p){
        autor=au;
        titulo=tit;
        clave_libro = cl;
        editorial = edi;
        anio = a;
        pais = p;
    }
}
