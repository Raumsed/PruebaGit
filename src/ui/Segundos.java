import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese los segundos que quiere convertir a minutos:");
        int segundosinicial=scanner.nextInt();
        int minutos=segundosinicial/60;
        int segundos=segundosinicial%60;
        System.out.println("los "+segundosinicial+" ingresados son "+minutos+" minutos y "+segundos+" segundos.");
        scanner.close();
    }
}