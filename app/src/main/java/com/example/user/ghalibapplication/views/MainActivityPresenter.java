package com.example.user.ghalibapplication.views;

/**
 * Created by User on 4/28/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;

    @Override
    public void addView() {
     //calculation

        view.updateView();

    }
}
