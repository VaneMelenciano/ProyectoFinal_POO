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
    private ArrayList<Documentos> documentos;
    
    public Biblioteca(){
        libros = new ArrayList();
        usuarios = new ArrayList();
        empleados = new ArrayList();
        documentos = new ArrayList();
    }
    public Biblioteca(String nom, String dir, String tel, String cor){
        libros = new ArrayList();
        usuarios = new ArrayList();
        empleados = new ArrayList();
        documentos = new ArrayList();
        nombre = nom;
        direccion = dir;
        telefono = tel;
        correo=cor;
    }
    public Biblioteca(String nom, String dir, String tel, String cor, ArrayList<Libro> lib, ArrayList<Usuario> usua, ArrayList<Empleado> emp){
        libros = new ArrayList();
        usuarios = new ArrayList();
        documentos = new ArrayList();
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
    public void setDocuemntos(ArrayList doc){
        documentos = doc;
    }
    public ArrayList getDocumentos(){
        return documentos;
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
    
    
    public void AgregarLibro(String titulo, String autor, String editorial, int anio, int numUni, String pais){
        Libro newLib = new Libro(titulo, autor, editorial, pais, anio, numUni);
        libros.add(newLib);
    } //con atributos
    //se muestra TODOS los encontreados
    public Libro BuscarLibro(int id){}
    public Libro BuscarLibro(String titulo){}
    public Libro BuscarLibro(String autor){}
    public Libro BuscarLibro(String editorial){}
    public void BorraLibro(int id){}
    
    
    
    public void AgregarUsuario(String nombre, String fechaNac, int edad, String tel, String dir, String correo, String fechaAct, String contraseña){
        Usuario newUsu = new Usuario(nombre, fechaNac, tel, dir, correo, edad, fechaAct, contraseña);
        usuarios.add(newUsu);
    }
    //se muestra TODOS los encontreados
    public Usuario BuscarUsuario(int id){}
    public Usuario BuscarUsuario(String nombre){}
    public voidBorraUsuario(int id){}
    
    
    
    public void AgregarEmpleado(String nombre, String fechaNac, int edad, String tel, String dir, String correo, String puesto, float sueldo, String contraseña){
        Empleado newEmp = new Empleado(nombre, fechaNac, tel, dir, correo, edad, puesto, sueldo, contraseña);
        empleados.add(newEmp);
    }
    //se muestra TODOS los encontreados
    public Empleado BuscarEmpleado(int id){}
    public Empleado BuscarEmpleado(String nombre){}
    public void BorraEmpleado(int id){}
    
    
    
    public void AgregarMulta(Usuario usuario, ArrayList lib, String fechaAct, int diasRetraso){
        Multa newMul = new Multa(diasRetraso, lib, usuario, fechaAct);
        documentos.add(newMul);
    }
    //se muestra TODOS los encontreados
    public Multa BuscarMulta(int id){}
    public Multa BuscarMulta(String nombreUsuario){}
    public Multa BuscarMulta(String fecha){}
    public Multa BorraMulta(int id){}
    
    
    
    public void AgregarPrestamo(Usuario usuario, ArrayList lib, String fechaAct, String plazoDev, String fechaDev){
        Prestamo newPre = new Prestamo(plazoDev, fechaDev, lib, usuario, fechaAct);
        documentos.add(newPre);
    }
    //se muestra TODOS los encontreados
    public Multa BuscarPrestamo(int id){}
    public BuscarPrestamo(String nombreUsuario){}
    public BuscarPrestamo(String fecha){}
    public void BorraPrestamo(int id){}

}
