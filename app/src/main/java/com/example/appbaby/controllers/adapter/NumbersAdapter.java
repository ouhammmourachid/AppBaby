package com.example.appbaby.controllers.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.appbaby.controllers.fragments.NumberFragment;
import com.example.appbaby.models.Numbers;

public class NumbersAdapter extends FragmentStatePagerAdapter {
    public NumbersAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return NumberFragment.newInstance(position,Numbers.getResourceImageNumberId(position));
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
