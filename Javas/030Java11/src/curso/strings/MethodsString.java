package curso.strings;

public class MethodsString {

	public static void main(String[] args) {
		
		System.out.println(" ".isBlank());                // true
		System.out.println(" Foo Bar ".strip());          // "Foo Bar"
		System.out.println(" Foo Bar ".stripTrailing());  // " Foo Bar"
		System.out.println(" Foo Bar ".stripLeading());   // "Foo Bar "
		System.out.println("Toc ".repeat(3));             // 
		System.out.println("A\nB\nC".lines().count());    // 3
	}

}
