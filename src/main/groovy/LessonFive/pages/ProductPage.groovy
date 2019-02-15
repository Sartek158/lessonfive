package LessonFive.pages

import LessonFive.helpers.WebDriverHelper
import com.codeborne.selenide.Selenide

class ProductPage {


    static getProductPrice() {
        def price = Selenide.$("div.information span.price").text
        String newPrice = price.replaceAll('\\$', '')
        newPrice.toDouble()
    }

    static addToCart() {
        def addToCartButton = Selenide.$("button[name='add_cart_product']")
        addToCartButton.click()
    }

    static addcartCount() {
        def cartCount = Selenide.$("span.quantity")
        def currentCartCount = cartCount.text
    }

    static goToCart() {
        WebDriverHelper.waitJS()
        Selenide.$("#cart").click()
    }

}
