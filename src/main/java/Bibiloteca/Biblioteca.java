package Bibiloteca;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Aaron
 * @author Vanessa
 */
public class Biblioteca {
    private String nombre, telefono, direccion, correo;
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Empleado> empleados;
    private ArrayList<Documentos> documentos;
    
    public Biblioteca() throws FileNotFoundException, IOException{
        libros = leerArchivoLibros();
        usuarios = leerArchivoUsuarios();
        empleados = leerArchivoEmpleados();
        documentos = leerArchivoDocumentos();
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
    
    public void setLibros(ArrayList lib){libros = lib;}
    public void setEmpleado(ArrayList emp){empleados = emp;}
    public void setUsuarios(ArrayList usu){usuarios = usu;}
    public void setDocuemntos(ArrayList doc){documentos = doc;}
    public void setNombre(String nom){nombre = nom;}
    public void setDireccion(String dir){direccion = dir;}
    public void setTelefono(String tel){telefono = tel;}
    public void setCorreco(String cor){correo=cor;}
    
    public ArrayList getLibros(){return libros;}
    public ArrayList getEmpleado(){return empleados;}
    public ArrayList getUsuarios(){return usuarios;}
    public ArrayList getDocumentos(){return documentos;}
    public String getNombre(){return nombre;}
    public String getDireccion(){return direccion;}
    public String getTelefono(){return telefono;}
    public String getCorreco(){return correo;}
    
    public int AgregarLibro(String titulo, String autor, String editorial, int anio, int numUni, String pais) throws IOException{
        Libro newLib = new Libro(titulo, autor, editorial, pais, anio, numUni);
        int id = 0;
        while(true){
            boolean sameId = false;
            id = Descripcion.generarId();
            for(Libro l : libros){
                if(l.getId() == id) sameId = true; 
            }
            if(sameId == false) break;
        }
        newLib.setId(id);
        libros.add(newLib);
        guardarEnArchivo("ArchivoLibros.txt", newLib.objetoATexto(), true);
        return id;
    } //con atributos
    //se muestra TODOS los encontreados
    public Libro BuscarLibro(int id){
        for(Libro l : libros){
            if(id == l.getId()){
                return l;
            }
        }
        return null;
    }
    public ArrayList<Libro> BuscarLibro(String titulo){
        ArrayList<Libro> aux = new ArrayList();
        for(Libro l : libros){
            if(titulo.equals(l.getTitulo())) aux.add(l);
        }
        return aux;
    }
    public ArrayList<Libro> BuscarAutor(String autor){
        ArrayList<Libro> aux = new ArrayList();
        for(Libro l : libros){
            if(autor.equals(l.getAutor())) aux.add(l);
        }
        return aux;
    }
    public ArrayList<Libro> BuscarEditorial(String editorial){
        ArrayList<Libro> aux = new ArrayList();
        for(Libro l : libros){
            if(editorial.equals(l.getEditorial())) aux.add(l);
        }
        return aux;
    }
    public void BorraLibro(int id){
        for(Libro l : libros){
            if(id == l.getId()){
                libros.remove(l);
                return;
            }
        }
    }
    
    public int AgregarUsuario(String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con, String fechaRegistro) throws IOException{
        Usuario newUsu = new Usuario(nombre, fechaNacimiento, telefono, direccion, correo, edad, con, fechaRegistro);
        int id = 0;
        while(true){
            boolean sameId = false;
            id = Descripcion.generarId();
            for(Usuario u : usuarios){
                if(u.getId() == id) sameId = true; 
            }
            if(sameId == false) break;
        }
        newUsu.setId(id);
        usuarios.add(newUsu);
        guardarEnArchivo("ArchivoUsuarios.txt", newUsu.objetoATexto(), true);
        return id;
    }
    //se muestra TODOS los encontreados
    public Usuario BuscarUsuario(int id){
        for(Usuario u : usuarios){
            if(id == u.getId()) return u;
        }
        return null;
    }
    public ArrayList<Usuario> BuscarUsuario(String nombre){
        ArrayList<Usuario> aux = new ArrayList();
        for(Usuario u : usuarios){
            if(nombre.equals(u.getNombre())) aux.add(u);
        }
        return aux;
    }
    public void BorraUsuario(int id){
        for(Usuario u : usuarios){
            if(id == u.getId()){
                usuarios.remove(u);
                return;
            }
        }
    }
    
    public int AgregarEmpleado(String nombre, String fechaNacimiento, String telefono, String direccion, String correo, int edad, String con, String puesto, float sueldo) throws IOException{
        Empleado newEmp = new Empleado(nombre, fechaNacimiento, telefono, direccion, correo, edad, con, puesto, sueldo);
        int id = 0;
        while(true){
            boolean sameId = false;
            id = Descripcion.generarId();
            for(Empleado e : empleados){
                if(e.getId() == id) sameId = true; 
            }
            if(sameId == false) break;
        }
        newEmp.setId(id);
        empleados.add(newEmp);
        guardarEnArchivo("ArchivoEmpleados.txt", newEmp.objetoATexto(), true);
        return id;
    }
    //se muestra TODOS los encontreados
    public Empleado BuscarEmpleado(int id){
        for(Empleado e : empleados){
            if(id == e.getId()) return e;
        }
        return null;
    }
    public ArrayList<Empleado> BuscarEmpleado(String nombre){
        ArrayList<Empleado> aux = new ArrayList();
        for(Empleado e : empleados){
            if(nombre.equals(e.getNombre())) aux.add(e);
        }
        return aux;
    }
    public void BorraEmpleado(int id){
        for(Empleado e : empleados){
            if(id == e.getId()){
                empleados.remove(e);
                return;
            }
        }
    }
    
    public int AgregarMulta(int usuarioId, String librosPrestados, String fechaActual, int diasRetraso) throws IOException{
        Multa newMul = new Multa(usuarioId, librosPrestados, fechaActual, diasRetraso);
        int id = 0;
        while(true){
            boolean sameId = false;
            id = Descripcion.generarId();
            for(Documentos d : documentos){
                if(d.getId() == id) sameId = true; 
            }
            if(sameId == false) break;
        }
        newMul.setId(id);
        documentos.add(newMul);
        guardarEnArchivo("ArchivoDocumentos.txt", newMul.objetoATexto(), true);
        return id;
    }
    //se muestra TODOS los encontreados
    public Multa BuscarMulta(int id){
        for(Documentos d : documentos){
            if(id == d.getId() && d instanceof Multa) return (Multa)d;
        }
        return null;
    }
    public ArrayList<Multa> BuscarMultasUsuario(int usuarioId){
        ArrayList<Multa> aux = new ArrayList();
        for(Documentos d : documentos){
            if(usuarioId == d.getUsuarioId() && d instanceof Multa) aux.add((Multa)d);
        }
        return aux;
    }
    public ArrayList<Multa> BuscarMultasFecha(String fecha){
        ArrayList<Multa> aux = new ArrayList();
        for(Documentos d : documentos){
            if(fecha.equals(d.getFechaActual()) && d instanceof Multa) aux.add((Multa)d);
        }
        return aux;
    }
    public void BorraMulta(int id){
        for(Documentos d : documentos){
            if(id == d.getId() && d instanceof Multa){
                documentos.remove(d);
                return;
            }
        }
    }
    
    public void AgregarPrestamo(int usuarioId, String librosPrestados, String fechaActual, String plazoDev, String fechaDev) throws IOException{
        Prestamo newPre = new Prestamo(usuarioId, librosPrestados, fechaActual, plazoDev, fechaDev);
        int id;
        while(true){
            boolean sameId = false;
            id = Descripcion.generarId();
            for(Documentos d : documentos){
                if(d.getId() == id) sameId = true; 
            }
            if(sameId == false) break;
        }
        newPre.setId(id);
        documentos.add(newPre);
        guardarEnArchivo("ArchivoDocumentos.txt", newPre.objetoATexto(), true);
    }
    //se muestra TODOS los encontreados
    public Prestamo BuscarPrestamo(int id){
        for(Documentos d : documentos){
            if(id == d.getId() && d instanceof Prestamo) return (Prestamo)d;
        }
        return null;
    }
    public ArrayList<Prestamo> BuscarPrestamosUsuario(int usuarioId){
        ArrayList<Prestamo> aux = new ArrayList();
        for(Documentos d : documentos){
            if(usuarioId == d.getUsuarioId() && d instanceof Prestamo) aux.add((Prestamo)d);
        }
        return aux;
    }
    public ArrayList<Prestamo> BuscarPrestamosFecha(String fecha){
        ArrayList<Prestamo> aux = new ArrayList();
        for(Documentos d : documentos){
            if(fecha.equals(d.getFechaActual()) && d instanceof Prestamo) aux.add((Prestamo)d);
        }
        return aux;
    }
    public void BorraPrestamo(int id){
        for(Documentos d : documentos){
            if(id == d.getId() && d instanceof Prestamo){
                documentos.remove(d);
                return;
            }
        }
    }
    
    public static void guardarEnArchivo(String nombreArchivo, String texto, boolean append) throws IOException{
        File file = new File(nombreArchivo);
        FileWriter fw = new FileWriter(file, append);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(texto);
        pw.close();
    }
    public static void eliminarEnArchivo(String nombreArchivo, String texto, boolean append){
        
    }
            
    public static ArrayList<Libro> leerArchivoLibros() throws FileNotFoundException, IOException{
        File file = new File("ArchivoLibros.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner s = new Scanner(file);
        
        ArrayList<Libro> lista = new ArrayList();
        
        while(s.hasNextLine()){
            String linea = s.nextLine();
            String[] atributos = linea.split("\\|");
            
            int id = Integer.parseInt(atributos[0]);
            String titulo = atributos[1];
            String autor = atributos[2];
            String editorial = atributos[3];
            String pais = atributos[4];
            int edicion = Integer.parseInt(atributos[5]);
            int numUnidades = Integer.parseInt(atributos[6]);
            int numPrestados = Integer.parseInt(atributos[7]);
            
            Libro nuevoLibro = new Libro(id,titulo, autor, editorial, pais, edicion, numUnidades, numPrestados);
            lista.add(nuevoLibro);
        }
        return lista;
    }
        
    public static ArrayList<Usuario> leerArchivoUsuarios() throws FileNotFoundException, IOException{
        File file = new File("ArchivoUsuarios.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner s = new Scanner(file);
        
        ArrayList<Usuario> lista = new ArrayList();
        
        while(s.hasNextLine()){
            String linea = s.nextLine();
            String[] atributos = linea.split("\\|");
            
            int id = Integer.parseInt(atributos[0]);
            String nombre = atributos[1];
            String fechaNac = atributos[2];
            String telefono = atributos[3];
            String direccion = atributos[4];
            String correo = atributos[5];
            int edad = Integer.parseInt(atributos[6]);
            String contrasenia = atributos[7];
            String fechaRegistro = atributos[8];
            
            Usuario nuevoUsuario = new Usuario(id, nombre, fechaNac, telefono, direccion, correo, edad, contrasenia, fechaRegistro);
            lista.add(nuevoUsuario);
        }
        return lista;
    }    
    public static ArrayList<Empleado> leerArchivoEmpleados() throws FileNotFoundException, IOException{
        File file = new File("ArchivoEmpleados.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner s = new Scanner(file);
        
        ArrayList<Empleado> lista = new ArrayList();
        
        while(s.hasNextLine()){
            String linea = s.nextLine();
            String[] atributos = linea.split("\\|");
            
            int id = Integer.parseInt(atributos[0]);
            String nombre = atributos[1];
            String fechaNac = atributos[2];
            String telefono = atributos[3];
            String direccion = atributos[4];
            String correo = atributos[5];
            int edad = Integer.parseInt(atributos[6]);
            String contrasenia = atributos[7];
            String puesto = atributos[8];
            float sueldo = Float.parseFloat(atributos[9]);
            
            Empleado nuevoEmpleado = new Empleado(id, nombre, fechaNac, telefono, direccion, correo, edad, contrasenia, puesto, sueldo);
            lista.add(nuevoEmpleado);
        }
        return lista;
    }    
    public static ArrayList<Documentos> leerArchivoDocumentos() throws FileNotFoundException, IOException{
        File file = new File("ArchivoDocumentos.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner s = new Scanner(file);
        
        ArrayList<Documentos> lista = new ArrayList();
        
        while(s.hasNextLine()){
            String linea = s.nextLine();
            String[] atributos = linea.split("\\|");
            
            int id = Integer.parseInt(atributos[0]);
            int usuarioId = Integer.parseInt(atributos[1]);
            String librosPrestados = atributos[2];
            String fechaActual = atributos[3];
            
            if("M".equals(atributos[6])){
                int diasRetraso = Integer.parseInt(atributos[4]);
                float costoMulta = Float.parseFloat(atributos[5]);
                Multa nuevaMulta = new Multa(id, usuarioId, librosPrestados, fechaActual, diasRetraso);
                lista.add(nuevaMulta);
            }
            else if("P".equals(atributos[6])){
                String plazoDev = atributos[4];
                String fechaDev = atributos[5];
                Prestamo nuevoPrestamo = new Prestamo(id, usuarioId, librosPrestados, fechaActual, plazoDev, fechaDev);
                lista.add(nuevoPrestamo);
            }
        }
        return lista;
    }
}
