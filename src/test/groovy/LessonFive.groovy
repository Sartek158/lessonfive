import LessonFive.pages.BuyerDataPage
import LessonFive.pages.CartPage
import LessonFive.pages.MainPage
import LessonFive.steps.BuyerDataStep
import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import org.testng.annotations.Test

class LessonFive {

    @Test
     void lessonFive() {

        /**
         * Домашнее задание по теме PageObject - до понедельника, 24 декабря:
         * 1. Открыть страницу http://litecart.stqa.ru/en/ (для главной страницы использовать PageObject)
         * 2. Выбрать случайный продукт
         * 3. Записать стоимость продукта (для страницы с продуктом выделить отдельный PageObject)
         * 4. Добавить его в корзину
         * 5. Перейти в корзину (для страницы с корзиной PageObject)
         * 6. Убедиться, что сумма заказа = стоимость продукта
         * 7. Заполнить данные получателя (форму с полями ввода данных получателя и кнопку заказа вынести в отдельный типизированный элемент)
         * 8. Подтвердить заказ
         * 9. Проверить, что отображается сообщение об успешном заказе (для страницы использовать отдельный PageObject)
         */



        MainPage.openMainPage()
        MainPage.selectProduct()
        //Записываем стоимость
        def price = Selenide.$("div.information span.price").text
        //Записываем количество товаров в корзине
        def cartCount = Selenide.$("span.quantity")
        def currentCartCount = cartCount.text
        //Кликаем по кнокпе добавления в корзину
        def addToCartButton = Selenide.$("button[name='add_cart_product']")
        addToCartButton.click()
        //Ожидаем в течении одной секунды пока значение currentCartCount перестанет совпадать с текушим значением корзины cartCount.text
        cartCount.waitUntil(Condition.not(Condition.text(currentCartCount)),60000)
        Selenide.$("#cart").click()
        def totalPrice = Selenide.$("tr.footer td:nth-of-type(2)").text
        assert totalPrice.double == price.double: " Wrong Price"
        BuyerDataStep.fillBuyerData()
        CartPage.confirmOrder()
        BuyerDataPage.orderSuccess()

    }
}
