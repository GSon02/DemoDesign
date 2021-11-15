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
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.demodesign.DemoAdapter.CasiHomeAdapter_Demo;
import com.example.demodesign.DemoAdapter.DemoAdapterNoiBat_Demo;
import com.example.demodesign.DemoAdapter.SliderAdapter_Demo;
import com.example.demodesign.DemoModel.CaSiHome_Model_Demo;
import com.example.demodesign.DemoModel.NoiBatImageModel_Demo;
import com.example.demodesign.DemoModel.Thumbail_Model_Demo;
import com.example.demodesign.R;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private List<NoiBatImageModel_Demo> noiBatImageModel_demoList;
    private List<Thumbail_Model_Demo> thumbail_model_demoList;
    private List<CaSiHome_Model_Demo> caSiHome_model_demoList;
    private DemoAdapterNoiBat_Demo demoAdapterNoiBatDemo;
    private CasiHomeAdapter_Demo casiHomeAdapter_demo;
    private SliderAdapter_Demo sliderAdapter_demo;
    private RecyclerView rcvNoiBat;
    private RecyclerView rcvSinger;
    private RecyclerView rcvNews;
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
        rcvSinger = (RecyclerView) view.findViewById(R.id.rcvSinger);
        rcvNews = (RecyclerView) view.findViewById(R.id.rcvNews);
        scrollViewHome = (ScrollView) view.findViewById(R.id.scrollViewHome);

        noiBatImageModel_demoList = new ArrayList<>();
        demoAdapterNoiBatDemo = new DemoAdapterNoiBat_Demo(getContext(),noiBatImageModel_demoList);
        noiBatImageModel_demoList.add(new NoiBatImageModel_Demo(1,R.drawable.demo_lofigirl_thumbail_test,"Nghe nhạc cùng LofiGirl"));
        noiBatImageModel_demoList.add(new NoiBatImageModel_Demo(2,R.drawable.demo_tinhyeumauhong_lofi_test,"Tình Yêu Màu Hồng"));
        noiBatImageModel_demoList.add(new NoiBatImageModel_Demo(3,R.drawable.demo_nangtho_test,"Nàng thơ của Hoàng Dũng"));
        rcvNoiBat.setAdapter(demoAdapterNoiBatDemo);
        RecyclerView.LayoutManager layoutManagerNoiBat = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rcvNoiBat.setLayoutManager(layoutManagerNoiBat);

        //TEST
        rcvNews.setAdapter(demoAdapterNoiBatDemo);
        RecyclerView.LayoutManager layoutManagerCaSi = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rcvNews.setLayoutManager(layoutManagerCaSi);

        caSiHome_model_demoList = new ArrayList<>();
        casiHomeAdapter_demo = new CasiHomeAdapter_Demo(getContext(),caSiHome_model_demoList);
        caSiHome_model_demoList.add(new CaSiHome_Model_Demo(1,R.drawable.bichphuong_avatar,"Bích Phương"));
        caSiHome_model_demoList.add(new CaSiHome_Model_Demo(2,R.drawable.dalab_avatar,"DaLab"));
        caSiHome_model_demoList.add(new CaSiHome_Model_Demo(3,R.drawable.masew_avatar,"Masew"));
        caSiHome_model_demoList.add(new CaSiHome_Model_Demo(1,R.drawable.bichphuong_avatar,"Bích Phương"));
        caSiHome_model_demoList.add(new CaSiHome_Model_Demo(2,R.drawable.dalab_avatar,"DaLab"));
        caSiHome_model_demoList.add(new CaSiHome_Model_Demo(3,R.drawable.masew_avatar,"Masew"));
        rcvSinger.setAdapter(casiHomeAdapter_demo);
        RecyclerView.LayoutManager layoutManagerHot = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rcvSinger.setLayoutManager(layoutManagerHot);
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