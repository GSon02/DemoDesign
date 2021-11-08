package com.example.demodesign.DemoAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.demodesign.DemoModel.Thumbail_Model_Demo;
import com.example.demodesign.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SliderAdapter_Demo extends SliderViewAdapter<SliderAdapter_Demo.MyViewHolder> {
    private Context context;
    private List<Thumbail_Model_Demo> thumbail_model_demoList;

    public SliderAdapter_Demo(Context context, List<Thumbail_Model_Demo> thumbail_model_demoList) {
        this.context = context;
        this.thumbail_model_demoList = thumbail_model_demoList;
    }

    @Override
    public int getCount() {
        return thumbail_model_demoList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thumbail_home_glide,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {
        final Thumbail_Model_Demo thumbail_model_demo = thumbail_model_demoList.get(position);
        Glide.with(context).load(thumbail_model_demo.getImgThumbailID()).fitCenter().into(viewHolder.imgThumbailHome);
    }
    public class MyViewHolder extends SliderViewAdapter.ViewHolder {
        private ImageView imgThumbailHome;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgThumbailHome = (ImageView) itemView.findViewById(R.id.img_thumbail_home);

        }
    }
}
