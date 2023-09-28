import com.PrimerAspecto.TargetObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PrimerAspectoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PrimerAspectoApplication.class);
		TargetObject targetObject = context.getBean(TargetObject.class);
		targetObject.hello("Hello World");
	}
}
