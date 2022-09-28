package ObtenerTarjeta;

import java.util.*;

public class Persona {

    public Persona() {
    }

    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String correo;
    private String telefono;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return this.correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        String cad = "\nNombre: " + getNombre();
        cad += "\nApellidos: " + getApellidos();
        cad += "\nEdad: " + getEdad();
        cad += "\nDireccion: " + getDireccion();
        cad += "\nCorreo: " + getCorreo();
        cad += "\nTelefono: " + getTelefono();
        return cad;
    }

}