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
import com.example.demodesign.DemoModel.CaSiHome_Model_Demo;
import com.example.demodesign.R;

import java.util.List;

public class CasiHomeAdapter_Demo extends RecyclerView.Adapter<CasiHomeAdapter_Demo.MyViewHolder> {
    private Context context;
    private List<CaSiHome_Model_Demo> caSiHome_model_demoList;

    public CasiHomeAdapter_Demo(Context context, List<CaSiHome_Model_Demo> caSiHome_model_demoList) {
        this.context = context;
        this.caSiHome_model_demoList = caSiHome_model_demoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.casi_layout_rows,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final CaSiHome_Model_Demo caSiHome_model_demo = caSiHome_model_demoList.get(position);
        holder.tvTenCaSiCaNhan.setText(caSiHome_model_demo.getTenCaSi());
        Glide.with(context).load(caSiHome_model_demo.getImgCaSi()).into(holder.imgCaSiCaNhan);
    }

    @Override
    public int getItemCount() {
        return caSiHome_model_demoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgCaSiCaNhan;
        private TextView tvTenCaSiCaNhan;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCaSiCaNhan = (ImageView) itemView.findViewById(R.id.imgCaSi_CaNhan);
            tvTenCaSiCaNhan = (TextView) itemView.findViewById(R.id.tvTenCaSi_CaNhan);

        }
    }
}
