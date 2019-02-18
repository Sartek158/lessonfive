package LessonFive.steps

import LessonFive.elements.BuyerData
import LessonFive.helpers.WebDriverHelper
import LessonFive.pages.BuyerDataPage
import com.codeborne.selenide.Condition
import io.qameta.allure.Step

class BuyerDataSteps {

    @Step
    static String OrderSuccess() {
        BuyerDataPage.getOrderSuccess().waitUntil(Condition.text("Your order is successfully completed!"), 60000)
    }

    @Step
    static void fillBuyerData() {
        BuyerData.FirstName().setValue("Ivan" + UUID.randomUUID().toString())
        BuyerData.LastName().setValue("Medvedev" + UUID.randomUUID().toString())
        BuyerData.Address1().setValue("Veresaeva 12 7")
        BuyerData.PostCode().setValue("121357" + UUID.randomUUID().toString())
        BuyerData.City().setValue("Moscow")
        BuyerData.Email().setValue("test@tinkoff.ru")
        BuyerData.Phone().setValue("+791657445561")
        WebDriverHelper.waitJS()
        BuyerData.Comments().setValue("V domofon ne zvonit")
    }
}
