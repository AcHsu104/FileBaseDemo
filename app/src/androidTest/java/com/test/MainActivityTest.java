//package com.test;
//
//import android.support.test.rule.ActivityTestRule;
//
//import com.test.view.MainActivity;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//
///**
// * Created by ac on 2016/11/11.
// */
//
//public class MainActivityTest {
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityRule =
//            new ActivityTestRule<>(MainActivity.class, true, false);
////    private MockWebServer server;
//
//    @Before
//    public void setUp() throws Exception {
////        super.setUp();
////        server = new MockWebServer();
////        server.start();
////        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
////        QuoteOfTheDayConstants.BASE_URL = server.url("/").toString();
//    }
//
//    @Test
//    public void testQuoteIsShown() throws Exception {
////        String fileName = "quote_200_ok_response.json";
////        server.enqueue(new MockResponse()
////                .setResponseCode(200)
////                .setBody(RestServiceTestHelper.getStringFromFile(getInstrumentation().getContext(), fileName)));
////
////        Intent intent = new Intent();
////        mActivityRule.launchActivity(intent);
////
////        onView(withId(R.id.button_retry)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.GONE)));
////        onView(withText("I came from a real tough neighborhood. Once a guy pulled a knife on me. I knew he wasn't a professional, the knife had butter on it.")).check(matches(isDisplayed()));
//    }
//
//
//    @Test
//    public void testRetryButtonShowsWhenError() throws Exception {
////        String fileName = "quote_404_not_found.json";
////
////        server.enqueue(new MockResponse()
////                .setResponseCode(404)
////                .setBody(RestServiceTestHelper.getStringFromFile(getInstrumentation().getContext(), fileName)));
////
////        Intent intent = new Intent();
////        mActivityRule.launchActivity(intent);
////
////        onView(withId(R.id.button_retry)).check(matches(isDisplayed()));
////        onView(withText("Quote Not found")).check(matches(isDisplayed()));
//    }
//
//    @After
//    public void tearDown() throws Exception {
////        server.shutdown();
//    }
//
//}
