package com.mindorks.bootcamp.learndagger.util;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by prince patel on 5/8/2019.
 */
@Singleton
public class NetworkHelper {

    private Context context;

    @Inject
    public NetworkHelper(@ApplicationContext Context context) {
        this.context = context;
    }

    public boolean isNetworkConnected() {
        // will check for network connectivity
        return false;
    }
}
