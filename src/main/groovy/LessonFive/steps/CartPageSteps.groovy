package LessonFive.steps

import LessonFive.helpers.WebDriverHelper
import LessonFive.pages.CartPage
import io.qameta.allure.Step

class CartPageSteps {

    @Step("Подтверждем заказ")
    static confirmOrder() {
        WebDriverHelper.waitJS()
        CartPage.confirmOrder.click()
    }

    @Step("Проверяем что сумма заказа равна стоимости продукта")
    static matchPrice(double desiredPrice) {
        String newTotalPrice = CartPage.getPrice().replaceAll('\\$', '')
        double cartPrice = newTotalPrice.toDouble()
        assert cartPrice == desiredPrice: " Wrong Price"
    }
}
