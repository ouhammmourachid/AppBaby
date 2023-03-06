package com.example.appbaby.controllers.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.appbaby.controllers.fragments.AnimalFragment;
import com.example.appbaby.models.Animals;

public class AnimalsAdapter extends FragmentStatePagerAdapter {
    private String[] animals = {"Cat","Dog"};

    public AnimalsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String animalName = animals[position];
        return AnimalFragment.newInstance(animalName,Animals.getResourceImageAnimalId(animalName));
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
