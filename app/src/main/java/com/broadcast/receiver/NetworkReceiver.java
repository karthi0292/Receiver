package com.broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Colan Infotech.
 */

public class NetworkReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null) {
            Intent intent1=new Intent("com.broadcast");
           // intent1.setAction("com.broadcast.receiver");
            context.sendBroadcast(intent1);
        }
    }
}
