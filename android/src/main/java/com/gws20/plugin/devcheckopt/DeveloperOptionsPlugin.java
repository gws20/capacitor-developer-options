package com.gws20.plugin.devcheckopt;

import android.content.Context;
import android.util.Log;  // ✅ Import untuk logging
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DeveloperOptions")
public class DeveloperOptionsPlugin extends Plugin {

    private static final String TAG = "DeveloperOptionsPlugin"; // ✅ Nama tag untuk logging
    private DeveloperOptions implementation = new DeveloperOptions();

    @PluginMethod
    public void isDeveloperOptionsEnabled(PluginCall call) {
        Log.d(TAG, "🔍 Checking Developer Options...");  // ✅ Log awal

        try {
            Context context = getContext();
            boolean isEnabled = implementation.isDeveloperOptionsEnabled(context);

            Log.d(TAG, "✅ Developer Options status: " + isEnabled);  // ✅ Log hasil pengecekan

            JSObject ret = new JSObject();
            ret.put("enabled", isEnabled);
            call.resolve(ret);
        } catch (Exception e) {
            Log.e(TAG, "❌ Error checking Developer Options", e);  // ✅ Log error jika terjadi
            call.reject("Error checking Developer Options", e);
        }
    }
}
