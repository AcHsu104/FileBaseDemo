package com.test;

import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

//    private static final String STRING_TO_BE_TYPED = "Peter";
//
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
//            MainActivity.class);
//
//    @Test
//    public void sayHello(){
//        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard()); //line 1
//
//        onView(withText("Say hello!")).perform(click()); //line 2
//
//        String expectedText = "Hello, " + STRING_TO_BE_TYPED + "!";
//        onView(withId(R.id.txtTel)).check(matches(withText(expectedText))); //line 3
//    }
//
//    @Test
//    public void useAppContext() throws Exception {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("com.test", appContext.getPackageName());
//    }
//
//    @Test
//    public void callApi() throws Exception {
//        Map<String, String> query = new HashMap<String, String>();
//        query.put(SaQueryKey.CLIENT_ID, MainApp.getInstance().client_id);
//        query.put(SaQueryKey.CLIENT_SECRET, MainApp.getInstance().client_secret);
//
//        Call<Token> call = /*new HttpClient().init(Api.class).*/
//                HttpClient.getInstance().init(Api.class).getToken(HttpClient.getJsonBody(query));
//
//        call.enqueue(new Callback<Token>() {
//            @Override
//            public void onResponse(Call<Token> call, Response<Token> response) {
//                //请求成功操作
////                Log.e("onResponse", response.message());
////                Log.e("onResponse", response.body().toString());
//
//                System.out.print("onResponse");
//                if(response != null && response.body() != null){
//
//                }
//
//            }
//            @Override
//            public void onFailure(Call<Token> call, Throwable t) {
//                //请求失败操作
//                t.printStackTrace();
//
//            }
//        });
//
////        HttpClient.getInstance().init(Api.class).getToken()
////        assertEquals(4, 2 + 2);
//    }
}
