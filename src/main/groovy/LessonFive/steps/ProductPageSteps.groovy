package LessonFive.steps


import LessonFive.pages.ProductPage

class ProductPageSteps {


    static addToCart() {
        ProductPage.addToCart().click()
    }

    static goToCart() {

        ProductPage.goToCart().click()

    }


}
