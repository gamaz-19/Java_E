package clase_string;

public class Clase_String {
    public static void main(String[ ]args) {
        // Manipular texto
        String texto = "HoLA Mi NombRE Es DavID";
        String.out.println("Mayusculas: "+texto.toUpperCase());
        String.out.println("Minusculas: "+texto.toLowerCase());
        String.out.println("Cantidad: "+texto.length());
        String.out.println("Posicion numero 3: "+texto.charAt(3));
        int contador = 0;
        // cantidad de A
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'A' || texto.charAt(1) == 'a') {
                contador++;
            }
        }
        System.out.println("Cantidad de 'a' en el texto: "+contador);
        // Comparativas
        String textoaux = "HoLA Mi NombRE Es DavID";
        System.out.println(textoaux.compareTo(texto));
        if (textoaux.equalsIgnoreCase(texto)) {
            System.out.println("IGUALES");
        } else {
            System.out.println("Diferentes");
        }

        if (texto.startsWith("H")) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        if (texto.endsWith("D")) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        
        if (texto.contains("D")) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        // Condicion de texto.

        String texto_aux= " ewewewe ";
        System.out.println(texto_aux.trim());
        System.out.println(texto_aux.isBlank());

        System.out.println("TEXTO CONCATENADO: "+texto.concat(texto_aux));

        // REVISA SI LA LETRA A SE ENCUENTRA ENTRE LOS PRIMEROS 7 DIGITOS.
        System.out.println(texto.substring(0, 6));
        texto.substring(0, 6);

        // INMUTABILIDAD Y MUTABILIDAD DEL STRING
        StringBuilder textomutable = new StringBuilder();
        textomutable.append("Hola");
        textomutable.append("soy David");
        textomutable.append("soy programador");
        textomutable.append("soy profesor");
        textomutable.deleteCharAt(4);
        textomutable.delete(1, 5);
        textomutable.append("\n");
        textomutable.append("JAJA");
        System.out.println(textomutable);        
        // CONVERSIONES DE TEXTO A NUMERO Y FDF

        String edad = "27";
        int edad_aux=Integer.parseInt(edad);
        String estatura = "1.74";
        double estatura_aux = Double.parseDouble(estatura);
        System.out.println(edad_aux);
        System.out.println(estatura_aux);

        // estatura a un int
        int estatura_aux3 = (int) 19.9;
        System.out.println("VALOR PARSEADO: "+estatura_aux3);

        // CLASE MATEMATICA
        System.out.println("ROUND: "+Math.round(ganancia));
        System.out.println("CEIL: "+Math.ceil(ganancia));
        System.out.println("FLORR: "+Math.floor(ganancia));
    }
}
