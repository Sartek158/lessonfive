import LessonFive.pages.BuyerDataPage
import LessonFive.pages.ProductPage
import LessonFive.steps.BuyerDataSteps
import LessonFive.steps.CartPageSteps
import LessonFive.steps.MainPageSteps
import LessonFive.steps.ProductPageSteps
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



        MainPageSteps.openMainPage()
        MainPageSteps.selectProduct()
        def productPrice = ProductPage.getProductPrice()
        ProductPage.addcartCount()
        ProductPageSteps.addToCart()
        ProductPageSteps.goToCart()
        CartPageSteps.matchPrice(productPrice)
        BuyerDataSteps.fillBuyerData()
        CartPageSteps.confirmOrder()
        BuyerDataPage.orderSuccsess()

    }
}
