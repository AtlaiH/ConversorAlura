import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int seleccion;
        System.out.println("Te damos la bienvenida, Este es mi proyecto 'Conversor Alura'");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona el numero la divisa que quieres convertir");
//
        System.out.println("1) Dólar ==> Peso Argentino");
        System.out.println("2) Peso Argentino ==> Dolar");
        System.out.println("3) Dolar ==> Real brasileño");
        System.out.println("4) Real Brasileño ==> Dolar");
        System.out.println("5) Dolar ==> Peso Colombiano");
        System.out.println("6) Peso Colombiano ==> Dolar");
        System.out.println("7) Salir"+"\n");

        seleccion = scanner.nextInt();

        switch (seleccion){
            case 1:
                System.out.println("Usted ha seleccionado Dólar ==> Peso Argentino");
                break;
            case 2:
                System.out.println("Usted ha seleccionado Dólar ==> Peso Argentino");
                break;
            default:
                System.out.println("La opcion ingresada no esta marcada en las opciones de arriba");
        }

    }
}