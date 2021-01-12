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
public class Biblioteca {
    private String nombre, telefono, direccion, correo;
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Empleado> empleados;
    
    public Biblioteca(){
        libros = new ArrayList();
        usuarios = new ArrayList();
        empleados = new ArrayList();
    }
    public Biblioteca(String nom, String dir, String tel, String cor){
        libros = new ArrayList();
        usuarios = new ArrayList();
        empleados = new ArrayList();
        nombre = nom;
        direccion = dir;
        telefono = tel;
        correo=cor;
    }
    public Biblioteca(String nom, String dir, String tel, String cor, ArrayList<Libro> lib, ArrayList<Usuario> usua, ArrayList<Empleado> emp){
        libros = new ArrayList();
        usuarios = new ArrayList();
        libros = lib;
        usuarios = usua;
        nombre = nom;
        direccion = dir;
        telefono = tel;
        correo=cor;
        empleados = emp;
    }
    public void setLibros(ArrayList lib){
        libros = lib;
    }
    public ArrayList getLibros(){
        return libros;
    }
    public void setEmpleado(ArrayList emp){
        empleados = emp;
    }
    public ArrayList getEmpleado(){
        return empleados;
    }
    public void setUsuarios(ArrayList usu){
        usuarios = usu;
    }
    public ArrayList getUsuarios(){
        return usuarios;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String dir){
        direccion = dir;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setTelefono(String tel){
        telefono = tel;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setCorreco(String cor){
        correo=cor;
    }
    public String getCorreco(){
        return correo;
    }
}
