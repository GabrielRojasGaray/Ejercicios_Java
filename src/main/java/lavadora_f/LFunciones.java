package lavadora_f;


/**
 *
 * @author gabriel Ejercicio de encapsulameinto 
 * Clase para el funcionamiento
 * logico de una lavadora
 */
public class LFunciones {

    private int kilos = 0, llenadoCompleto = 0, TipoRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public LFunciones(int kilos, int TipoRopa) {
        this.kilos = kilos;
        this.TipoRopa = TipoRopa;
    }

    private void Llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        } else {
            System.out.println("La carga de ropa es muy grande, reduce la carga");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (TipoRopa == 1) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                System.out.println("Lava completo");
                LavadoCompleto = 1;
            } else if (TipoRopa == 2) {
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                System.out.println("Lavado completo");
                LavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color / lavado intenso");
                LavadoCompleto = 1;
            }

        } else {
            System.out.println("No se pudo iniciar el lavado");
        }
    }

    private void Secado() {
        Lavado();
        if (LavadoCompleto == 1) {
            System.out.println("Secando...");
            System.out.println("Secado");
            SecadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        Secado();
        if (SecadoCompleto == 1) {
            System.out.println("Tu ropa está lista");

        }
    }

}
