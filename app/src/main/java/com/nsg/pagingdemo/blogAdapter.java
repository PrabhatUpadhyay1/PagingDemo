package com.nsg.pagingdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class blogAdapter extends PagedListAdapter<TestTitle, blogAdapter.MyViewHolder> {

    Context context;

    public blogAdapter(Context context) {
        super(DIFF_CALLBACK);
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
        TestTitle testTitle = getItem(position);
        holder.tittle.setText(testTitle.getTitle());
        holder.description.setText(testTitle.getUpcomingDateTime());

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
    private static DiffUtil.ItemCallback<TestTitle> DIFF_CALLBACK = new DiffUtil.ItemCallback<TestTitle>() {
        @Override
        public boolean areItemsTheSame(@NonNull TestTitle oldItem, @NonNull TestTitle newItem) {
            return oldItem.getTitle()==newItem.getTitle();
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull TestTitle oldItem, @NonNull TestTitle newItem) {
            return oldItem.equals(newItem);
        }
    };

//    @Override
//    public int getItemCount() {
//        return tittleList.size();
//    }

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
