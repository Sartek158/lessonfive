package LessonEleven.steps

import LessonEleven.pages.MainPage

import static com.codeborne.selenide.Selenide.$

class Groovy {

    static searchGroovy() {
        MainPage.searchField().value()
        $(".search2__button").click()
    }


}