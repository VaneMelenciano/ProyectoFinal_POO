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
public class Prestamo {
    private String fechaPrestamo, plazodev, fechaDev;
    public Prestamo(){
    }
    public Prestamo(String fp, String pd, String de){
        fechaPrestamo = fp;
        plazodev = pd;
        fechaDev = de;
    }
    public void setFechaPres(String fp){
        fechaPrestamo = fp;
    }
    public String getFechaPres(){
        return fechaPrestamo;
    }
    public void setFechaDev(String fd){
        fechaDev = fd;
    }
    public String getFechaDev(){
        return fechaDev;
    }
    public void setPlazoDev(String pd){
        plazodev = pd;
    }
    public String getPlazoDev(){
        return plazodev;
    }
}
