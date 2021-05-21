import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean3 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(bean3));

        for (int i = 0; i < 3; i++) {
            Cat bean2 = (Cat) applicationContext.getBean("cat");
            System.out.println(bean2);
        }
    }
}