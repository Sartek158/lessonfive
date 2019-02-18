package LessonFive.steps

import LessonFive.helpers.WebDriverHelper
import LessonFive.pages.CartPage
import io.qameta.allure.Step

class CartPageSteps {

    @Step
    static confirmOrder() {
        WebDriverHelper.waitJS()
        CartPage.confirmOrder.click()
    }

    @Step
    static matchPrice(double desiredPrice) {
        String newTotalPrice = CartPage.getPrice().replaceAll('\\$', '')
        double cartPrice = newTotalPrice.toDouble()
        assert cartPrice == desiredPrice: " Wrong Price"
    }
}
