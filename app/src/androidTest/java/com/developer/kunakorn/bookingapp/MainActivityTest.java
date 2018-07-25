package com.developer.kunakorn.bookingapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> testMain = new ActivityTestRule<MainActivity>(MainActivity.class);


    @Test
    public void TestClicked() throws Exception {
        onView(withId(R.id.btn_test))        // withId(R.id.my_view) is a ViewMatcher
                .perform(click())               // click() is a ViewAction
                .check(matches(isDisplayed())); // matches(isDisplayed()) is a ViewAssertion
    }

    @After
    public void ClickedIntent() throws Exception {
//        onView(withId(R.id.btn_string))
//               // .perform(click())
//              //  .check(matches(isDisplayed()));
    }

    @After
    public void TestCalculate() throws Exception{
        int a=1,b=2;
        int result =3;
        Assert.assertEquals(result, MainActivity.calculate(a, b));
    }


}
