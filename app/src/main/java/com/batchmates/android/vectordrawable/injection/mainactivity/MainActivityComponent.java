package com.batchmates.android.vectordrawable.injection.mainactivity;

import com.batchmates.android.vectordrawable.view.activities.mainactivity.MainActivity;

import dagger.Component;
import dagger.Module;

/**
 * Created by Android on 7/12/2017.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
