import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import ru.netology.service.PostService;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //создаем фабрику бинов по умолчанию
        final var factory = new DefaultListableBeanFactory();
        final var reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("classpath:beans.xml");

        //получаем по имени бина. Указываем имя в конфигурационном файле
        final var controller = factory.getBean("postController");
        //получаем по классу бина
        final var service = factory.getBean(PostService.class);
        //создается синглтон, проверка
        final var isSame = service == factory.getBean("postService");
        //репозиторий не создается


    }
}
