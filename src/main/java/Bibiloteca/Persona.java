/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;

/**
 * @author Aaron
 * @author Vanessa
 */
public abstract class  Persona {
    protected String nombre, fechaNac, telefono, direccion, correo;
    protected int edad, id;
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
    public void setFechaNac(String fn){
        fechaNac = fn;
    }
    public String getFechaNac(){
        return fechaNac;
    }
    public void setEdad(int e){
        edad = e;
    }
    public int getEdad(){
        return edad;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public abstract String DameDatos();
}
