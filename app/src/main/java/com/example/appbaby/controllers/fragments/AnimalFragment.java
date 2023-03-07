package com.example.appbaby.controllers.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.appbaby.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimalFragment extends Fragment {

    private static final String KEY_ANIMAL = "KEY_ANIMAL";
    private static final String KEY_IMAGE_ANIMAL = "KEY_IMAGE_ANIMAL";
    private static final String KEY_MEDIA_PLAYER_ID = "KEY_MEDIA_PLAYER_ID";
    @BindView(R.id.fragment_container_image) ImageView image;
    private MediaPlayer mPlayer;

    private String mAnimal;
    private int mMediaPlayerId;
    private int mImageAnimal;

    public AnimalFragment() {
        // Required empty public constructor
    }
    @OnClick(R.id.fragment_container_image)
    public void click(){
        if(!mPlayer.isPlaying()){
            mPlayer.start();
        }else {
            mPlayer.stop();
            mPlayer = MediaPlayer.create(getContext(),mMediaPlayerId);
        }
    }
    public static AnimalFragment newInstance(String animal,int imageAnimal,int mediaPlayerId) {
        AnimalFragment fragment = new AnimalFragment();
        Bundle args = new Bundle();
        args.putString(KEY_ANIMAL, animal);
        args.putInt(KEY_IMAGE_ANIMAL,imageAnimal);
        args.putInt(KEY_MEDIA_PLAYER_ID,mediaPlayerId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mAnimal = getArguments().getString(KEY_ANIMAL);
            mImageAnimal = getArguments().getInt(KEY_IMAGE_ANIMAL);
            mMediaPlayerId = getArguments().getInt(KEY_MEDIA_PLAYER_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_animal, container, false);
        ButterKnife.bind(this,view);
        mPlayer = MediaPlayer.create(getContext(),mMediaPlayerId);
        image.setImageResource(mImageAnimal);
        return view;
    }


}