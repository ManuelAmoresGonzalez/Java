import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("a","b","c");
        StringBuilder sb = new StringBuilder();
        stream.forEach(s -> sb.append(s));
        System.out.println(sb);
    }
}