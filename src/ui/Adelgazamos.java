import java.util.Scanner;

public class Adelgazamos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su peso actual: ");
        double pesoactual=scanner.nextDouble();
        System.out.println("Ahora por favor ingrese su estatura: ");
        double estaturaI=scanner.nextDouble();
        int estaturaF=(int) (estaturaI*100);
        System.out.println("Por ultimo, ingrese el numero de sesiones de aerobicos que realiza por semana: ");
        int sesiones=scanner.nextInt();
        int pesoideal=estaturaF-110;
        System.out.println("Su peso ideal es de: "+pesoideal+" kilos teniendo en cuenta que su estatura ingresada fue: "+estaturaI+" metros y debe bajar "+(pesoactual-pesoideal)+" kilos.");
        double minutosesiones=sesiones*45;
        double caloriasxsemana=(minutosesiones/60)*450;
        double semanas=((pesoactual-pesoideal)*3500)/caloriasxsemana;
        System.out.println("Debe realizar sus sesiones suministradas por "+semanas+" semanas para alcanzar su peso ideal");
        scanner.close();
    }
    
}
