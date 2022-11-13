package com.example.geek_hw7_m5

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.numfirstET)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.numfirstET)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)

            Espresso.onView(withId(R.id.numsecondET)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.numsecondET)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)

            Espresso.onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("Вы не заполнили поля")))

        }
    }
    @Test
    fun divide(){
        onView(withId(R.id.numfirstET)).perform(typeText("6"))
        onView(withId(R.id.numsecondET)).perform(typeText("0"))
        onView(withId(R.id.calculateBtn)).perform(click())
        onView(withId(R.id.resultTv)).check(matches(withText("Нельзя делить на ноль")))
    }
}