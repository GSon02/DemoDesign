package com.example.demodesign.DemoAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demodesign.FragmentMusic.HomeFragment;
import com.example.demodesign.FragmentMusic.PlayListFragment;
import com.example.demodesign.FragmentMusic.TopFragment;

public class ViewPagerAdapter_Demo extends FragmentStatePagerAdapter {
    public ViewPagerAdapter_Demo(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new PlayListFragment();
            case 2:
                return new TopFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
