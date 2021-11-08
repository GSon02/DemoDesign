package com.example.demodesign.DemoAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.demodesign.DemoModel.Top_Thumbail_Model_Demo;
import com.example.demodesign.R;

import java.util.List;

public class TopAdapterDemo extends RecyclerView.Adapter<TopAdapterDemo.MyViewHolder> {
    private Context context;
    private List<Top_Thumbail_Model_Demo> thumbail_model_demoList;

    public TopAdapterDemo(Context context, List<Top_Thumbail_Model_Demo> thumbail_model_demoList) {
        this.context = context;
        this.thumbail_model_demoList = thumbail_model_demoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_rows_demo,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Top_Thumbail_Model_Demo top_thumbail_model_demo = thumbail_model_demoList.get(position);
        Glide.with(context).load(top_thumbail_model_demo.getImgTop()).into(holder.imgTop);
        holder.tvTenBaiHat.setText(top_thumbail_model_demo.getTvTenBaiHat());
        holder.tvTenCaSi.setText(top_thumbail_model_demo.getTvTenCaSi());
    }

    @Override
    public int getItemCount() {
        return thumbail_model_demoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgTop;
        private TextView tvTenBaiHat;
        private TextView tvTenCaSi;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgTop = (ImageView) itemView.findViewById(R.id.imgBaiHatTop);
            tvTenBaiHat = (TextView) itemView.findViewById(R.id.tvTenBaiHatTop);
            tvTenCaSi = (TextView) itemView.findViewById(R.id.tvTenCaSiTop);

        }
    }
}
