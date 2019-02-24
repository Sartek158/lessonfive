package LessonEleven.steps

import LessonEleven.pages.MainPage

import static com.codeborne.selenide.Selenide.$

class Gradle {

    static searchGradle() {
        MainPage.searchField().value("Gradle")
        $(".search2__button").click()
    }

}
