//MAIN CLASS-VARIABLES

package ant_variables;

import java.util.Scanner;

public class Ant_variables {

    public static void main(String[] args) {
//        System.out.println("Hola mundo");
//        
        Scanner x =new Scanner(System.in);
//        
//        System.out.println("Ingrese el nombre");
        
        
        //ESTRUCTURA DE UNA VARIABLE
        
        /*
            TipoVariable NombreVariable;
            TipoVariable NombreVariable;
            LEER
        
            TipoVariable NombreVariable = x.nextTipoVariable();
        
        */
        
        System.out.println("Ingrese nombre");
        String nombre =x.nextLine();
        
        System.out.println("Ingrese la edad");
        int edad =x.nextInt();
        
        System.out.println("Estatura");
        double estatura =x.nextDouble();
        
        System.out.println("Número de cédula");
        long cedula =x.nextLong();
        
        //----------------------------------------------------------------------
        
        //para hacer salto de linea se e scribe en el System.out.print(texto \n )
        
        System.out.println("********************");
        System.out.println("Datos:");
        System.out.println("Bienvenido"+nombre+"tus datos son los siguientes:");
        System.out.println("Cédula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Estatura: "+estatura);
        
        //----------------------------------------------------------------------
        
        System.out.println("""
                           Bienvenido %s tus datos son los siguientes:
                           Cedula: %s 
                           Edad: %s
                           Estatura %s
                           
                           Regrese pronto
                           """.formatted(nombre, cedula, edad, estatura));
    }
    
}


//CONVERSIONES CLASS
//-------------------------------------------------------------------------
package ant_variables;

import java.util.Scanner;


public class Conversiones {
    
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Bienvenido al sistema de calculos S1");
        System.out.println("Ingrese la cantidad de arrobas");
        double arrobas=x.nextDouble();
        
        System.out.println("INgrese el precio de la arroba");
        double precio_arroba =x.nextDouble();
        
        
        double cantidad_libras=arrobas*25;
        double cantidad_gramos=cantidad_libras*500;
        
        
        double precio_gramo=precio_arroba/cantidad_gramos;
        
        System.out.println("Cantidad de gramos: "+cantidad_gramos);
        
        System.out.println("El precio de venta del gramo es "+ precio_gramo);
        
        
        
    }
    
}

//EJERCICIO CLASS
//---------------------------------------------------------------------------
package ant_variables;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        //Calcular el timepo recorrido entre girón y piedecuesta, tomando en cuenta que viajo a x k/h y la distancia es x

        Scanner x = new Scanner(System.in);

        double kilometros_hora = x.nextDouble();
        double distancia = x.nextDouble();

        System.out.println("""
                           Bienvenido a la calculadora de tiempo recorrido
                           
                           Ingrese a cuántos kilometros por hora viajó: %s
                           
                           Ingrese la distancia que reecorrió: %s
                           
                           """.formatted(kilometros_hora, distancia));
        
        double tiempo_recorrido=distancia/kilometros_hora;
        
        System.out.println("El tiempo total que demoró en recorrer la distancia fue de: "+tiempo_recorrido);
    }
}

