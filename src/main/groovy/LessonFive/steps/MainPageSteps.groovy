package LessonFive.steps

import LessonFive.pages.MainPage
import com.codeborne.selenide.Selenide

class MainPageSteps {

    static openMainPage() {
        Selenide.open("http://litecart.stqa.ru/en/")
    }

    static selectProduct() {
        def products = MainPage.getProducts()
        def countOfProducts = products.size()
        def random = new Random()
        def randomResult = random.nextInt(countOfProducts)
        products.get(randomResult).click()
    }

}
