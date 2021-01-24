/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibiloteca;

import java.util.ArrayList;

/**
 * @author Aaron
 * @author Vanessa
 */
public class Multa extends Documentos{
    private int diasRetraso;
    private float costoMulta;
    public Multa(){
        super();
        diasRetraso = 0;
        costoMulta = 0;
    }
    public Multa(int dR, ArrayList<Libro> lib, Usuario u, String fa){
        super();
        this.diasRetraso = dR;
        this.librosPrestados = lib;
        this.usuario = u;
        this.fechaAct = fa;
    }
    public void setDias(int d){
        diasRetraso = d;
    }
    public int getDias(){
        return diasRetraso;
    }
    public void setCosto(float c){
        costoMulta = c;
    }
    public float getCosto(){
        return costoMulta;
    }
    public float Calcular(){
        costoMulta = 20*diasRetraso;
        return costoMulta;
    }
    @Override
    public String getDescripcion(){
        return super.getDescripcion()
                +"Dias de retraso: " + diasRetraso + "   Costo de la multa: " + Calcular();
    }
}
