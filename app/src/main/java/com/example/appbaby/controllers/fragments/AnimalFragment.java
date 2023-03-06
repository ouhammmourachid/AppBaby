package com.example.appbaby.controllers.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.appbaby.R;

public class AnimalFragment extends Fragment {

    private static final String KEY_ANIMAL = "KEY_ANIMAL";
    private static final String KEY_IMAGE_ANIMAL = "KEY_IMAGE_ANIMAL";
    private ImageView image;

    private String mAnimal;
    private int mImageAnimal;

    public AnimalFragment() {
        // Required empty public constructor
    }

    public static AnimalFragment newInstance(String animal,int imageAnimal) {
        AnimalFragment fragment = new AnimalFragment();
        Bundle args = new Bundle();
        args.putString(KEY_ANIMAL, animal);
        args.putInt(KEY_IMAGE_ANIMAL,imageAnimal);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mAnimal = getArguments().getString(KEY_ANIMAL);
            mImageAnimal = getArguments().getInt(KEY_IMAGE_ANIMAL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_animal, container, false);
        image = view.findViewById(R.id.fragment_container_image);
        image.setImageResource(mImageAnimal);
        return view;
    }


}