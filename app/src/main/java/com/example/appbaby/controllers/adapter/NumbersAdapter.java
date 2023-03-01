package com.example.appbaby.controllers.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.appbaby.controllers.fragments.NumberFragment;

public class NumbersAdapter extends FragmentPagerAdapter {
    public NumbersAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return NumberFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(position);
    }
}
