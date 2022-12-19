

import java.util.Optional;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona person = new Persona(Optional.of("Amores"));
        System.out.println(saluda(Optional.of(person)));
    }

    static String saluda(Optional<Persona> persona){
        return persona.flatMap(Persona::getNombre)
                .map("Hola "::concat)
                .orElse("Estoy solo");
    }

}

class Persona {
    private Optional<String> nombre;

    public Persona(Optional<String> nombreNuevo){
        nombre = nombreNuevo;
    }

    Optional<String> getNombre(){
        return nombre;
    }
}