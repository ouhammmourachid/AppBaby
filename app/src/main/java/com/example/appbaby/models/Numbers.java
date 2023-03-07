package com.example.appbaby.models;

import com.example.appbaby.R;

/**
 * thi class contain two static function to access image and audio resources for the numbers 0,1,..,9.
 */
public class Numbers {
    /**
     * get the identifier of images of the number by this static function.
     * @param number
     * @return the identifier in the drawable resource file .
     */
    public static int getResourceImageNumberId(int number){
        switch (number){
            case 0:
                return R.drawable.i0;
            case 1:
                return R.drawable.i1;
            case 2:
                return R.drawable.i2;
            case 3:
                return R.drawable.i3;
            case 4:
                return R.drawable.i4;
            case 5:
                return R.drawable.i5;
            case 6:
                return R.drawable.i6;
            case 7:
                return R.drawable.i7;
            case 8:
                return R.drawable.i8;
            default:
                return R.drawable.i9;
        }
    }

    /**
     * get the identifier of sound of number using this static function.
     * @param number
     * @return the identifier in the raw resource file .
     */
    public static int getResourceRawNumberId(int number){
        switch (number){
            case 1:
                return R.raw.a1;
            case 2:
                return R.raw.a2;
            case 3:
                return R.raw.a3;
            case 4:
                return R.raw.a4;
            case 5:
                return R.raw.a5;
            case 6:
                return R.raw.a6;
            case 7:
                return R.raw.a7;
            case 8:
                return R.raw.a8;
            default:
                return R.raw.a9;
        }
    }
}
