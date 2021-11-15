package com.example.demodesign.FragmentMusic;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.demodesign.DemoAdapter.BaiHatGoiYAdapter_Demo;
import com.example.demodesign.DemoAdapter.CasiHomeAdapter_Demo;
import com.example.demodesign.DemoModel.BaiHatGoiY_Model_Demo;
import com.example.demodesign.DemoModel.CaSiHome_Model_Demo;
import com.example.demodesign.MySongsActivity;
import com.example.demodesign.R;

import java.util.ArrayList;
import java.util.List;

public class PlayListFragment extends Fragment {
    private CardView cvThuVien;
    private ImageView imgThuVienNhac;
    private CardView cvPlayList;
    private ImageView imgPlayList;
    private CardView cvCaSi;
    private ImageView imgCaSi;
    private RecyclerView rcvBaiHatGoiY;

    private List<CaSiHome_Model_Demo> caSiHome_model_demoList;
    private CasiHomeAdapter_Demo casiFavorAdapterDemo;
    private List<BaiHatGoiY_Model_Demo> baiHatGoiY_model_demoList;
    private BaiHatGoiYAdapter_Demo baiHatGoiYAdapter_demo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cvThuVien = (CardView) view.findViewById(R.id.cvBaiHat);
        imgThuVienNhac = (ImageView) view.findViewById(R.id.imgThuVienNhac);
        cvPlayList = (CardView) view.findViewById(R.id.cvYeuThich);
        imgPlayList = (ImageView) view.findViewById(R.id.imgPlayList);
        cvCaSi = (CardView) view.findViewById(R.id.cvPlaylist);
        imgCaSi = (ImageView) view.findViewById(R.id.imgCaSi);
        rcvBaiHatGoiY = (RecyclerView) view.findViewById(R.id.rcvBaiHatGoiY);

        cvThuVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MySongsActivity.class);
                startActivity(intent);
            }
        });

        baiHatGoiY_model_demoList = new ArrayList<>();
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_burnitdown_thumbail,"Burn it all Down","PVRIS"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_namnguemru_thumbail,"Nằm ngủ emru","Bích Phương"));
        baiHatGoiY_model_demoList.add(new BaiHatGoiY_Model_Demo(R.drawable.demo_psycho_thumbail,"Psycho","Red Velvet"));
        baiHatGoiYAdapter_demo = new BaiHatGoiYAdapter_Demo(getContext(), baiHatGoiY_model_demoList);
        rcvBaiHatGoiY.setAdapter(baiHatGoiYAdapter_demo);
        RecyclerView.LayoutManager layoutManagerGoiY = new LinearLayoutManager(getContext());
        rcvBaiHatGoiY.setLayoutManager(layoutManagerGoiY);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_play_list, container, false);
    }
}