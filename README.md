## Annotation Config — ветка feature/di-annotation.

## Используется внешний WebRunner со скачиванием в корень проекта

curl -L https://repo1.maven.org/maven2/com/github/jsimone/webapp-runner/9.0.27.1/webapp-runner-9.0.27.1.jar -o webapp-runner.jar

## Запуск через

java -jar webapp-runner.jar target/servlets-1.0-SNAPSHOT.war
# Домашнее задание к занятию «2.1. Servlet Containers»

## CRUD

### Легенда

В рамках лекции мы реализовали практически полноценный In-Memory CRUD-сервер (Create Read Update Delete) на базе сервлетов. Этому серверу не хватает двух вещей:

1. Привести код в должный вид: вынести методы в константы, убрать дублирующийся код.
1. Реализовать репозиторий — пока вместо репозитория установлена заглушка.

### Задача

1Домашнее задание к занятию «2.2. Dependency Lookup, Dependency Injection, IoC, Spring, Application Context»
В качестве решения пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте netology.ru.

Важная информация

Перед стартом работы изучите, пожалуйста, ссылки на главной странице репозитория с домашними заданиями.
Если у вас что-то не получилось, тогда оформляйте Issue по установленным правилам.
Как сдавать задачи
Возьмите проект с предыдущей лекции.
Создайте в нём ветки feature/di-annotation и feature/di-java, в которых реализуйте соответствующую функциональность.
Сделайте пуш, удостоверьтесь, что ваш код появился на GitHub, и создайте Pull Request из обеих веток.
Ссылку на Pull Request отправьте в личном кабинете на сайте netology.ru.
DI
Легенда
В рамках лекции мы посмотрели, как использовать Spring для связывания зависимостей.

Возникает вопрос, почему бы не использовать его в вашем приложении с сервлетами и не заменить указанный ниже код на DI со Spring:

@Override
public void init() {
final var repository = new PostRepository();
final var service = new PostService(repository);
controller = new PostController(service);
}
Задача
Замените код в методе init на DI со Spring с использованием методов конфигурирования бинов:

Annotation Config — ветка feature/di-annotation.
Java Config — ветка feature/di-java.
Обратите внимание, что вся функциональность (CRUD), реализованная до этого, должна по-прежнему работать.

Результат
В качестве решения пришлите ссылку на ваши Pull Request в личном кабинете студента на сайте netology.ru.