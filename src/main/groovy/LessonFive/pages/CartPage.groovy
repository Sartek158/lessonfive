package LessonFive.pages

import LessonFive.helpers.WebDriverHelper
import com.codeborne.selenide.Selenide

class CartPage {

    static confirmOrder() {

        def confirmButton = Selenide.$("button[name = 'confirm_order']")
        WebDriverHelper.waitJS()
        confirmButton.click()

    }
}
