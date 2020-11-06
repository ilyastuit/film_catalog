package com.example.filmcatalog


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.common.views.KView
import com.example.filmcatalog.activities.MainActivity
import com.example.filmcatalog.activities.ProfileActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@LargeTest
class ExampleInstrumentedTest: TestCase() {
    @Rule
    @JvmField
    var rule = ActivityTestRule(MainActivity::class.java)

    val toastIncorrectPassword = KView {
        withText("Неверный пароль!")
    }

    private val screen = MainScreen()
    private val profileScreen = ProfileScreen()

    @Test
    fun loginSuccess() {
        screen {
            loginText.typeText("login")
            passwordText.typeText("1234")
            loginButton.click()
            profileScreen {
                onView(withId(R.id.profile_textview)).check(matches(withText("Привет, login")));
            }
        }
    }
}