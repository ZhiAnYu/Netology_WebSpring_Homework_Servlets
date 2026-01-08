## Используется внешний WebRunner со скачиванием в корень проекта

curl -L https://repo1.maven.org/maven2/com/github/jsimone/webapp-runner/9.0.27.1/webapp-runner-9.0.27.1.jar -o webapp-runner.jar

## Запуск через

java -jar webapp-runner.jar target/servlets-1.0-SNAPSHOT.war

# Домашнее задание к занятию «2.1. Servlet Containers»



## WebApp Runner* (задача со звёздочкой)

Это необязательная задача, её выполнение не влияет на получение зачёта.

### Легенда

Не всегда удобно «таскать» за собой полноценный Tomcat: скачивать его, распаковывать и т. д. Достаточно часто используют библиотеку [WebApp Runner](https://github.com/heroku/webapp-runner), ранее (com.github.jsimone webapp-runner).

Встраивание WebApp Runner в ваш проект позволяет запускать его таким образом: `java -jar target/dependency/webapp-runner.jar target/<appname>.war`. Это достаточно удобно для размещения на облачных платформах.

### Задача

Добавьте в свою сборку скачивание `webapp-runner` согласно [инструкции](https://github.com/heroku/webapp-runner#using-with-maven-in-your-project).

Убедитесь, что сборка проходит, и ваш war-файл действительно запускается указанной выше командой.

### Результат

Реализуйте новую функциональность в ветке `feature/webapp-runner` вашего репозитория из предыдущего домашнего задания и откройте Pull Request.

В качестве результата пришлите ссылку на ваш Pull Request на GitHub в личном кабинете студента на сайте [netology.ru](https://netology.ru).

После того, как домашнее задание будет принято, сделайте `merge` для Pull Request.
