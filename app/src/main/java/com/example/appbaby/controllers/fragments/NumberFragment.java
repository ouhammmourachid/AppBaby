package com.example.appbaby.controllers.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.appbaby.R;


public class NumberFragment extends Fragment {

    private static final String NUMBER_KEY = "NUMBER_KEY";
    private static final String KEY_IMAGE_NUMBER = "KEY_IMAGE_NUMBER";

    private int number;
    private int mImageNumber;
    private ImageView image ;

    public NumberFragment() {
        // Required empty public constructor
    }

    public static NumberFragment newInstance(int number,int imageAnimal) {
        NumberFragment fragment = new NumberFragment();
        Bundle args = new Bundle();
        args.putInt(NUMBER_KEY,number);
        args.putInt(KEY_IMAGE_NUMBER,imageAnimal);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            number = getArguments().getInt(NUMBER_KEY);
            mImageNumber = getArguments().getInt(KEY_IMAGE_NUMBER);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number, container, false);
        image = view.findViewById(R.id.fragment_container_image);
        image.setImageResource(mImageNumber);
        return view;
    }
}