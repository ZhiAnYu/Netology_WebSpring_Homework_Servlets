import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.netology.service.PostService;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //отдаем список пакетов, в которых нужно искать аннотированные классы
        final var context = new AnnotationConfigApplicationContext("ru.netology");

        //получаем по имени бина. Указываем имя в конфигурационном файле
        final var controller = context.getBean("postController");
        //получаем по классу бина
        final var service = context.getBean(PostService.class);
    }
}
