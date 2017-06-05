//package com.test;
//
//import com.test.MockModel.Logger;
//import com.test.query.SaQueryKey;
//import com.test.samodel.Token;
//import com.test.server.Api;
//import com.test.view.MainActivity;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//import static junit.framework.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
//
///**
// * Example local unit test, which will execute on the development machine (host).
// *
// * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
// */
//
////@RunWith(RobolectricGradleTestRunner.class)
////@Config(constants = BuildConfig.class)
//public class ExampleUnitTest {
//
//    public String client_id = "fb8a9cbaaf663a5c";
//    public String client_secret = "otOoN3Exv5QIZsfV";
//
//    private int count = 0;
//
////    @Mock
//    private MockModel mockLogger = new MockModel();
//
//    private MainActivity activity;
//
//    @Before
//    public void init() throws Exception {
//        ++count;
//        //要先呼叫initMocks，才能使mock的物件正常運作
//        MockitoAnnotations.initMocks(this);
//
////        activity = Robolectric.buildActivity( MainActivity.class )
////                .create()
////                .resume()
////                .get();
//    }
//
//    @Test
//    public void addition_isCorrect() throws Exception {
//
//        Logger logger = mock(Logger.class);
//
//        mockLogger.setLogger(logger);
////        mockLogger.add(-1, -2);
//        mockLogger.add(-1, -2);
//        mockLogger.add(-1, -2);
//        mockLogger.add(-1, -2);
//
//        //assert
//        //verify 相當於之前的 assert，這裡的意思是要驗證 mockLogger 這個物件
//        //的某個 method 是否被呼叫一次，在這個例子中是 log 這個 method，並且不
//        //需要在意參數的字串是甚麼(Mockito.anyString())
//        Mockito.verify(logger).log(Mockito.anyString());
//
//        assertEquals(4, 2 + 2);
//    }
//
//    @Test
//    public void addition_isCorrect_() throws Exception {
//        System.out.print("test");
//        assertEquals(count, 1);
//        assertEquals(count, 2);
//    }
//
//
//    @Test
//    public void callApi() throws Exception {
//        Map<String, String> query = new HashMap<String, String>();
//        query.put(SaQueryKey.CLIENT_ID, client_id);
//        query.put(SaQueryKey.CLIENT_SECRET, client_secret);
//
////        HttpClient.Debug = false;
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
//}