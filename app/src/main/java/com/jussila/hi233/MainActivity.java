package com.jussila.hi233;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {
    String msg = "Android : ";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, getString(R.string.on_create));
        Toast.makeText(this, getString(R.string.on_create), Toast.LENGTH_SHORT).show();

        if(Build.VERSION.SDK_INT <= Build.VERSION_CODES.FROYO)
        {
            Toast.makeText(this, getString(R.string.buy_new_phone), Toast.LENGTH_SHORT).show();
        }
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, getString(R.string.on_start));
        Toast.makeText(this, getString(R.string.on_start), Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, getString(R.string.on_resume));
        Toast.makeText(this, getString(R.string.on_resume), Toast.LENGTH_SHORT).show();
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, getString(R.string.on_pause));
        Toast.makeText(this, getString(R.string.on_pause), Toast.LENGTH_SHORT).show();
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, getString(R.string.on_stop));
        Toast.makeText(this, getString(R.string.on_stop), Toast.LENGTH_SHORT).show();
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, getString(R.string.on_destroy));
        Toast.makeText(this, getString(R.string.on_destroy), Toast.LENGTH_SHORT).show();
    }
}

