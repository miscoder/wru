package miscoder.com.wru;

import android.app.Application;

/**
 * Created by miscoder on 7/23/2016.
 */
public class WruApp extends Application {
    static WruApp wruApp ;

    public static WruApp getInstance() {
        if (wruApp == null)
            wruApp = new WruApp();
        return wruApp;
    }
}
