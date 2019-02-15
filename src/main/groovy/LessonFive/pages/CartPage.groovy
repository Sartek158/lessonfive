package LessonFive.pages


import LessonFive.helpers.WebDriverHelper
import com.codeborne.selenide.Selenide

class CartPage {

    static confirmOrder() {

        def confirmButton = Selenide.$("button[name = 'confirm_order']")
        WebDriverHelper.waitJS()
        confirmButton.click()

    }

    static matchPrice(double desiredPrice) {
        def totalPrice = Selenide.$("tr.footer td:nth-of-type(2)").text
        String newTotalPrice = totalPrice.replaceAll('\\$', '')
        double cartPrice = newTotalPrice.toDouble()
        assert cartPrice == desiredPrice: " Wrong Price"
    }
}