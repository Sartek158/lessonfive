package LessonFive.pages

import com.codeborne.selenide.Selenide

class MainPage {
    static getProducts() {
        Selenide.$$x("//li[contains(@class,'product')][not(contains(.,'Sale'))]")
    }
}
