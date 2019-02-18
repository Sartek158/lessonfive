package LessonFive.steps

import LessonFive.helpers.WebDriverHelper
import LessonFive.pages.CartPage

class CartPageSteps {
    static confirmOrder() {
        WebDriverHelper.waitJS()
        CartPage.confirmOrder.click()
    }

    static matchPrice(double desiredPrice) {
        String newTotalPrice = CartPage.getPrice().replaceAll('\\$', '')
        double cartPrice = newTotalPrice.toDouble()
        assert cartPrice == desiredPrice: " Wrong Price"
    }
}
