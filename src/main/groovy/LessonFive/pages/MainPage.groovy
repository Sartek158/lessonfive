package LessonFive.pages


import com.codeborne.selenide.Selenide

class MainPage {

    static openMainPage() {
        Selenide.open("http://litecart.stqa.ru/en/")
    }

    static selectProduct() {

        def products = Selenide.$$x("//li[contains(@class,'product')][not(contains(.,'Sale'))]")
        println("products.size: " + products.size())
        def countOfProducts = products.size()
        def random = new Random()
        def randomResult = random.nextInt(countOfProducts)
        println("randomResult: " + randomResult)
        products.get(randomResult).click()
    }
}
