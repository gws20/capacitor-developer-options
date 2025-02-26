package com.gws20.plugin.devcheckopt;

import android.util.Log;

public class DeveloperOptions {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
