package LessonFive.steps

import LessonFive.pages.ProductPage
import io.qameta.allure.Step

class ProductPageSteps {

    @Step("Кладем выбранный товар в корзину")
    static addToCart() {
        ProductPage.getAddToCartButton().click()
    }

    @Step("Переходим в корзину")
    static goToCart() {
        ProductPage.getGoToCartButton().click()
    }
}
