package LessonEleven

import LessonEleven.pages.MainPage
import groovy.util.logging.Slf4j
import org.testng.annotations.Test

import static com.codeborne.selenide.Selenide.$

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
        searchResult("Groovy")
    }

    @Test(groups = ["TEST_B"])
    void findGradle() {
        searchResult("Gradle")
    }

    @Test(groups = ["TEST_C"])
    void findTestNG() {
        searchResult("TestNG")
    }

    static searchResult(testingTool) {

        MainPage.searchField().value = testingTool
        $(".search2__button").click()

        log.info("Test")


    }


}