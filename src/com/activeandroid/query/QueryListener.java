package com.activeandroid.query;

import com.activeandroid.Model;

import java.util.List;

/**
 * Created by aduhem on 15/04/2014.
 */
public interface QueryListener {

    public void onQuerySuccess(List<? extends Model> objects);
}
