
## Java Config — ветка feature/di-java.

## Используется внешний WebRunner со скачиванием в корень проекта

curl -L https://repo1.maven.org/maven2/com/github/jsimone/webapp-runner/9.0.27.1/webapp-runner-9.0.27.1.jar -o webapp-runner.jar

## Запуск через

java -jar webapp-runner.jar target/servlets-1.0-SNAPSHOT.war

# Домашнее задание к занятию «2.2. Dependency Lookup, Dependency Injection, IoC, Spring, Application Context»


В качестве решения пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

## Как сдавать задачи

1. Возьмите проект с предыдущей лекции.
1. Создайте в нём ветки `feature/di-annotation` и `feature/di-java`, в которых реализуйте соответствующую функциональность.
1. Сделайте пуш, удостоверьтесь, что ваш код появился на GitHub, и создайте Pull Request из обеих веток.
1. Ссылку на Pull Request отправьте в личном кабинете на сайте [netology.ru](https://netology.ru).

## DI

### Легенда

В рамках лекции мы посмотрели, как использовать Spring для связывания зависимостей.

### Задача

Замените код в методе `init` на DI со Spring с использованием методов конфигурирования бинов:

1. Annotation Config — ветка `feature/di-annotation`.
1. Java Config — ветка `feature/di-java`.

Обратите внимание, что вся функциональность (CRUD), реализованная до этого, должна по-прежнему работать.

### Результат

В качестве решения пришлите ссылку на ваши Pull Request в личном кабинете студента на сайте [netology.ru](https://netology.ru).
