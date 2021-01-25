package Bibiloteca;

import java.io.IOException;

/**
 *
 * @author aaron
 */
public class MainBiblioteca {
    public static void main(String args[]) throws IOException{
        //así es cómo se hace referencia al objeto, lo puedes usar desde cualquier clase.
        Biblioteca biblioteca = Biblioteca.getInstance();
    }
}
