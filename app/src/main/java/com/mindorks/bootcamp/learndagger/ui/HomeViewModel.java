package com.mindorks.bootcamp.learndagger.ui;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope;
import com.mindorks.bootcamp.learndagger.util.NetworkHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by prince patel on 5/8/2019.
 */
@FragmentScope
public class HomeViewModel {

    private DatabaseService dbServices;
    private NetworkService networkServices;
    private NetworkHelper networkHelper;

    @Inject
    public HomeViewModel(DatabaseService dbServices, NetworkService networkService, NetworkHelper networkHelper) {
        this.dbServices = dbServices;
        this.networkServices = networkService;
        this.networkHelper = networkHelper;
    }

    public NetworkHelper getNetworkHelper(){
        return networkHelper;
    }

    public String getSomeData() {
        return dbServices.getDummyData() + " : " + networkServices.getDummyData();
    }
}


