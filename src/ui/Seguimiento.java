import java.util.Scanner;

public class Seguimiento {


    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor digite la temperatura en C°:");
        Double temperatura=scanner.nextDouble();
        scanner.nextLine();
        String mensajeVerificacion=calculoTemperatura(temperatura);
        System.out.println(mensajeVerificacion);
        System.out.println("Digite su nombre:");
        String nombreOrganizador=scanner.nextLine();
        obtenerRegalo(nombreOrganizador);
        scanner.close();
        
    }


public static String calculoTemperatura(double temperatura){
    String mensajeVerificacion1="Lleve chaqueta para protegerse del frio y de la lluvia";
    String mensajeVerificacion2="Lleve termo del agua, beba para hidratarse.";
    String mensaje="Disfrute la caminata";
    if (temperatura < 15){
        mensaje=mensajeVerificacion1;
    } else if (temperatura>28){
        mensaje=mensajeVerificacion2;
    }
    return mensaje;
    }

    public static void obtenerRegalo(String nombreOrganizador){
        char inicial=nombreOrganizador.charAt(0);
        char inicialMinuscula=Character.toLowerCase(inicial);
        if ( inicialMinuscula == 'a' || inicialMinuscula == 'e' || inicialMinuscula == 'i' || inicialMinuscula == 'o' || inicialMinuscula == 'u' ){
            System.out.println("Comuniquese al numero 1800456789 para obtener una entrada gratuita a una conferencia del cop16");
        } else{
            System.out.println("Gracias por su tiempo.");
        }

    }

}

