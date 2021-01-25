package Bibiloteca;

import java.util.Random;

/**
 * @author Aaron
 * @author Vanessa
 */
public abstract class Descripcion {
    private int id;
    
    public Descripcion(){
    }
    public Descripcion(int id){
        this.id = id;
    }
    
    public void setId(int id){this.id = id;}
    public int getId(){return id;}
    
    public static int generarId(){
        final String alphabet = "0123456789";
        final int N = alphabet.length();
        Random r = new Random();
        String aux = "";
        for (int i = 0; i < 5; i++) {
            aux +=(alphabet.charAt(r.nextInt(N)));
        }
        return Integer.parseInt(aux);
    }
    
    public abstract String getDescripcion();
    public abstract String objetoATexto();
}
