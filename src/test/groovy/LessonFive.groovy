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


        //1. Открыть страницу http://litecart.stqa.ru/en/ (для главной страницы использовать PageObject)
        Selenide.open("http://litecart.stqa.ru/en/")
        //Ищем все продукты
        def products = Selenide.$$x("//li[contains(@class,'product')][not(contains(.,'Sale'))]")
        println("products.size: " + products.size())
        //Считаем количество продуктов
        def countOfProducts = products.size()
        //Создаем экземпляр класса рандом
        def random = new Random()
        //Выбираем случайное число из диапозона от 0 до countOfProducts - 1
        def randomResult = random.nextInt(countOfProducts)
        println("randomResult: " + randomResult)
        //Выбираем продукт под  номером randomResult и кликаем по нему
        products.get(randomResult).click()
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
        assert totalPrice == price : " Wrong Price"










        println("End")




    }
}
