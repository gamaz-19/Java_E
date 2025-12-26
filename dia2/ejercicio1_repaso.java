package dia2_repaso;

import java.util.Scanner;

public class Dia2_Repaso {

    public static void main(String[] args) {

        /*EJERCICIO 1: Sistema de bonificacion por ventas
        Enunciado:
Se requiere calcular la bonificación mensual de un vendedor. Si el vendedor tiene ventas superiores a $5,000,000, aplican las siguientes reglas:

-Si las ventas se realizaron en la primera quincena (días 1-15) y cumplió la meta (más de 10 ventas), recibe el 5% de bonificación
-Si es primera quincena pero NO cumplió la meta, recibe el 2% de bonificación
-Si las ventas son de la segunda quincena (días 16-31), recibe el 7% sin importar la cantidad de ventas

Si el vendedor tiene ventas menores a $5,000,000, informarle que no califica para bonificación este mes.
Datos a solicitar:

-Monto total de ventas del mes
-Día del mes en que se hace el cálculo
-Cantidad de ventas realizadas (solo si es primera quincena)

         */
        Scanner intScanner = new Scanner(System.in);

        Scanner doubleScanner = new Scanner(System.in);

        System.out.println("""
                            ----------------------------------------------------
                                    Bienvenido al sistema de bonificacion
                            ----------------------------------------------------
                            Aqui podrá calcular su bonificación mensual como 
                            vendedor
                            """);

        System.out.println("Ingrese el valor de las ventas realizadas");
        double valor_ventas_realizadas = doubleScanner.nextDouble();

        if (valor_ventas_realizadas < 5000000) {
            System.out.println("Lo sentimos, no califica para la bonificacion de este mes");
        } else {
            System.out.println("Ingrese el día del mes en el que se calcula la bonificacion");

            int dia_mes = intScanner.nextInt();

            if (dia_mes < 1 || dia_mes > 31) {
                System.out.println("El dia ingresado no existe");
            } else {
                if (dia_mes <= 15) {
                    System.out.println("Es la primera quincena");
                    System.out.println("Ingrese la cantidad de ventas que realizó");

                    int ventas_realizadas = intScanner.nextInt();

                    if (ventas_realizadas < 10) {
                        System.out.println("No cumplio con la meta de ventas, usted recibe el 2% de bonificacion");
                        double bonificacion = valor_ventas_realizadas * 0.02;
                        System.out.println("La bonificacion es de: " + bonificacion);

                    } else {
                        System.out.println("Cumplio con la meta de ventas, usted recibe el 5% de bonificacion");
                        double bonificacion = valor_ventas_realizadas * 0.05;
                        System.out.println("La bonificacion es de: " + bonificacion);
                    }

                } else {
                    System.out.println("Es la segunda quincena\nLa bonificacioni de usted recibe es de el 7%");
                    double bonificacion = valor_ventas_realizadas * 0.07;
                    System.out.println("La bonificacion es de: " + bonificacion);
                }
            }
        }
    }
}

