package com.example.appbaby.controllers.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appbaby.R;

public class AnimalFragment extends Fragment {

    private static final String KEY_ANIMAL = "KEY_ANIMAL";

    private String mAnimal;

    public AnimalFragment() {
        // Required empty public constructor
    }

    public static AnimalFragment newInstance(String animal) {
        AnimalFragment fragment = new AnimalFragment();
        Bundle args = new Bundle();
        args.putString(KEY_ANIMAL, animal);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mAnimal = getArguments().getString(KEY_ANIMAL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_number, container, false);
    }


}