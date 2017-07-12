package com.broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;
    private MyBroadcastReceiver myBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = (TextView) findViewById(R.id.tv_name);
    }

    @Override
    protected void onResume() {
        super.onResume();

        myBroadcastReceiver = new MyBroadcastReceiver();
        IntentFilter filter = new IntentFilter("com.broadcast");
        registerReceiver(myBroadcastReceiver, filter);

    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(myBroadcastReceiver);
    }

    public class MyBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            updateUI();
        }
    }

    public void updateUI() {
        tvName.setText("Karthick");
    }
}
