package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMessage2 = findViewById(R.id.tvMsg2);
        tvMessage2.setText(R.string.Msg2);

        Log.i("Lifecycle","onCreate method is invoked...");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle","onsStart method is invokes.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","onResume method is invokes.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","onPause method is invokes.");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle","onStop method is invokes.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle","onDestroyed method is invokes.");
    }
}