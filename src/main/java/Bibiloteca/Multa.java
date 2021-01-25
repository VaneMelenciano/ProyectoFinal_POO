package Bibiloteca;

import java.util.ArrayList;

/**
 * @author Aaron
 * @author Vanessa
 */
public class Multa extends Documentos{
    private int diasRetraso;
    private float costoMulta;
    
    public Multa(int usuarioId, String librosPrestados, String fechaActual, int diasRetraso, float costoMulta){
        super(usuarioId, librosPrestados, fechaActual);
        this.diasRetraso = diasRetraso;
        this.costoMulta = costoMulta;
    }
    public Multa(int id, int usuarioId, String librosPrestados, String fechaActual, int diasRetraso, float costoMulta){
        super(id, usuarioId, librosPrestados, fechaActual);
        this.diasRetraso = diasRetraso;
        this.costoMulta = costoMulta;
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
    @Override
    public String objetoATexto(){
        return super.objetoATexto()+"|"+diasRetraso+"|"+costoMulta+"|M";
    }
}
