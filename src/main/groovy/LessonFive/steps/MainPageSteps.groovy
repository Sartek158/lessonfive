package LessonFive.steps

import LessonFive.pages.MainPage
import com.codeborne.selenide.Selenide
import io.qameta.allure.Step

class MainPageSteps {

    @Step
    static openMainPage() {
        Selenide.open("http://litecart.stqa.ru/en/")
    }

    @Step
    static selectProduct() {
        def products = MainPage.getProducts()
        def countOfProducts = products.size()
        def random = new Random()
        def randomResult = random.nextInt(countOfProducts)
        products.get(randomResult).click()
    }
}
