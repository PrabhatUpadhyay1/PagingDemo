package com.nsg.pagingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Headers;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> tittleList, dateList;
    RecyclerView recyclerView;
    blogAdapter blogAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tittleList = new ArrayList<>();
        dateList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);

        blogAdapter = new blogAdapter(tittleList, dateList, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        apiInterface service = RetrofitClientInstance.getRetrofitInstance().create(apiInterface.class);
        Call<LoginResponse> call = service.getAll();


        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                Toast.makeText(MainActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                Log.i("hello", String.valueOf(response.body().getStatus()));
                for (TestTitle testTitle : response.body().getTestTitles()){
                    tittleList.add(testTitle.getTitle());
                    dateList.add(testTitle.getUpcomingDateTime());
                }
                recyclerView.setAdapter(blogAdapter);
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.i("hello",t.toString());
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}



