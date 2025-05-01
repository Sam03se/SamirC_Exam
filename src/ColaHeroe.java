import java.util.*;

public class ColaHeroe {
    private Queue<Heroe> cola;

    public ColaHeroe() {
        cola = new LinkedList<>();
    }

    public void agregarHeroe(Scanner scanner) {
        System.out.print("Ingrese el nivel de poder del Heroe");
        int nivelPoder = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del Heroe");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la raza del Heroe( Mutante, Humano, Alien");
        String raza = scanner.nextLine();
        System.out.print("Ingrese la habilidad del Heroe (Telepatia, Superfuerza, Vuelo");
        String habilidad = scanner.nextLine();

        Heroe nuevo = new Heroe(nivelPoder, nombre, raza, habilidad);
        cola.offer(nuevo);
        System.out.println("Heroe agregado a la cola");
    }

    public void verPrimero(){
        Heroe primero=cola.peek();
        if(primero != null){
            System.out.println("El primer heroe de la cola es:");
            primero.mostrar();

        }else {
            System.out.println("La cola esta vacia:");
        }
    }

    public void eliminarHeroe(){
        Heroe eliminado=cola.poll();
        if(eliminado != null){
            System.out.println("Heroe eliminado");
            eliminado.mostrar();
        }else{
            System.out.println("No existen heroes en la cola");
        }
    }
    public void mostrarCola(){
        if(cola.isEmpty()){
            System.out.println("La cola de heroes se encuentra vacia");
        }else{
            System.out.println("Heroes que se encuentran en la cola");
            for (Heroe e: cola){
                e.mostrar();
            }
        }
    }
}

