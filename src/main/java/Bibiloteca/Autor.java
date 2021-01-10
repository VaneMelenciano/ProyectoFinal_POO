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

/skvnecivnoie nmfwf r c
public class Autor {
    private int libros_publicados;
    private String nombre, fecha_nacimiento, lugar_nacimiento;
    public Autor(){
        
    }
    public Autor(String nom, String fn, String ln, int lp){
        nombre = nom;
        fecha_nacimiento = fn;
        lugar_nacimiento = ln;
        libros_publicados=lp;
    }
    
}
