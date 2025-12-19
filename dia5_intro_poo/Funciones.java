import java.util.Scanner;

public class Funciones {

    public void armar_factura(String factura, String articulo, double precio) {
        factura += "**\n"
                + "Articulo:  " + articulo + "\n"
                + "Precio:    " + precio + "\n"
                + "**\n";
    }

    static void reasignar_cupo(double cupo, double valor_articulo) {
        cupo = cupo - valor_articulo;
        System.out.println("Monto restante: " + cupo);
    }

    static void validar_cupo(double cupo, double valor_articulo) {
        if (cupo < valor_articulo) {
            System.out.println("No se puede comprar el articulo. Saldo: " + cupo);
        } else {
            reasignar_cupo(cupo, valor_articulo);
        }
    }

    public void iva_aplicado(double cupo, double valor_articulo) {
        System.out.println("¿El producto tiene IVA aplicado?\n1=SI\n2=NO");
        int op = new Scanner(System.in).nextInt();
        while (op < 1 || op > 2) {
            System.out.println("Error, escoja una opción valida!");
            op = new Scanner(System.in).nextInt();
        }
        if (op == 1) {
            double valor_articulo_aux = valor_articulo * 1.19;
            System.out.println("El producto con IVA es: " + valor_articulo_aux);
            validar_cupo(cupo, valor_articulo_aux);
        } else {
            validar_cupo(cupo, valor_articulo);
        }

    }
}