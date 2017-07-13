package com.batchmates.android.vectordrawable.view.activities.mainactivity;

import android.view.View;
import android.widget.ImageView;

import com.batchmates.android.vectordrawable.BasePresenter;
import com.batchmates.android.vectordrawable.BaseView;

/**
 * Created by Android on 7/12/2017.
 */

public interface MainActivityContract {

    interface View extends BaseView
    {

    }


    interface Presenter extends BasePresenter<View>
    {
        void changeImage(ImageView imageView);
        void setStateDrawable(ImageView imageView);
        void danceButton(ImageView imageView);
        void spinImage(ImageView imageView);
    }

}
