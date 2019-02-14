package LessonFive.pages

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide

class BuyerDataPage {

    static String orderSuccess() {
        def orderSucces = Selenide.$("h1.title")
        orderSucces.waitUntil(Condition.text("Your order is successfully completed!"), 60000)

    }
}
