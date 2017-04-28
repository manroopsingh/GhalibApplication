package com.example.user.ghalibapplication.injection.mainactivity;

import com.example.user.ghalibapplication.views.MainActivity;

import dagger.Component;

/**
 * Created by User on 4/28/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
