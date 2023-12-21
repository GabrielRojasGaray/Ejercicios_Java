package Herencia_Trabajo;

public class Main {

    public static void main(String[] args) {
        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;

        trabajador = new Trabajador("Gabriel", "19583390");
        empleado = new Empleado("Cristobal", "2959595", 400000);
        consultor = new Consultor("Tamara", "195454019", 45, 5000);
        Trabajador gabriel = new Consultor("Gabriel R", "19583390-7", 10, 50000);
        

        System.out.println(trabajador);
        System.out.println(empleado);
        System.out.println(consultor);

        System.out.println(trabajador.equals(empleado));
        System.out.println(trabajador.equals(consultor));

        Trabajador[] trabajadores = new Trabajador[10];

        for (int i = 0; i < 9; i = i + 2) {
            trabajadores[i] = consultor;
            trabajadores[i + 1] = empleado;

        }
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].toString()+"paga: "+trabajadores[i].calcularPaga());
            

        }

    }

}
