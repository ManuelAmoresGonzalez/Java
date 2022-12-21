import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer suma = lista.parallelStream()
                .peek(System.out::println)
                .reduce(0, (a,b) -> a+b);

        System.out.println(suma);



        lista.parallelStream()
                .map(String:: valueOf)
                .collect(Collectors.joining(","));

    }
}