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
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.demodesign.DemoAdapter.DemoAdapterNoiBat_Demo;
import com.example.demodesign.DemoAdapter.SliderAdapter_Demo;
import com.example.demodesign.DemoModel.NoiBatImageModel_Demo;
import com.example.demodesign.DemoModel.Thumbail_Model_Demo;
import com.example.demodesign.R;
import com.google.android.material.textfield.TextInputLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment {
    private List<NoiBatImageModel_Demo> noiBatImageModel_demoList;
    private List<Thumbail_Model_Demo> thumbail_model_demoList;
    private DemoAdapterNoiBat_Demo demoAdapterNoiBatDemo;
    private SliderAdapter_Demo sliderAdapter_demo;
    private RecyclerView rcvNoiBat;
    private RecyclerView rcvHot;
    private RecyclerView rcvCaSi;
    private TextView tvNoiBat;
    private SliderView imgSliderThumbail;
    private ScrollView scrollViewHome;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcvNoiBat = (RecyclerView) view.findViewById(R.id.rcvNoiBat);
        tvNoiBat = (TextView) view.findViewById(R.id.tvNoiBat);
        imgSliderThumbail = (SliderView) view.findViewById(R.id.imgSliderThumbail);
        rcvHot = (RecyclerView) view.findViewById(R.id.rcvHot);
        rcvCaSi = (RecyclerView) view.findViewById(R.id.rcvCaSi);
        scrollViewHome = (ScrollView) view.findViewById(R.id.scrollViewHome);

        noiBatImageModel_demoList = new ArrayList<>();
        demoAdapterNoiBatDemo = new DemoAdapterNoiBat_Demo(getContext(),noiBatImageModel_demoList);
        noiBatImageModel_demoList.add(new NoiBatImageModel_Demo(1,R.drawable.demo_lofigirl_thumbail_test,"Nghe nhạc cùng LofiGirl"));
        noiBatImageModel_demoList.add(new NoiBatImageModel_Demo(1,R.drawable.demo_tinhyeumauhong_lofi_test,"Tình Yêu Màu Hồng"));
        noiBatImageModel_demoList.add(new NoiBatImageModel_Demo(1,R.drawable.demo_nangtho_test,"Nàng thơ của Hoàng Dũng"));
        rcvNoiBat.setAdapter(demoAdapterNoiBatDemo);
        RecyclerView.LayoutManager layoutManagerNoiBat = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rcvNoiBat.setLayoutManager(layoutManagerNoiBat);

        //TEST
        rcvCaSi.setAdapter(demoAdapterNoiBatDemo);
        RecyclerView.LayoutManager layoutManagerCaSi = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rcvCaSi.setLayoutManager(layoutManagerCaSi);
        rcvHot.setAdapter(demoAdapterNoiBatDemo);
        RecyclerView.LayoutManager layoutManagerHot = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rcvHot.setLayoutManager(layoutManagerHot);
        //TEST
        thumbail_model_demoList = new ArrayList<>();
        sliderAdapter_demo = new SliderAdapter_Demo(getContext(),thumbail_model_demoList);
        thumbail_model_demoList.add(new Thumbail_Model_Demo(R.drawable.demo_burnitdown_thumbail));
        thumbail_model_demoList.add(new Thumbail_Model_Demo(R.drawable.demo_psycho_thumbail));
        thumbail_model_demoList.add(new Thumbail_Model_Demo(R.drawable.demo_namnguemru_thumbail));
        imgSliderThumbail.setSliderAdapter(sliderAdapter_demo);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}