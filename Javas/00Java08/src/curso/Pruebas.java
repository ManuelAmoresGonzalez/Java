package curso;

import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pruebas {

    public static void main(String[] args) {
        String text = "Hola a todos";

        String valor = IntStream.rangeClosed(0 , text.length() - 1)
                        .mapToObj( value -> String.valueOf(text.charAt( text.length() - value - 1)))
                                .collect(Collectors.toList())
                                        .stream().collect(Collectors.joining(" "));
        System.out.println(valor);

        //Recibe lo que sea y retorna lo que sea
        Function<String, String> function = value -> value.toLowerCase();

        System.out.println(function.apply("Hola"));

        //No recibe nada el supplier y retorna lo que se quiera.
        Supplier<Boolean> supplier = () -> "a".equals("a");
        System.out.println(supplier.get());

        //Recibe lo que sea no retorna nada
        Consumer<Boolean> consumer = value -> System.out.println("Este es el valor del sconsumer: "+value);

        consumer.accept(false);

        //Predicate recibe lo que sea retorna boolean
        Predicate<String> predicate = texto -> texto.equals(text);

        System.out.println("Este es el resultado de predicate: "+ predicate.test(text));
    }
}
