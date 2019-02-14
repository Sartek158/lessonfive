package LessonFive.pages


import com.codeborne.selenide.Selenide

class MainPage {

    static openMainPage() {
        Selenide.open("http://litecart.stqa.ru/en/")
    }


    static selectProduct() {

        def products = Selenide.$$x("//li[contains(@class,'product')][not(contains(.,'Sale'))]")
        def countOfProducts = products.size()
        def random = new Random()
        def randomResult = random.nextInt(countOfProducts)
        products.get(randomResult).click()
    }
}
