package com.test.viewmodel;

import android.content.Context;

/**
 * Created by ac on 2016/11/1.
 */

public interface MainViewModelContract {
    interface MainView{
        Context getContext();

//        void loadData(List<People> peoples);
    }

    interface ViewModel{
        void destroy();
    }

}
