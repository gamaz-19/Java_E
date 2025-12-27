package dia2_repaso;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        EJERCICIO 4: Calculadora de intereses bancarios
        
        Enunciado: Un banco calcula intereses sobre depósitos a término. Si el monto depositado es mayor a $1,000,000:

        -Si el depósito se hace en la primera decena (días 1-10) y es a más de 6 meses, paga 4% de interés mensual
        -Si es primera decena pero a menos de 6 meses, paga 2% de interés mensual
        -Si el depósito se hace en la segunda decena (días 11-20), paga 3.5% sin importar el plazo
        -Si el depósito se hace en la tercera decena (días 21-31), paga 2.5% de interés mensual
        -Si el monto es menor a $1,000,000, informar que el monto mínimo para generar intereses es $1,000,000.
        
        Datos a solicitar:

        -Monto a depositar
        -Día del mes del depósito
        -Plazo en meses (solo si deposita días 1-10)
        
        */
        Scanner x=new Scanner(System.in);
        
        System.out.println("""
                            ====================================================
                                    Calculadora de intereses bancarios
                            ====================================================
                            Bienvenido a la calculadora de intereses sobre depositos a termino
                            
                            Ingrese el monto a depositar:
                            
                            """);
        
        double monto =x.nextDouble();
        
        if (monto<1000000){
            System.out.println("Lo sentimos, el monto minimo para generar intereses es de 1000000");
        }else{
            System.out.println("Inngrese el dia en el que hace el deposito");
            int dia_deposito=x.nextInt();
            if(dia_deposito<1 || dia_deposito>31){
                System.out.println("Error, el dia ingresado no es valido");
            }else{
                if(dia_deposito>=1 && dia_deposito<=10){
                    System.out.println("A cuantos meses desea el plazo");
                    int meses_plazo=x.nextInt();
                    if (meses_plazo<=6){
                        System.out.println("El interes mensual que va a pagar es de 2%");
                        double interes =monto*0.02;
                        System.out.println("El valor del interes es de: "+interes);
                    }else{
                        System.out.println("El interes mensual que va a pagar es de 4%");
                        double interes =monto*0.04;
                        System.out.println("El valor del interes es de: "+interes);
                    }
                    
                }else {
                    if(dia_deposito>=11 && dia_deposito<=20){
                        System.out.println("El interes mensual que va a pagar  de 3.5%");
                        double interes =monto*0.035;
                        System.out.println("El valor del interes es de: "+interes);
                        
                    }else{
                        System.out.println("El interes mensual que va a pagar es de 2.5%");
                        double interes =monto*0.025;
                        System.out.println("El valor del interes es de: "+interes);
                    }
                }
            }           
        }
        
    }
}
