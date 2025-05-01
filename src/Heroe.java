import java.util.*;

public class Heroe {
    private String nombre;
    private String raza;
    private String habilidad;
    private int nivelPoder;

    public Heroe(int nivelPoder, String nombre, String raza, String habilidad){
        this.nivelPoder= nivelPoder;
        this.habilidad= habilidad;
        this.raza=raza;
        this.nombre=nombre;

    }

    public int getNivelPoder(){
        return nivelPoder;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }
    public void mostrar(){
        System.out.println("El nvel de poder es:"+nivelPoder);
    }

}
