package com.nsg.pagingdemo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

public class ItemViewModel extends ViewModel {

     LiveData<PagedList<TestTitle>> listLiveData;

     LiveData<PageKeyedDataSource<Integer, TestTitle>> liveData;

    public ItemViewModel(){
        DataSourceFactory factory = new DataSourceFactory();
        liveData = factory.getLiveData();

        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false).setPageSize(1)
                .build();
        listLiveData = (new LivePagedListBuilder(factory, config)).build();
    }

}
