package com.salieai.app.core.session;

import android.content.Context;
import android.content.SharedPreferences;

public final class SessionManager {
    private static final String PREFS = "salie_prefs";
    private static final String KEY_LOGGED_IN = "logged_in";
    private static final String KEY_DISPLAY_NAME = "display_name";

    private SessionManager() {}

    public static boolean isLoggedIn(Context context) {
        return prefs(context).getBoolean(KEY_LOGGED_IN, false);
    }

    public static void setLoggedIn(Context context, boolean loggedIn) {
        prefs(context).edit().putBoolean(KEY_LOGGED_IN, loggedIn).apply();
    }

    public static void setDisplayName(Context context, String name) {
        prefs(context).edit().putString(KEY_DISPLAY_NAME, name).apply();
    }

    public static String getDisplayName(Context context) {
        String name = prefs(context).getString(KEY_DISPLAY_NAME, null);
        return name == null || name.trim().isEmpty() ? "Student" : name;
    }

    private static SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }
}

