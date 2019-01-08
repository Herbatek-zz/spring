import org.springframework.core.env.Environment;

public class EnvReader {

    private final Environment environment;

    public EnvReader(Environment environment) {
        this.environment = environment;
    }

    void sayMyName() {
        String myName = environment.getProperty("name");
        System.out.println(String.format("My name is: %s", myName));
    }
}
