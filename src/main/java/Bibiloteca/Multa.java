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
public class Multa {
    private int diasRetraso;
    private float costoMulta;
    public Multa(){
        
    }
    public Multa(int dR, int cM){
        diasRetraso = dR;
        costoMulta = cM;
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
}
