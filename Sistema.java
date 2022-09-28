package ObtenerTarjeta;

import java.util.*;

public class Sistema {

    public Sistema() {
    }

    private int idPersona;
    private boolean validar;
    private boolean beneficiario;

    public int getIdPersona() {
        return this.idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public boolean getValidar() {
        return this.validar;
    }
    public void setValidar(boolean validar) {
        this.validar = validar;
    }

    public boolean getBeneficiario() {
        return this.beneficiario;
    }
    public void setBeneficiario(boolean beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String toString() {
        String cad = "\nidPersona: " + getIdPersona();
        cad += "\nValidacion: " + (getValidar() ? "Si" : "N0");
        cad += "\nBeneficiado: " + (getBeneficiario() ? "Si" : "No");
        return cad;
    }

    public static void main(String[] argvs){
        Scanner x = new Scanner(System.in);
        Random r = new Random();
        Persona p1 = new Persona();
        Sistema sis = new Sistema();
        Paqueteria paq = new Paqueteria();
        
        //Persona
        System.out.println("\nPersona");
        System.out.print("Ingresa nombre: ");
        p1.setNombre(x.nextLine());
        System.out.print("Ingresa apellidos: ");
        p1.setApellidos(x.nextLine());
        System.out.print("Ingresa direccion: ");
        p1.setDireccion(x.nextLine());
        System.out.print("Ingresa correo: ");
        p1.setCorreo(x.nextLine());
        System.out.print("Ingresa Telefono: ");
        p1.setTelefono(x.nextLine());
        System.out.print("Ingresa edad: ");
        p1.setEdad(x.nextInt());

        //Sistema
        sis.setIdPersona(r.nextInt(1000));
        sis.setValidar(true);
        sis.setBeneficiario(true);

        //Paqueteria
        paq.setDireccion(p1.getDireccion());
        paq.setNumGuia(1284662892);
        paq.setFechaEntrega("30/sep/2022");

        System.out.println(p1);
        System.out.println(sis);
        System.out.println(paq);
    }

}