import org.springframework.context.annotation.Profile;

@Profile("dev")
public class Dev {

    public Dev() {
        System.out.println(this.getClass().getName());
    }
}
