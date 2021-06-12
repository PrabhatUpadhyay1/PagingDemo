package com.nsg.pagingdemo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class blogAdapter extends RecyclerView.Adapter<blogAdapter.MyViewHolder> {

    ArrayList<String> tittleList, dateList;
    Context context;

    public blogAdapter(ArrayList<String> tittleList, ArrayList<String> dateList, Context context) {
        this.tittleList = tittleList;
        this.dateList = dateList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        holder.tittle.setText(tittleList.get(position));
        holder.description.setText((dateList.get(position)));

//        holder.full_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(holder.full_view.getContext(), webView.class);
//                intent.putExtra("Link", "blog-details/"+link);
//                Log.i("ssss",link);
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return tittleList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tittle,description,full_view;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tittle = itemView.findViewById(R.id.tittle);
            description = itemView.findViewById(R.id.description);
            full_view = itemView.findViewById(R.id.full_view);
        }
    }
}
