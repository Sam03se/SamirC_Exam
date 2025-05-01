import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ColaHeroe control= new ColaHeroe();
        int opcion;

        do {
            System.out.println("\n--------------------HEROES--------------");
            System.out.println("1.- Añadir un heroe");
            System.out.println("2.- Ver Primer Heroe en la cola");
            System.out.println("3.- Eliminar heroe ");
            System.out.println("4.- Mostrar todos los heroes");
            System.out.println("5.- Salir");
            System.out.println("Seleccione una opcion");
            opcion=scanner.nextInt();
        }
    }
}