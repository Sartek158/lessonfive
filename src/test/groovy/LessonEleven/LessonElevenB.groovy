package LessonEleven

import LessonEleven.steps.Gradle
import LessonEleven.steps.Groovy
import LessonEleven.steps.TestNG
import groovy.util.logging.Slf4j
import org.testng.annotations.Test

@Slf4j

class LessonElevenB extends LessonElevenA {

//    Домашнее задание к 11 занятию по TestNG:
//    1. Создать тестовый класс, в котором перед выполнением тестовых методов (BeforeMethod) открывается страница "ya.ru", а по завершению тестового метода (AfterMethod) - браузер закрывается
//    2. Написать метод-шаг, который позволяет выполнять поиск в Яндексе по тексту и возвращает список найденных ссылок (атрибут "href" у результатов поиска)
//    3. Написать внутри тестового класса 3 тестовых метода, которые выполняют поиск "Gradle", "Groovy", "TestNG" и выводят в лог-файл
//    4. Сформировать тестовый набор в виде testng.xml, состоящий из одной тестовой группы, методы в которой выполняются параллельно в 3 потока
//    5. Результаты залить на GitHub


    @Test(groups = ["TEST_A"])
    void fundGroovy() {
        TestNG.searchTestNG()
    }

    @Test(groups = ["TEST_B"])
    void findGradle() {
        Gradle.searchGradle()
    }

    @Test(groups = ["TEST_C"])
    void findTestNG() {
        Groovy.searchGroovy()
    }

}