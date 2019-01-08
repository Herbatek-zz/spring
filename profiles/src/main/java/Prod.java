import org.springframework.context.annotation.Profile;

@Profile("prod")
public class Prod {

    public Prod() {
        System.out.println(this.getClass().getName());
    }
}
