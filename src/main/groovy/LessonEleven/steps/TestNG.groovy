package LessonEleven.steps

import LessonEleven.pages.MainPage

import static com.codeborne.selenide.Selenide.$

class TestNG {

    static searchTestNG() {
        MainPage.searchField().value("TestNG")
        $(".search2__button").click()

    }

}
