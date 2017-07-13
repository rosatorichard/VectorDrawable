package com.batchmates.android.vectordrawable.view.activities.mainactivity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.DrawableRes;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.batchmates.android.vectordrawable.R;

/**
 * Created by Android on 7/12/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{


    MainActivityContract.View view;

    @Override
    public void add(MainActivityContract.View view) {
        this.view=view;
    }

    @Override
    public void remove() {
        this.view=null;
    }

    @Override
    public void changeImage(ImageView imageView) {

    }

    @Override
    public void setStateDrawable(ImageView imageView) {
        imageView.setSelected(!imageView.isSelected());
    }

    @Override
    public void danceButton(ImageView imageView) {

        Animation animation= AnimationUtils.loadAnimation(imageView.getContext(),R.anim.cycle);
//        imageView.animate().translationXBy(200);
//        imageView.animate()
        imageView.startAnimation(animation);
    }

    @Override
    public void spinImage(ImageView imageView) {
        Animation animation=AnimationUtils.loadAnimation(imageView.getContext(),R.anim.spin);
        imageView.startAnimation(animation);
    }

}
