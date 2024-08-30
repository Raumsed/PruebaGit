public class Pandeyuca{
    public static void main (String[] args){
        int montoMama=10000;
        int montoCobro=1500;
        int montoPan=montoMama-montoCobro;
        int montoUnidadPan=1200;
        int cantidadPan=montoPan/montoUnidadPan;
        System.out.println("La cantidad de pandeyucas es:"+cantidadPan);
        int devuelta=montoPan-(cantidadPan*montoUnidadPan);
        System.out.println("La devuelta es:"+devuelta);
    }
}