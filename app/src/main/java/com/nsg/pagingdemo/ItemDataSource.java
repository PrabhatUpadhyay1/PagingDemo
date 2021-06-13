package com.nsg.pagingdemo;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemDataSource extends PageKeyedDataSource<Integer, TestTitle> {

    public static final int FIRST_PAGE = 1;

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, TestTitle> callback) {
        RetrofitClientInstance.getRetrofitInstance()
                .create(apiInterface.class).getAll().enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.body()!=null){
                    callback.onResult(response.body().getTestTitles(),null, FIRST_PAGE+1);

                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, TestTitle> callback) {
        RetrofitClientInstance.getRetrofitInstance()
                .create(apiInterface.class).getAll().enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Integer key = (params.key > 1) ? params.key-1:null;
                if (response.body() != null){
                    callback.onResult(response.body().getTestTitles(), key);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, TestTitle> callback) {
        RetrofitClientInstance.getRetrofitInstance()
                .create(apiInterface.class).getAll().enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Integer key = response.body().getTotal() > 1 ? params.key+1:null;
                if (response.body() != null){
                    callback.onResult(response.body().getTestTitles(), key);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }
}












