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
public class Usuario {
    private String nombre, direccion, numero, correo, fecha_registro, fecha_nac, lugar_nac;
    private float adeudos;
    private int edad;
    
    public Usuario(){
        
    }
    public Usuario(String nom, String dir, String num, String cor, String fr, String fn, String ln, float ad, int ed){
        nombre = nom;
        direccion = dir;
        numero = num;
        correo = cor;
        fecha_registro = fr;
        fecha_nac=fn;
        lugar_nac = ln;
        adeudos = ad;
        edad = ed;
    }
}
