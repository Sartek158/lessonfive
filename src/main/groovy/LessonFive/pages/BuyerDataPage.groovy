package LessonFive.pages

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement

class BuyerDataPage {
    static SelenideElement getOrderSuccess() {
        Selenide.$("h1.title")
    }
}
