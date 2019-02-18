package LessonFive.steps

import LessonFive.pages.ProductPage

class ProductPageSteps {
    static addToCart() {
        ProductPage.getAddToCartButton().click()
    }

    static goToCart() {
        ProductPage.getGoToCartButton().click()
    }
}
