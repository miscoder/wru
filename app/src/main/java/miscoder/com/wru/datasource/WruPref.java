package miscoder.com.wru.datasource;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

import miscoder.com.wru.WruApp;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by miscoder on 7/23/2016.
 */
public class WruPref {
    private final String preferenceName = WruApp.getInstance().getPackageName();
    private SharedPreferences.Editor editor;
    private SharedPreferences sharedPreferences;
    private static WruPref wruPref;

    private static String  APP_STATUS = "appStatus" ;

    public static WruPref getInstance() {
        if (wruPref == null)
            wruPref = new WruPref();
        return wruPref;
    }

    @SuppressLint("CommitPrefEdits")
    WruPref() {
        sharedPreferences = WruApp.getInstance().getApplicationContext().getSharedPreferences(preferenceName, MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public  int getAppStatus() {
        return sharedPreferences.getInt(APP_STATUS,0);
    }

    public void setAppStatus(int status){
        editor.putInt(APP_STATUS, status);
        editor.apply();
    }


}
