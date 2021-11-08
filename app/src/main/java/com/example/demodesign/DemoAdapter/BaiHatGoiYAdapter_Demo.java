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
import com.example.demodesign.DemoModel.BaiHatGoiY_Model_Demo;
import com.example.demodesign.R;

import java.util.List;

public class BaiHatGoiYAdapter_Demo extends RecyclerView.Adapter<BaiHatGoiYAdapter_Demo.MyViewHolder> {
    private Context context;
    private List<BaiHatGoiY_Model_Demo> baiHatGoiY_model_demoList;

    public BaiHatGoiYAdapter_Demo(Context context, List<BaiHatGoiY_Model_Demo> baiHatGoiY_model_demoList) {
        this.context = context;
        this.baiHatGoiY_model_demoList = baiHatGoiY_model_demoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bai_hat_goi_y_row_demo,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final BaiHatGoiY_Model_Demo baiHatGoiY_model_demo = baiHatGoiY_model_demoList.get(position);
        Glide.with(context).load(baiHatGoiY_model_demo.getImgBaiHat()).into(holder.imtBaiHatGoiY);
        holder.tvTenBaiHatGoiY.setText(baiHatGoiY_model_demo.getTvTenBaiHat());
        holder.tvTenCaSiGoiY.setText(baiHatGoiY_model_demo.getTvTenCaSi());
    }

    @Override
    public int getItemCount() {
        return baiHatGoiY_model_demoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imtBaiHatGoiY;
        private TextView tvTenBaiHatGoiY;
        private TextView tvTenCaSiGoiY;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imtBaiHatGoiY = (ImageView) itemView.findViewById(R.id.imgBaiHatGoiY);
            tvTenBaiHatGoiY = (TextView) itemView.findViewById(R.id.tvTenBaiHat_GoiY);
            tvTenCaSiGoiY = (TextView) itemView.findViewById(R.id.tvTenCaSiGoiY);

        }
    }
}
