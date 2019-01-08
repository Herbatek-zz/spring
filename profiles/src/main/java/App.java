import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.registerBean(Dev.class);
        context.registerBean(Prod.class);
        context.registerBean(WithoutProfile.class);
        context.refresh();

        context.close();
    }
}
