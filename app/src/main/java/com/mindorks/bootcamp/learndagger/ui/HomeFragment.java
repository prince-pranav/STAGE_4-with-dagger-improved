package com.mindorks.bootcamp.learndagger.ui;


import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.component.ApplicationComponent;
import com.mindorks.bootcamp.learndagger.di.component.DaggerHomeFragmentComponent;
import com.mindorks.bootcamp.learndagger.di.module.HomeFragmentModule;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * A simple {@link Fragment} subclass.
 */

@Singleton
public class HomeFragment extends Fragment {

    @Inject
    HomeViewModel homeViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDependencies();
    }

    private void getDependencies() {
        DaggerHomeFragmentComponent
                .builder()
                .homeFragmentModule(new HomeFragmentModule(this))
                .applicationComponent(((MyApplication) this.getActivity().getApplication()).applicationComponent)
                .build()
                .inject(this);
    }


    @Inject
    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        ((TextView) this.getActivity().findViewById(R.id.tv_frag)).setText(homeViewModel.getSomeData());


        if (!homeViewModel.getNetworkHelper().isNetworkConnected()) {
            ((TextView) this.getActivity().findViewById(R.id.tv_frag)).setText("No network connection..!");
        } else {
            ((TextView) this.getActivity().findViewById(R.id.tv_frag)).setText("Network connected..!");
        }

    }
}
