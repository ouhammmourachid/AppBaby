package com.example.appbaby.models;

import com.example.appbaby.R;

public class Animals {
    public static int getResourceImageAnimalId(String animal){
        switch (animal){
            case "Dog":
                return R.drawable.chien;
            default:
                return R.drawable.chat;
        }
    }
    public static int getResourceRawAnimalId(String animal){
        switch (animal){
            case "Dog":
                return R.raw.chien;
            default:
                return R.raw.chat;
        }
    }
}
