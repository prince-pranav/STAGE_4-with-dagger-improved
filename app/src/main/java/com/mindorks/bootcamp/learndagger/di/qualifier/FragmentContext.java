package com.mindorks.bootcamp.learndagger.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by prince patel on 5/8/2019.
 */
@Scope
@Retention(RetentionPolicy.SOURCE)
public @interface FragmentContext {
}
