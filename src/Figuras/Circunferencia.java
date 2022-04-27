package Figuras;
import static Figuras.Circunferencia.calcularRadio;
import java.util.Scanner;
public class Circunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diametro;
        System.out.println("Introduce el diametro de la circunferencia: ");
        diametro=sc.nextInt();
        boolean option=true;

        while(option){            
            int opcion = 0;
            System.out.println("0. Salir");
            System.out.println("1. Cálculo del Radio");
            System.out.println("2. Cálculo del Área");
            System.out.println("3. Cálculo de la Longitud");
            System.out.println("Seleccione para una opcion para calcular:");
            opcion=sc.nextInt();
   
            switch (opcion) {
                case 0:
                    option=false;
                    break;
                case 1:
                    calcularRadio(diametro);
                    break;
                case 2:
                    calcularArea(diametro);                 
                    break;
                case 3: 
                    calcularLongitud(diametro);
                    break;
            }
        }
    }

    public static void calcularLongitud(double diametro) {
        double longitud=3.14*diametro;
        System.out.println("La longitud de la circunferencia es: " +longitud);
    }

    private static void calcularArea(double diametro) {
        double area;
        double rad=diametro/2;
        area= 3.14*rad*rad;
        System.out.println("El area de la circunferencia es: " +area);
    }
    public static void calcularRadio(double diametro) {
        double radio;
        radio = diametro / 2;
        System.out.println("El radio del circulo es: " + radio);
    }
}