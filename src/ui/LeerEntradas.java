
import java.util.Scanner;

public class LeerEntradas {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite un numero:");
        int n1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite su nombre:");
        String nombre=scanner.nextLine();
        System.out.println("su nombre es:"+nombre+" Su numero es:"+n1);
        scanner.close();
        

    }
    
}