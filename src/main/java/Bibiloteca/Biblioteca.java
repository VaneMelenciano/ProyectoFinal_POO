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
public class Biblioteca {
    private String nombre, telefono, direccion, correo;
    private ArrayList<Libro> TodosLosLibros;
    private ArrayList<Usuario> TodosLosUsuarios;
    
    public Biblioteca(){
        TodosLosLibros = new ArrayList();
        TodosLosUsuarios = new ArrayList();
    }
    public Biblioteca(String nom, String dir, String tel, String cor){
        TodosLosLibros = new ArrayList();
        TodosLosUsuarios = new ArrayList();
        nombre = nom;
        direccion = dir;
        telefono = tel;
        correo=cor;
    }
    public Biblioteca(String nom, String dir, String tel, String cor, ArrayList<Libro> libros, ArrayList<Usuario> usuarios){
        TodosLosLibros = new ArrayList();
        TodosLosUsuarios = new ArrayList();
        TodosLosLibros = libros;
        TodosLosUsuarios = usuarios;
        nombre = nom;
        direccion = dir;
        telefono = tel;
        correo=cor;
    }
}
