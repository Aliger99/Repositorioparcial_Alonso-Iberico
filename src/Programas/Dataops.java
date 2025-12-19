
    
package programas;
//Paquete de de datos de consola por consola
import java.util.Scanner;

public class Dataops {

    public static void main(String[] args) {

        // Declaración de variables
        String nombre;
        int horasTrabajadas;
        double tarifaHora;
        double sueldoBruto;
        double descuento;
        double sueldoNeto;

        // Entrada de datos
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese nombre del empleado: ");
        nombre = lectura.nextLine();

        System.out.print("Ingrese horas trabajadas: ");
        horasTrabajadas = lectura.nextInt();

        System.out.print("Ingrese tarifa por hora: ");
        tarifaHora = lectura.nextDouble();

        // Procesos
        sueldoBruto = horasTrabajadas * tarifaHora;
        descuento = sueldoBruto * 0.13;
        sueldoNeto = sueldoBruto - descuento;

        // Salida de resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo Bruto: " + sueldoBruto);
        System.out.println("Descuento ONP: " + descuento);
        System.out.println("Sueldo Neto: " + sueldoNeto);

        lectura.close();
    }
}