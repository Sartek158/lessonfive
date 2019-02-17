package LessonFive.pages


import com.codeborne.selenide.Selenide

class CartPage {

    static getConfirmOrder() {

        Selenide.$("button[name = 'confirm_order']")

    }


    static matchPrice() {

        Selenide.$("tr.footer td:nth-of-type(2)").text

    }
}