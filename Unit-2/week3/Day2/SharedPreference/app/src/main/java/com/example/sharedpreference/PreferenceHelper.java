package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;

public class PreferenceHelper {

    private static final String SHARED_PREFERENCE_DP_NAME = "com.xyz.sharedPreference";

    public static SharedPreferences getSharedPrefernce(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCE_DP_NAME, Context.MODE_PRIVATE);
    }

    public static void writeIntToPreference(int value, Context context, String key) {
        SharedPreferences.Editor editor = getSharedPrefernce(context).edit();
        editor.putInt(key, value);
        editor.apply();
    }



    public static int getIntToPreference(Context context,String key){
        return getSharedPrefernce(context).getInt(key,-1);
    }

}
