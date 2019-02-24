package LessonEleven.pages

import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$$

class MainPage {

    static searchField() {
        $("#text")
    }


    static resultList() {
        $$(".organic__url")
    }


}
