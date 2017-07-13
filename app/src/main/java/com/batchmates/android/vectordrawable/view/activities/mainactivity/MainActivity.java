package com.batchmates.android.vectordrawable.view.activities.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.batchmates.android.vectordrawable.R;
import com.batchmates.android.vectordrawable.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{


    @Inject MainActivityPresenter presenter;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.ivVectorImage);
        DaggerComponent();
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.selector));
        presenter.add(this);
    }

    private void DaggerComponent() {
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String error) {

    }

    public void changeButton(View view) {
        presenter.setStateDrawable(imageView);

    }

    public void danceButton(View view) {
        presenter.danceButton(imageView);
    }

    public void spinBaby(View view) {
        presenter.spinImage(imageView);
    }

    public void likeDancing(View view) {
        Toast.makeText(this, "Of course you do", Toast.LENGTH_SHORT).show();
    }
}
