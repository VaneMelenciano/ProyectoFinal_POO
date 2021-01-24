package Bibiloteca;
import java.util.ArrayList;
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
    
    public void AgregarLibro(String titulo, String autor, String editorial, int anio, int numUni, String pais){
        Libro newLib = new Libro(titulo, autor, editorial, pais, anio, numUni);
        libros.add(newLib);
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
    
    public void AgregarUsuario(String nombre, String fechaNac, int edad, String tel, String dir, String correo, String fechaAct, String contraseña){
        Usuario newUsu = new Usuario(nombre, fechaNac, tel, dir, correo, edad, fechaAct, contraseña);
        usuarios.add(newUsu);
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
    
    public void AgregarEmpleado(String nombre, String fechaNac, int edad, String tel, String dir, String correo, String puesto, float sueldo, String contraseña){
        Empleado newEmp = new Empleado(nombre, fechaNac, tel, dir, correo, edad, puesto, sueldo, contraseña);
        empleados.add(newEmp);
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
    
    public void AgregarMulta(Usuario usuario, ArrayList lib, String fechaAct, int diasRetraso){
        Multa newMul = new Multa(diasRetraso, lib, usuario, fechaAct);
        documentos.add(newMul);
    }
    //se muestra TODOS los encontreados
    public Multa BuscarMulta(int id){
        for(Documentos d : documentos){
            if(id == d.getId() && d instanceof Multa) return (Multa)d;
        }
        return null;
    }
    public ArrayList<Multa> BuscarMultasUsuario(String nombreUsuario){
        ArrayList<Multa> aux = new ArrayList();
        for(Documentos d : documentos){
            if(nombreUsuario.equals(d.getUsuario().getNombre()) && d instanceof Multa) aux.add((Multa)d);
        }
        return aux;
    }
    public ArrayList<Multa> BuscarMultasFecha(String fecha){
        ArrayList<Multa> aux = new ArrayList();
        for(Documentos d : documentos){
            if(fecha.equals(d.getFecha()) && d instanceof Multa) aux.add((Multa)d);
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
    
    public void AgregarPrestamo(Usuario usuario, ArrayList lib, String fechaAct, String plazoDev, String fechaDev){
        Prestamo newPre = new Prestamo(plazoDev, fechaDev, lib, usuario, fechaAct);
        documentos.add(newPre);
    }
    //se muestra TODOS los encontreados
    public Prestamo BuscarPrestamo(int id){
        for(Documentos d : documentos){
            if(id == d.getId() && d instanceof Prestamo) return (Prestamo)d;
        }
        return null;
    }
    public ArrayList<Prestamo> BuscarPrestamoUsuario(String nombreUsuario){
        ArrayList<Prestamo> aux = new ArrayList();
        for(Documentos d : documentos){
            if(nombreUsuario.equals(d.getUsuario().getNombre()) && d instanceof Prestamo) aux.add((Prestamo)d);
        }
        return aux;
    }
    public ArrayList<Prestamo> BuscarPrestamo(String fecha){
        ArrayList<Prestamo> aux = new ArrayList();
        for(Documentos d : documentos){
            if(fecha.equals(d.getFecha()) && d instanceof Prestamo) aux.add((Prestamo)d);
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
}
