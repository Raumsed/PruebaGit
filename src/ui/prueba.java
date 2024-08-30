import java.util.Scanner;
public class prueba {

    public static double promedio(int valorUno,int valorDos,int valorTres,int valorCuatro,int valorCinco){
        double resultado=0;
        resultado=(valorUno+valorDos+valorTres+valorCuatro+valorCinco)/5.0;
        return resultado;
    }

    public static int divisibles(int valorUno, int valorDos, int valorTres, int valorCuatro, int valorCinco){
        int cantDivisibles=0;
        int div1=(valorUno%10==0)?1:0;
        int div2=(valorDos%10==0)?1:0;
        int div3=(valorTres%10==0)?1:0;
        int div4=(valorCuatro%10==0)?1:0;
        int div5=(valorCinco%10==0)?1:0;
        cantDivisibles=div1+div2+div3+div4+div5;
        return cantDivisibles;
    }

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese el numero uno: ");
        int valorUno=lector.nextInt();
        System.out.println("Ingrese el numero dos: ");
        int valorDos=lector.nextInt();
        System.out.println("Ingrese el numero tres: ");
        int valorTres=lector.nextInt();
        System.out.println("Ingrese el numero cuatro: ");
        int valorCuatro=lector.nextInt();
        System.out.println("Ingrese el numero cinco: ");
        int valorCinco=lector.nextInt();

        double prome=promedio(valorUno, valorDos, valorTres, valorCuatro, valorCinco);
        System.out.println("El promedio de los cinco numeros suministrados es: "+prome);

        int divis=divisibles(valorUno, valorDos, valorTres, valorCuatro, valorCinco);
        System.out.println("La cantidad de numeros divisibles entre 10 son: "+divis);

        lector.close();
    }    

   


}
