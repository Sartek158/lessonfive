package LessonFive.elements

import static com.codeborne.selenide.Selenide.$

class BuyerData {
    static FirstName(String firstName) {
        $("input[name = 'firstname']")
    }

    static LastName(String lastName) {
        $("input[name = 'lastname']")
    }

    static Address1(String address1) {
        $("input[name = 'address1']")
    }

    static PostCode(String postcode) {
        $("input[name = 'postcode']")
    }

    static City(String city) {
        $("input[name = 'city']")
    }

    static Email(String email) {
        $("input[name = 'email']")
    }

    static Phone(String phone) {
        $("input[name = 'phone']")
    }

    static Comments(String comments) {
        $("textarea[name = 'comments']")
    }
}
