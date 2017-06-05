package com.test.contract;

import com.test.BasePresenter;
import com.test.BaseView;
import com.test.server.BaseModel;
import com.test.server.JobModel;

/**
 * Created by ac on 2016/11/3.
 */

public interface MainActivityContract {

    interface View extends BaseView<Presenter>{
        void onLoading();

        void onLoadingFinish();

        void onResultError();

        void onShowResult(BaseModel<JobModel> result);

    }

    interface Presenter extends BasePresenter {
        void queryData();
    }
}
