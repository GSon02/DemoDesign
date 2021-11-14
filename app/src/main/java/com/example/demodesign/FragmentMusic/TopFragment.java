package com.example.demodesign.FragmentMusic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demodesign.DemoAdapter.SliderAdapter_Demo;
import com.example.demodesign.DemoAdapter.TopAdapterDemo;
import com.example.demodesign.DemoModel.Thumbail_Model_Demo;
import com.example.demodesign.DemoModel.Top_Thumbail_Model_Demo;
import com.example.demodesign.R;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class TopFragment extends Fragment {
    private RecyclerView rcvTop;
    private List<Top_Thumbail_Model_Demo> top_thumbail_model_demos;
    private List<Thumbail_Model_Demo> thumbail_model_demoList;
    private TopAdapterDemo topAdapterDemo;
    private SliderAdapter_Demo sliderAdapter_demo;
    private SliderView sliderTop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcvTop = (RecyclerView) view.findViewById(R.id.rcvTop);
        sliderTop = (SliderView) view.findViewById(R.id.sliderTop);

        top_thumbail_model_demos = new ArrayList<>();
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        top_thumbail_model_demos.add(new Top_Thumbail_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        topAdapterDemo = new TopAdapterDemo(getContext(),top_thumbail_model_demos);
        rcvTop.setAdapter(topAdapterDemo);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        rcvTop.setLayoutManager(layoutManager);

        thumbail_model_demoList = new ArrayList<>();
        sliderAdapter_demo = new SliderAdapter_Demo(getContext(),thumbail_model_demoList);
        thumbail_model_demoList.add(new Thumbail_Model_Demo(R.drawable.demo_lofigirl_thumbail_test));
        thumbail_model_demoList.add(new Thumbail_Model_Demo(R.drawable.demo_nangtho_thumbail));
        thumbail_model_demoList.add(new Thumbail_Model_Demo(R.drawable.demo_tinhyeumauhong_lofi_test));
        sliderTop.setSliderAdapter(sliderAdapter_demo);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);
    }
}