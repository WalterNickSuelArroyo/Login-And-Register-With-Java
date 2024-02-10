package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
    public static void main(String[] args) {
        float precioBase = 8;
        float descuento = 0;
        float pagoInicial;
        float pagoFinal;
        Scanner input = new Scanner(System.in);        
        System.out.print("Numero de entradas: ");
        int entradas = input.nextInt();        
        input.nextLine();       
        System.out.print("Dia de la semana: ");
        String dia = input.nextLine();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        char tarjeta = input.next().charAt(0);        
        pagoInicial = entradas * 8;
        
        if (dia.equals("miercoles")) {
            precioBase = 5;
            pagoInicial = precioBase * entradas;
        } else if (dia.equals("jueves")) {
            if (entradas % 2 == 0) {
                pagoInicial = entradas / 2 * 11;
            } else {
                pagoInicial = (entradas - 1) / 2 * 11 + 8;
            }
        }
        if (tarjeta == 's') {
            descuento = (float) (0.1 * pagoInicial);
        }
        pagoFinal =pagoInicial - descuento; 
        
        System.out.println("Aqui tiene sus entradas. Gracias por su compra");
        System.out.println("Entradas individuales: " + entradas);
        System.out.println("Precio por entrada individual: " + precioBase);
        System.out.println("Total: " + pagoInicial);
        System.out.println("Descuento: " + descuento);
        System.out.println("A pagar: " + pagoFinal);
    }
}
