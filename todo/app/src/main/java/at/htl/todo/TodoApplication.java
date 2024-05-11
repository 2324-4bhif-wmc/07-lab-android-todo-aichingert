package at.htl.todo;

import android.app.Application;
import android.util.Log;

import javax.inject.Singleton;
import dagger.hilt.android.HiltAndroidApp;

/** Our application entry point.
 * Needed as the dependency injection container.
 */
@HiltAndroidApp
public class TodoApplication extends Application {
    static final String TAG = TodoApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "App started ...");
    }
}
