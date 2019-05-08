package com.mindorks.bootcamp.learndagger.di.component;

import com.mindorks.bootcamp.learndagger.di.module.HomeFragmentModule;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.ui.HomeFragment;

import dagger.Component;

/**
 * Created by prince patel on 5/8/2019.
 */
@FragmentScope
@Component(dependencies = {ApplicationComponent.class}, modules = {HomeFragmentModule.class})
public interface HomeFragmentComponent {

    void inject(HomeFragment fragment);
}
