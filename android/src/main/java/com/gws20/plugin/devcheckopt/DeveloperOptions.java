package com.gws20.plugin.devcheckopt;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;  // ✅ Import logging

public class DeveloperOptions {
    private static final String TAG = "DeveloperOptions";  // ✅ Tag untuk log

    public boolean isDeveloperOptionsEnabled(Context context) {
        Log.d(TAG, "🔍 Getting Developer Options status...");  // ✅ Log awal

        try {
            int devOptions = Settings.Secure.getInt(
                context.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED,
                0
            );
            boolean isEnabled = devOptions == 1;

            Log.d(TAG, "✅ Developer Options Enabled: " + isEnabled);  // ✅ Log hasil
            return isEnabled;
        } catch (Exception e) {
            Log.e(TAG, "❌ Error retrieving Developer Options status", e);  // ✅ Log error jika terjadi
            return false;
        }
    }
}
