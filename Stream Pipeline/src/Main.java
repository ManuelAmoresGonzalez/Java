import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Persona persona1 = new Persona("Manuel","13");
        Persona persona2 = new Persona("Mario","23");
        Persona persona3 = new Persona("Andrea","13");
        Persona persona4 = new Persona("Camila","23");

        List<Persona> personas = new ArrayList<>();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        String todos = personas.stream()
                .map(it -> it.nombre)
                .sorted( (a,b) -> a.length() - b.length())
                .map(it -> "'" + it + "'")
                .reduce("", (a,b) -> a + "\n" + b);

        System.out.println(todos);
    }


}

class Persona{

    public String nombre;
    public String edad;

    public Persona(String nuevoNombre, String nuevaEdad){
        nombre = nuevoNombre;
        edad = nuevaEdad;
    }
}