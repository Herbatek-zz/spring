import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.registerBean(EnvReader.class);
        context.refresh();

        EnvReader envReader = context.getBean("envReader", EnvReader.class);
        envReader.sayMyName();

        context.close();
    }
}
