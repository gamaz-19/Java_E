//## MAIN FILE

import java.util.Scanner;

public class Dia2 {
    public static void main(String[] args) {

        System.out.println("Ingrese su edad");
        int edad=new Scanner(System.in).nextInt();
        
        if(edad<10){
            System.out.println("La persona es menor de edad");
        }else{
            System.out.println("La persona es mayor de edad");
        }
        
        
    }
    
}

//## SUPERMERCADO

public class Supermercado {

    public static void main(String[] args) {

        System.out.println("Bienvenido al supermercado Doña Pepita");
        System.out.println("Ingrese el total de su compra para saber el descuento: ");
        double total = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese el dia del mes que hizo la compra: ");
        int dia = new Scanner(System.in).nextInt();

        if (dia >= 1 && dia <= 31) {

            if (dia >= 1 && dia <= 8) {
                double descuento = (total * 0.50);
                System.out.println("""
                                El porcentaje aplicado es el del 5 porciento: %s
                                """.formatted(descuento));
            } else {
                if (dia >= 9 && dia <= 15) {
                    System.out.println("""
                                El porcentaje aplicado es el del 10 porciento: %s
                               """.formatted(total * 0.90));
                } else {
                    if (dia >= 16 && dia <= 24) {
                        System.out.println("""
                                El porcentaje aplicado es el del 3 porciento: %s
                               """.formatted(total * 0.97));
                    } else {
                        System.out.println("""
                                El porcentaje aplicado es el del 8 porciento: %s
                               """.formatted(total * 0.92));
                    }
                }
            }

        }else{
            System.out.println("Error: El dia ingresado no existe");
        }

    }

}


//## OPERADORES TERNARIOS




public class Switch {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al supermercado Doña Pepita");
        System.out.println("Ingrese el total de su compra para saber el descuento: ");
        double total = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese el dia del mes que hizo la compra: ");
        int dia = new Scanner(System.in).nextInt();
        
        
        double descuentoAux=dia >=1 && dia <=8 ?total*0.95:
                            dia >=9 && dia <=15 ?total*0.90:
                            dia >=16 && dia <=24 ?total*0.97:
                            total*0.92;
        System.out.println("Descuento Auxiliar:"+descuentoAux);
    }
}


//## SWITCH


public class switchCase {

    public static void main(String[] args) {
        /*
        Se reuqiere un menu de hamburguesas que calcule el total de la compra
         */

        System.out.println("""
                           ***************************************
                                    Bienvenido al restaurante
                            Estas son las hamburguesas disponibles:
                            
                            1.Hamburguesa triple     $25000
                            2.Hamburguesa doble      $20000
                            3.Hamburguesa especial   $25000
                            
                            4.Cancelar orden
                           ***************************************
                            """);

        int op = new Scanner(System.in).nextInt();

        double total = 0;
        int cantidad = 0;

        if (op >= 1 && op <= 4) {
            System.out.println("Ingrese la cantidad");
            cantidad = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                    total =cantidad*25000;
                    break;
                case 2:
                    total =cantidad*25000;
                    break;
                case 3:
                    cantidad = new Scanner(System.in).nextInt();
                    total =cantidad*25000;
                    break;
                case 4:
                    System.out.println("Gracias por visitarnos");
                    break;
            }

        }

    }
}


//##EJERCICIO 1



public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        Calcular horas extras por empleado
         */
        System.out.println("""
                           ****************************************
                                Bienvenido a la calculadora de
                                        horas extra
                           ****************************************
                            """);
        System.out.println("Ingrese la cantidad de SLMV que gana");
        int salarios = new Scanner(System.in).nextInt();

        if (salarios >= 2) {
            System.out.println("Ingrese el dia en el que trabajó horas extra");
            int dia = new Scanner(System.in).nextInt();

            System.out.println("Ingrese la cantidad de horas extra que trabajó");
            double extra = new Scanner(System.in).nextDouble();

            System.out.println("""
                            ¿Era entre semana o fin de semana?
                            
                            Para entre semana ingrese "e" -->
                            Para fin de semana ingrese "f" -->
                            
                            """);
            String entrefin = new Scanner(System.in).nextLine();

            double smlv = 1400000;

            double totalsalarios = salarios * smlv;

            if (dia >= 1 && dia <= 15) {
                if (entrefin == "e") {
                    double pagoporhora = extra * 0.01;
                    double sueldoTotal = pagoporhora + totalsalarios;
                    System.out.println("""
                                        Su salario base es: %s
                                        Su salario total por horas trabajadas en la primera quincena y entre semana de: %s
                                        """.formatted(totalsalarios,sueldoTotal));

                } else {
                    double pagoporhora = extra * 0.02;
                    double sueldoTotal = pagoporhora + totalsalarios;
                                        System.out.println("""
                                        Su salario base es: %s
                                        Su salario total por horas trabajadas en la primera quincena y entre semana de: %s
                                        """.formatted(totalsalarios,sueldoTotal));
                }
            } else {
                double pagoporhora = extra * 0.03;
                double sueldoTotal = pagoporhora + totalsalarios;
                                    System.out.println("""
                                        Su salario base es: %s
                                        Su salario total por horas trabajadas en la primera quincena y entre semana de: %s
                                        """.formatted(totalsalarios,sueldoTotal));
            }

        } else {
            System.out.println("""
                                Lo sentimos
                                Aún no esta disponible dicho modulo para su estirpe
                                """);
        }
    }
}
//que me noten, que me recuerden, que me prefieran




//GUIA EJERCICIO

/*Se requiere calcular las horas extras devengadas por 1 empleado, en un dia, 
    tomar en cuenta lo siguiente, si el empleado gana mas de 2 SMLV cada hora extra que se encuentre en la primera quincena y, 
    no sea fin de semana se paga al 1% del salario devengado, si es fin de semana al 2% si en caso dado es la segunda quicena, 
    se pagan por igual fines de semanas o no a 3%. Si en caso dado el empleado gana menos de 2 SMLV, 
    entonces infomarles que aun no esta disponible dicho modulo para su estirpe. */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double pagoExtra = 0;

        System.out.println("""
                            Bienvenido a la calculadora de Horas Extra
                            -----
                            Ingresa tu salario: """);
        double salario = scn.nextDouble();

        if (salario < 2800000) {
            System.out.println("El salario ingresado es menor a 2 SMMLV de Colombia ($2,800,000), imposible realiizar la operación.");
        } else {
            System.out.println("Ingresa el número de Horas Extra trabajadas en el día de hoy: ");
            double horasExtra = scn.nextDouble();

            System.out.println("Ingresa el día del mes: ");
            double dia = scn.nextDouble();

            if (dia <= 15) {
                System.out.println("""
                                ¿Hoy es un día de fin de semana o feriado?
                                1. Sí
                                2. No""");
                int feriado = scn.nextInt();

                if (feriado == 1) {
                    pagoExtra = (salario * horasExtra) * 0.02;
                    System.out.println("Tu pago extra por ser feriado y antes del 15 es: " + pagoExtra);

                } else {
                    pagoExtra = (salario * horasExtra) * 0.01;

                    System.out.println("""
                                        Tu pago extra por ser primera quincena y entre semana es: %s""".formatted(pagoExtra));
                }
            } else {
                pagoExtra = (salario * horasExtra) * 0.03;

                System.out.println("""
                                        Tu pago extra por ser segunda quincena es: %s""".formatted(pagoExtra));
            }

        }

    }