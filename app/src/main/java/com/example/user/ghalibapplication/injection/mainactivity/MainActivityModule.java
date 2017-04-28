package com.example.user.ghalibapplication.injection.mainactivity;

import com.example.user.ghalibapplication.views.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 4/28/2017.
 */

@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter();
    }

}
