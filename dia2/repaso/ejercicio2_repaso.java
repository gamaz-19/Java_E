package dia2_repaso;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        EJERCICIO 2: Calculadora de recargo por servicios publicos
        
        Enunciado: Una empresa de servicios públicos cobra recargos por mora según estas condiciones. 
        - Si la factura es mayor a $100,000:
            Si el pago se hace entre los días 1-10 del mes y es residencial, se cobra 3% de recargo
            Si el pago se hace entre los días 1-10 y es comercial, se cobra 5% de recargo
            Si el pago se hace entre los días 11-20, se cobra 8% sin importar el tipo
            Si el pago se hace después del día 20, se cobra 12% de recargo

        - Si la factura es menor a $100,000, no se cobran recargos.

        Datos a solicitar:
        -Valor de la factura
        -Día del mes en que realiza el pago
        -Tipo de servicio (1 = Residencial, 2 = Comercial) - solo si paga entre días 1-10
        
         */
        Scanner x = new Scanner(System.in);

        System.out.println("Esta es la calculadora de recargo por servicios");

        System.out.println("Ingrese el valor de su factura");

        double valor_factura = x.nextDouble();

        if (valor_factura < 100000) {
            System.out.println("¡Buenas noticias!, como su factura es menor a 100000 no se le cobra recargo \n Regrese pronto :) ");
        } else {
            System.out.println("Ingrese el dia en el que va a realizar el pago");
            int dia_de_pago = x.nextInt();

            if (dia_de_pago < 1 || dia_de_pago > 31) {
                System.out.println("El dia que ingreso no existe");
            } else {
                if (dia_de_pago >= 1 && dia_de_pago <= 10) {
                    System.out.println("Ingrese 1 si el pago es para zona residencial o 2 si el pago es para zona comercial");
                    int tipo_zona = x.nextInt();
                    if (tipo_zona < 1 || tipo_zona > 2) {
                        System.out.println("El tipo de zona ingresado no esta dentro de las opciones");
                    } else {
                        if (1 == tipo_zona) {
                            System.out.println("El recargo que se le cobra es del 3%");
                            double recargo = valor_factura * 0.03;
                            System.out.println("El valor del recargo es de: " + recargo);
                            double total = recargo + valor_factura;
                            System.out.println("El valor total a pagar es: " + total);
                        } else {
                            System.out.println("El recargo que se le cobra es del 5%");
                            double recargo = valor_factura * 0.05;
                            System.out.println("El valor del recargo es de: " + recargo);
                            double total = recargo + valor_factura;
                            System.out.println("El valor total a pagar es: " + total);
                        }
                    }
                } else {
                    if (dia_de_pago >= 11 && dia_de_pago <= 20) {
                        System.out.println("El recargo que se le cobra es del 8%");
                        double recargo = valor_factura * 0.08;
                        System.out.println("El valor del recargo es de: " + recargo);
                        double total = recargo + valor_factura;
                        System.out.println("El valor total a pagar es: " + total);
                    } else {
                        System.out.println("El recargo que se le cobra es del 12%");
                        double recargo = valor_factura * 0.12;
                        System.out.println("El valor del recargo es de: " + recargo);
                        double total = recargo + valor_factura;
                        System.out.println("El valor total a pagar es: " + total);
                    }
                }
            }
        }
    }
}
