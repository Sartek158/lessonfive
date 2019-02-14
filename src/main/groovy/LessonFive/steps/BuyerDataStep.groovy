package LessonFive.steps

import LessonFive.elements.BuyerData
import LessonFive.helpers.WebDriverHelper


class BuyerDataStep {

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
