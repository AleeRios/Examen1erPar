package ObtenerTarjeta;

import java.util.*;

public class Paqueteria {

    public Paqueteria() {
    }

    private String direccion;
    private int numGuia;
    private String fechaEntrega;

    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumGuia() {
        return this.numGuia;
    }
    public void setNumGuia(int numGuia) {
        this.numGuia = numGuia;
    }

    public String getFechaEntrega() {
        return this.fechaEntrega;
    }
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String toString() {
        String cad = "\nDireccion de entrega: " + getDireccion();
        cad += "\nFecha de entrega: " + getFechaEntrega();
        cad += "\nNumero de guia: " + getNumGuia();
        return cad;
    }

}