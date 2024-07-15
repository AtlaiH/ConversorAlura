import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Te damos la bienvenida, Este es mi proyecto 'Conversor Alura'");
        System.out.println("Selecciona el numero la accion que quieres realizar");
        try {
            acciones();
        } catch (InputMismatchException e) {
            System.out.println("tienes que ingresar un  numero entre 1-7");
            acciones();
        }

    }

    public static void acciones() {
        while (true) {
            int seleccion;
            Scanner scanner = new Scanner(System.in);
            System.out.println("1) Dólar ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dolar");
            System.out.println("3) Dolar ==> Real brasileño");
            System.out.println("4) Real Brasileño ==> Dolar");
            System.out.println("5) Dolar ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Dolar");
            System.out.println("7) Salir");

            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Usted ha seleccionado Dólar ==> Peso Argentino");
                    break;
                case 2:
                    System.out.println("Usted ha seleccionado Peso Argentino ==> Dolar");
                    break;
                case 3:
                    System.out.println("Usted ha seleccionado Dolar ==> Real brasileño");
                    break;
                case 4:
                    System.out.println("Usted ha seleccionado Real Brasileño ==> Dolar");
                    break;
                case 5:
                    System.out.println("Usted ha seleccionado Dolar ==> Peso Colombiano");
                    break;
                case 6:
                    System.out.println("Usted ha seleccionado Peso Colombiano ==> Dolar");
                    break;
                default:
                    break;
            }
            if (seleccion == 7) {
                break;
            }
        }
    }
}