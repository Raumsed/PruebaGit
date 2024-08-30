import java.util.Scanner;

public class pagueDespues {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el valor del interés simple mensual:");
        int interes=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ahora ingrese el valor del prestamo:");
        int prestamo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el dia del año en que solicitó el prestamo:");
        int dia=scanner.nextInt();
        scanner.nextLine();
        int diasdepago=360-dia;
        int meses=diasdepago/30;
        int interesfinal=((interes*prestamo)/100);
        int pagofinal=interesfinal*meses;
        System.out.println("El valor a pagar por intereses es: "+pagofinal);
        scanner.close();

    }

}
