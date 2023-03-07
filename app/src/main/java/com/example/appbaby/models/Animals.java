package com.example.appbaby.models;

import com.example.appbaby.R;

/**
 * this class is responsible of managing access the id of image and sound function for the animal
 * by using static function
 */
public class Animals {
    /**
     * get the image id in the drawable directory by  using the name of the animal.
     * @param animal the name of the animal.
     * @return id represent the id of image in the drawable .
     */
    public static int getResourceImageAnimalId(String animal){
        switch (animal){
            case "Dog":
                return R.drawable.chien;
            default:
                return R.drawable.chat;
        }
    }
    /**
     * get the sound id in the raw directory by using the name of the animal.
     * @param animal the name of the animal.
     * @return id of the animal sound .
     */
    public static int getResourceRawAnimalId(String animal){
        switch (animal){
            case "Dog":
                return R.raw.chien;
            default:
                return R.raw.chat;
        }
    }
}
