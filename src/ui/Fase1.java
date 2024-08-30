import java.util.Scanner;

public class Fase1 {
    
    public static void registroOrganizador(String nombreVoluntario){
        System.out.println("¡Bienvenido,"+nombreVoluntario+"!");
    }
   
    public static String infoRuta(String nomRuta){
        String ruta="No es una ruta existente.";
        String r1="ladera";
        String r2="oriente";
        String r3="farallones";
        
        if (nomRuta.equalsIgnoreCase(r1)){
            ruta="¡Excelente! La Ruta de la Ladera tiene como punto de encuentro Calle 39 - Canchas Panamericanas iniciando a las 5:45 am, y termina a las 2:00 pm.";
        } else if(nomRuta.equalsIgnoreCase(r2)) { 
            ruta="¡Excelente! La Ruta del Oriente tiene como punto de encuentro Calle 39 con Roosevelt - Edificio de Colores iniciando a las 7:30am, y termina a las 4:30 pm.";
        } else if(nomRuta.equalsIgnoreCase(r3)) {
            ruta="¡Excelente! La Ruta de los Farallones tiene como punto de encuentro Calle 16 - Universidad del Valle iniciando a las 6:40 am, y termina a las 4:00 pm.";
        }  
        return ruta;
    }

    public static void datosMeteorologicos(double temperatura, double humedad) {
        if (temperatura>=20&&temperatura<=25&&humedad>=40&&humedad<=60){
            System.out.println("¡Hace un buen dia para caminar por Cali!");
        }
    }

    public static void cantBuses(int totalPersonas) {
        int capacidadBus=25;
        int cantBusesFinal=(totalPersonas+capacidadBus-1)/capacidadBus;
        System.out.println("Al ser un total de "+totalPersonas+" personas que haran parte de la actividad, se necesitaran un total de "+cantBusesFinal+" buses para llevarla a cabo de manera exitosa. ¡Nos vemos en la COP16!");
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido voluntario a la aplicación de Interacción de Rutas Ecológicas COP 16 Cali - Colombia.");
        System.out.println("¿Cuál es tu nombre?");
        String nombreVoluntario=scanner.nextLine();
        System.out.println("Por favor, digita tu cédula.");
        String cedulaVoluntario=scanner.nextLine();
        registroOrganizador(nombreVoluntario);
        System.out.println("¿Qué ruta registrarás el día de hoy?");
        System.out.println("Ladera - Oriente - Farallones");
        String nomRuta=scanner.nextLine();
        String info=infoRuta(nomRuta);  
        System.out.println(info);
        System.out.println("¿Cuantos participantes acudiran a la caminata el día de hoy?");
        int cantParticipantes=scanner.nextInt();
        System.out.println("¿Cuantos guías acudiran a la caminata el día de hoy?");
        int cantGuias=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresar la temperatura en grados centígrados °C");
        double temperatura=scanner.nextDouble();
        System.out.println("Ingresar el porcentaje de humedad relativa");
        double humedad=scanner.nextDouble();
        datosMeteorologicos(temperatura,humedad);
        int totalPersonas=cantParticipantes+cantGuias;
        cantBuses(totalPersonas);
        scanner.close();
    }

  
}

