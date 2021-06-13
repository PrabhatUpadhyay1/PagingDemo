package com.nsg.pagingdemo;


import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class DataSourceFactory extends DataSource.Factory {

    private MutableLiveData<PageKeyedDataSource<Integer, TestTitle>> liveData = new MutableLiveData<>();


    @Override
    public DataSource create() {
        ItemDataSource itemDataSource = new ItemDataSource();
        liveData.postValue(itemDataSource);
        return itemDataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, TestTitle>> getLiveData() {
        return liveData;
    }
}
