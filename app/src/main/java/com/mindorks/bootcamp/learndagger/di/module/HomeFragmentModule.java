package com.mindorks.bootcamp.learndagger.di.module;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifier.FragmentContext;
import com.mindorks.bootcamp.learndagger.ui.HomeFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by prince patel on 5/8/2019.
 */
@Module
public class HomeFragmentModule {

    private HomeFragment fragment;

    public HomeFragmentModule(HomeFragment fragment) {
        this.fragment = fragment;
    }

    @FragmentContext
    @Provides
    Context provideContext() {
        return fragment.getActivity();
    }

}
