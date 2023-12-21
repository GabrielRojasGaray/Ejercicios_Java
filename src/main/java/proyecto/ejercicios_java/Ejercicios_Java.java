package proyecto.ejercicios_java;

import Encapsulamiento_Lav.LFunciones;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ejercicios_Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo de ropa");
        System.out.println("Presiona 1 ropa blanca / 2 ropa de color");
        int tipoRopa = sc.nextInt();
        System.out.println("Ingrese la cantidad de kilos");
        int kilos = sc.nextInt();
        
        LFunciones proceso = new LFunciones(kilos, tipoRopa);
        
        proceso.CicloFinalizado();
    }
}
