package com.bahaa.task1;

import android.app.Application;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

/** Remembers the Light/Dark choice and applies it to every screen when the app starts. */
public class Task1App extends Application {

    private static final String PREFS = "settings";
    private static final String KEY_NIGHT_MODE = "night_mode";

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(getPrefs().getInt(
                KEY_NIGHT_MODE, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM));
    }

    /** Switches every screen of the app between Light and Dark mode. */
    public void toggleNightMode(boolean isNightNow) {
        int mode = isNightNow
                ? AppCompatDelegate.MODE_NIGHT_NO
                : AppCompatDelegate.MODE_NIGHT_YES;
        getPrefs().edit().putInt(KEY_NIGHT_MODE, mode).apply();
        AppCompatDelegate.setDefaultNightMode(mode);
    }

    private SharedPreferences getPrefs() {
        return getSharedPreferences(PREFS, MODE_PRIVATE);
    }
}
