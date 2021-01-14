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
    private String titulo, autor, editorial, pais;
    private int id, numUni, prestados, anio;
    public Libro(){
        
    }
    public Libro(String tit, String au, String edi, int a, String p, int i, int nu, int pre){
        titulo = tit;
        autor = au;
        editorial = edi;
        anio = a;
        pais = p;
        id = i;
        numUni = nu;
        prestados = pre;
    }
    public void setTitulo(String tit){
        titulo = tit;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String a){
        autor = a;
    }
    public String getAutor(){
        return autor;
    }
    public void setEditorial(String edi){
        editorial = edi;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setPais(String p){
        pais = p;
    }
    public String getPais(){
        return pais;
    }
    public void setID(int i){
        id = i;
    }
    public int getID(){
        return id;
    }
    public void setNumUni(int un){
        numUni = un;
    }
    public int getNumUni(){
        return numUni;
    }
    public void setPrestados(int pre){
        prestados = pre;
    }
    public int getPrestados(){
        return prestados;
    }
    public void setAnio(int a){
        anio = a;
    }
    public int getAnio(){
        return anio;
    }
    public String Descripcion(){
        return "Id: " + id + "Libro: " + titulo + "\tAutor: " + autor + "\t" + anio + "\n Editorial" + editorial + ", " + pais + "\n  Unidades: " + numUni + "\t Prestados: " + prestados;
    }
}
