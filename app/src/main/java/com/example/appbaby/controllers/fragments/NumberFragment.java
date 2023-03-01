package com.example.appbaby.controllers.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appbaby.R;


public class NumberFragment extends Fragment {

    private static final String NUMBER_KEY = "NUMBER_KEY";

    private int number;

    public NumberFragment() {
        // Required empty public constructor
    }

    public static NumberFragment newInstance(int number) {
        NumberFragment fragment = new NumberFragment();
        Bundle args = new Bundle();
        args.putInt(NUMBER_KEY,number);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            number = getArguments().getInt(NUMBER_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number, container, false);

        return view;
    }
}