//package com.developer.kunakorn.bookingapp;
//
////import android.support.test.runner.AndroidJUnit4;
//
//import android.support.test.rule.ActivityTestRule;
//import android.support.test.runner.AndroidJUnit4;
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//@RunWith(AndroidJUnit4.class)
//public class StringBuilderTest {
//
//
//    @Rule
//    public ActivityTestRule<MainActivity> testMain= new ActivityTestRule<MainActivity>(MainActivity.class);
//
//    @Test
//    public void testBuildStringTwoPartShouldGetEmpty() throws Exception {
//        String a = null;
//        String b = null;
//
//        String expected = "";
//
//    //   assrtEquals(expected, StringBuilder.buildStringTwoPart(a, b));
//    }
//
//    @Test
//    public void testBuildStringTwoPartShouldGetEmptyOne() throws Exception {
//        String a = "medium";
//        String b = null;
//
//        String expected = "";
//
//      //  assrtEquals(expected, StringBuilder.buildStringTwoPart(a, b));
//    }
//
//    @Test
//    public void testBuildStringTwoPartShouldGetFullWord() throws Exception {
//        String a = "medium";
//        String b = "fungjai";
//
//        String expected = "medium : fungjai";
//
//       // assrtEquals(expected, StringBuilder.buildStringTwoPart(a, b));
//    }
//
//    @Test
//    public void testBuildStringThreePartShouldGetEmpty() throws Exception {
//        String a = null;
//        String b = null;
//        String c = null;
//
//        String expected = "";
//
//     //   assrtEquals(expected, StringBuilder.buildStringThreePart(a, b, c));
//    }
//
//    @Test
//    public void testBuildStringThreePartShouldGetEmptyOne() throws Exception {
//        String a = "medium";
//        String b = null;
//        String c = "minseobingsu";
//
//        String expected = "";
//
//     //   assrtEquals(expected, StringBuilder.buildStringThreePart(a, b, c));
//    }
//
//    @Test
//    public void testBuildStringThreePartShouldGetFullWord() throws Exception {
//        String a = "medium";
//        String b = "fungjai";
//        String c = "";
//
//        String expected = "medium : fungjai : minseobingsu";
//
//      //  assrtEquals(expected, StringBuilder.buildStringThreePart(a, b, c));
//    }
//}
