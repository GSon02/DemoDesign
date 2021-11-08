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
import com.example.demodesign.DemoModel.CaSiFavor_Model_Demo;
import com.example.demodesign.R;

import java.util.List;

public class CasiFavorAdapter_Demo extends RecyclerView.Adapter<CasiFavorAdapter_Demo.MyViewHolder> {
    private Context context;
    private List<CaSiFavor_Model_Demo> caSiFavor_model_demoList;

    public CasiFavorAdapter_Demo(Context context, List<CaSiFavor_Model_Demo> caSiFavor_model_demoList) {
        this.context = context;
        this.caSiFavor_model_demoList = caSiFavor_model_demoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.casi_layout_rows,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final CaSiFavor_Model_Demo caSiFavor_model_demo = caSiFavor_model_demoList.get(position);
        holder.tvTenCaSiCaNhan.setText(caSiFavor_model_demo.getTenCaSi());
        Glide.with(context).load(caSiFavor_model_demo.getImgCaSiID()).into(holder.imgCaSiCaNhan);
    }

    @Override
    public int getItemCount() {
        return caSiFavor_model_demoList.size();
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
