package LessonFive.pages

import com.codeborne.selenide.Selenide

class ProductPage {
    static getProductPrice() {
        def price = Selenide.$("div.information span.price").text
        String newPrice = price.replaceAll('\\$', '')
        newPrice.toDouble()
    }

    static getAddToCartButton() {
        Selenide.$("button[name='add_cart_product']")
    }

    static getGoToCartButton() {
        Selenide.$("#cart")
    }
}
