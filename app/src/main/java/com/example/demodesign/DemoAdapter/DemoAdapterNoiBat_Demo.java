package com.example.demodesign.DemoAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demodesign.DemoModel.NoiBatImageModel_Demo;
import com.example.demodesign.R;

import java.util.List;

public class DemoAdapterNoiBat_Demo extends RecyclerView.Adapter<DemoAdapterNoiBat_Demo.MyViewHolder> {
    private Context context;
    private List<NoiBatImageModel_Demo> noiBatImageModel_demoList;

    public DemoAdapterNoiBat_Demo(Context context, List<NoiBatImageModel_Demo> noiBatImageModel_demoList) {
        this.context = context;
        this.noiBatImageModel_demoList = noiBatImageModel_demoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.noibat_row_demo,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final NoiBatImageModel_Demo noiBatImageModel_demo = noiBatImageModel_demoList.get(position);
        holder.imgThumbailNoiBat.setImageResource(noiBatImageModel_demo.getImgUrl());
        holder.tvTitleNoiBat.setText(noiBatImageModel_demo.getTitle());
    }

    @Override
    public int getItemCount() {
        return noiBatImageModel_demoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgThumbailNoiBat;
        private TextView tvTitleNoiBat;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgThumbailNoiBat = (ImageView) itemView.findViewById(R.id.img_noiBat);
            tvTitleNoiBat = (TextView) itemView.findViewById(R.id.tvTitleNoiBat);
        }
    }
}
