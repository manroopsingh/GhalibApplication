package com.example.user.ghalibapplication.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.user.ghalibapplication.R;
import com.example.user.ghalibapplication.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    private static final String TAG = "MainActivity";
    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DaggerMainActivityComponent.create().inject(this);




        presenter.addView();
        //Step 1: Create module where you the dependencies
        //Step 2: Create component, that is the going to have modules mapped with views
        //Step 3: Injection, @Inject
        //Step 4: Object graph: We create in the activity
    }

    @Override
    public void updateView() {

        Log.d(TAG, "updateView: ");

        //update your views

    }
}
