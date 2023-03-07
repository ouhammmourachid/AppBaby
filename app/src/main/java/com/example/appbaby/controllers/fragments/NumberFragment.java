package com.example.appbaby.controllers.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.appbaby.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * this class is responsible of displaying fragment that contain an image of a number
 * and how to pronounce it in english of course .
 */
public class NumberFragment extends Fragment {

    private static final String NUMBER_KEY = "NUMBER_KEY";
    private static final String KEY_IMAGE_NUMBER = "KEY_IMAGE_NUMBER";
    private static final String KEY_MEDIA_PLAYER_ID = "KEY_MEDIA_PLAYER_ID";
    @BindView(R.id.fragment_container_image) ImageView image ;
    private MediaPlayer mPlayer;
    private int number;
    private int mImageNumber;
    private int mMediaPlayerId;

    public NumberFragment() {
        // Required empty public constructor
    }

    public static NumberFragment newInstance(int number,int imageNumber,int mediaPlayerId) {
        NumberFragment fragment = new NumberFragment();
        Bundle args = new Bundle();
        args.putInt(NUMBER_KEY,number);
        args.putInt(KEY_IMAGE_NUMBER,imageNumber);
        args.putInt(KEY_MEDIA_PLAYER_ID,mediaPlayerId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            number = getArguments().getInt(NUMBER_KEY);
            mImageNumber = getArguments().getInt(KEY_IMAGE_NUMBER);
            mMediaPlayerId = getArguments().getInt(KEY_MEDIA_PLAYER_ID);
        }
    }

    /**
     * handle the click on an image of number by playing the corresponding mp3 file from raw
     * resource .and we add also some logic so that the first click on the button start playing
     * the sound and the second one stopping if it is steel playing .
     */
    @OnClick(R.id.fragment_container_image)
    public void click(){
        if(!mPlayer.isPlaying()){
            mPlayer.start();
        }else {
            mPlayer.stop();
            mPlayer = MediaPlayer.create(getContext(),mMediaPlayerId);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number, container, false);
        ButterKnife.bind(this,view);
        mPlayer = MediaPlayer.create(getContext(),mMediaPlayerId);
        image.setImageResource(mImageNumber);
        return view;
    }
}