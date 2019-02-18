package LessonFive.steps

import LessonFive.pages.ProductPage
import io.qameta.allure.Step

class ProductPageSteps {

    @Step
    static addToCart() {
        ProductPage.getAddToCartButton().click()
    }

    @Step
    static goToCart() {
        ProductPage.getGoToCartButton().click()
    }
}
