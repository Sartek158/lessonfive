package LessonEleven.helpers

import com.codeborne.selenide.Selenide
import org.awaitility.Awaitility
import org.awaitility.Duration

class WebDriverHelper {
    static boolean isJQueryReady() {
        try {
            return Selenide.executeJavaScript("return jQuery.active==0")
        } catch (Throwable ignored) {
            return false
        }
    }

    static waitJS() {
        Awaitility.await()
                .atMost(Duration.ONE_MINUTE)
                .pollInterval(Duration.ONE_SECOND)
                .pollInSameThread().ignoreExceptions().until(
                {
                    isJQueryReady()
                }
        )
    }
}