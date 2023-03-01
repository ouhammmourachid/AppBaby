package com.example.appbaby.controllers.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.appbaby.controllers.fragments.AnimalFragment;

public class AnimalsAdapter extends FragmentPagerAdapter {

    private String[] animals = {"Cat","dog"};

    public AnimalsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return AnimalFragment.newInstance(animals[position]);
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return animals[position];
    }
}
