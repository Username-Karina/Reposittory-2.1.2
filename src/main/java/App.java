import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld oneMoreBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(oneMoreBean.getMessage());

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean1 =
                (Cat) applicationContext1.getBean("cat");
        System.out.println(bean1.getClass());

        Cat oneMoreBean1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(oneMoreBean1.getClass());

        System.out.println(bean.equals(oneMoreBean));
        System.out.println(bean1.equals(oneMoreBean1));
    }
}