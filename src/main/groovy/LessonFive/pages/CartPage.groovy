package LessonFive.pages

import com.codeborne.selenide.Selenide

class CartPage {
    static getConfirmOrder() {
        Selenide.$("button[name = 'confirm_order']")
    }

    static getPrice() {
        Selenide.$("tr.footer td:nth-of-type(2)").text
    }
}