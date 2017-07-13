package com.batchmates.android.vectordrawable;

/**
 * Created by Android on 7/12/2017.
 */

public interface BasePresenter<V extends BaseView> {

    void add(V view);
    void remove();
}
