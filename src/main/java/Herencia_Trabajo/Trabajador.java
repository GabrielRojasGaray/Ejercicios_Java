package Herencia_Trabajo;

import java.util.Date;

/**
 *
 * @author gabri
 */
public class Trabajador {

    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private Date fecha_nacimiento;
    private Date fecha_contrato;
    private String Rut;

    public Trabajador ( String nombre, String Rut){
        this.nombre = nombre;
        this.Rut = Rut;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }
    public double calcularPaga(){
        return 0.0;
    }
    
    
    public boolean equals(Trabajador t ){
        return this.Rut.equals(t.Rut);
    }
    @Override
    public String toString(){
        return nombre + " (Rut "+Rut+")";
    }
    
}
