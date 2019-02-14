package LessonFive.pages

import LessonFive.helpers.WebDriverHelper
import com.codeborne.selenide.Selenide

class CartPage {

    static confirmOrder() {

        def confirmButton = Selenide.$("button[name = 'confirm_order']")
        WebDriverHelper.waitJS()
        confirmButton.click()

    }

    static matchPrice() {
        def totalPrice = Selenide.$("tr.footer td:nth-of-type(2)").text
        assert totalPrice.double == ProductPage.getProductPrice(): " Wrong Price"
    }
}