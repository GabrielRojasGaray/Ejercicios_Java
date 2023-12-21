
package Herencia_Trabajo;


public class Empleado extends Trabajador {
    private double sueldo;
    private double impuestos;
    private final int Pagas = 14;
    
    public Empleado(String nombre, String Rut, double sueldo){
        super(nombre,Rut);
        this.sueldo=sueldo;
        this.impuestos=0.3*sueldo;
        
    }
    
    public double calcularPaga(){
        return (sueldo-impuestos)/Pagas;
    }
    
    @Override
    public String toString(){
        return "Empleado "+super.toString();
    }
    
}
