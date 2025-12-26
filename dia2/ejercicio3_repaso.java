package dia2_repaso;

import java.util.Scanner;

public class Ejercico3 {

    public static void main(String[] args) {
        /*
        EJERCICIO 3:
        Enunciado: Un gimnasio ofrece descuentos en sus membresías según la edad del cliente. Si el cliente tiene entre 18 y 60 años:

        -Si se inscribe en la primera semana del mes (días 1-7) y viene referido, obtiene 20% de descuento
        -Si se inscribe en la primera semana pero NO viene referido, obtiene 10% de descuento
        -Si se inscribe entre los días 8-22, obtiene 15% de descuento sin importar si viene referido
        -Si se inscribe después del día 22, obtiene 5% de descuento

        Si el cliente es menor de 18 o mayor de 60 años, informarle que debe consultar planes especiales.
        Datos a solicitar:

        -Edad del cliente
        -Precio de la membresía
        -Día del mes de inscripción
        -¿Viene referido? (S/N) - solo si se inscribe días 1-7
        
         */

        Scanner x = new Scanner(System.in);

        System.out.println("""
                            ----------------------------------------------------
                                            Bienvenido al gimnasio
                            
                            -Ingrese su edad para saber si es beneficiario de un 
                            descuento en su membresia
                            ----------------------------------------------------
                            """);

        int edad_cliente = x.nextInt();

        if (edad_cliente < 18 || edad_cliente > 60) {
            System.out.println("Su rango de edad esta por fuera del rango para obtener estos descuentos, consulte en la mesa principal los planes especiales que podemos ofecerle");
        } else {
            System.out.println("Ingrese el precio de la membresia");
            double membresia = x.nextDouble();
            System.out.println("Ingrese el dia del mes en el que se inscribe");
            int dia_mes = x.nextInt();

            if (dia_mes < 1 || dia_mes > 31) {
                System.out.println("El dia ingresado no existe");
            } else {
                if (dia_mes >= 1 && dia_mes <= 7) {
                    System.out.println("""
                                    ¿Viene referido por alguien?
                                    1.Si
                                    2.No
                                    """);

                    int referido = x.nextInt();

                    if (referido < 1 || referido > 2) {
                        System.out.println("Lo opcion marcada es incorrecta");
                    } else {
                        if (referido == 1) {
                            System.out.println("Usted obtiene el 20% de descuento");

                            double descuento = membresia * 0.2;
                            double total = membresia - descuento;

                            System.out.println("El descuento que tiene es de: " + descuento);
                            System.out.println("El valor total a pagar es de: " + total);
                        } else {
                            System.out.println("Usted obtiene el 10% de descuento");

                            double descuento = membresia * 0.1;
                            double total = membresia - descuento;
                            System.out.println("El descuento que tiene es de: " + descuento);
                            System.out.println("El valor total a pagar es de: " + total);
                        }

                    }
                } else {
                    if (dia_mes >= 8 && dia_mes <= 22) {
                        System.out.println("Usted obtiene el 15% de descuento");

                        double descuento = membresia * 0.15;
                        double total = membresia - descuento;
                        System.out.println("El descuento que tiene es de: " + descuento);
                        System.out.println("El valor total a pagar es de: " + total);
                    } else {

                        System.out.println("Usted obtiene el 5% de descuento");

                        double descuento = membresia * 0.05;
                        double total = membresia - descuento;
                        System.out.println("El descuento que tiene es de: " + descuento);
                        System.out.println("El valor total a pagar es de: " + total);
                    }
                }
            }
        }
    }
}
