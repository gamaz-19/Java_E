package dia3_repaso;

import java.util.Scanner;

public class Dia3_Repaso {

    public static void main(String[] args) {
        /*
        EJERCICIO 1: Sistema de Validación de Contraseña (WHILE)
        Enunciado:
        Una empresa requiere un sistema de login seguro. El usuario tiene máximo 3 intentos para ingresar la contraseña correcta. La contraseña correcta es "Java2024".
        Reglas:

        Solicitar la contraseña al usuario
        Si es incorrecta, mostrar cuántos intentos le quedan
        Si agota los 3 intentos, mostrar "Cuenta bloqueada. Contacte al administrador"
        Si ingresa correctamente, mostrar "Acceso concedido" y terminar el programa

        Datos a solicitar:

        Contraseña (String)

        Pista: Usa un contador de intentos y un while que se repita mientras la contraseña sea incorrecta Y queden intentos.

         */

        //Definir contraseña
        String contra = "Java2024";
        int intentos_permitidos = 3;
        int intentos_realizados = 0;
        boolean accesoPermitido = false;

        System.out.println("Sistema de validacion de contrasenia");

        while (intentos_realizados < intentos_permitidos && !accesoPermitido) {
            System.out.println("Por favor ingrese la contrasenia");
            String intento_contra = new Scanner(System.in).nextLine();

            if (intento_contra.equals(contra)) {
                accesoPermitido = true;
                System.out.println("La contrasenia es correcta");

            } else {
                intentos_realizados++;
                System.out.println("Contrasenia incorrecta, le quedan " + (intentos_permitidos - intentos_realizados) + " intentos");
            }

        }

        if (accesoPermitido) {
            System.out.println("Ha podido ingresar correctamente al sistema");
        } else {
            System.out.println("Lo sentimos los intentos para ingresar la contrasenia correctamente se han agotados, intente de nuevo en 20 minutos");
        }
    }
}
