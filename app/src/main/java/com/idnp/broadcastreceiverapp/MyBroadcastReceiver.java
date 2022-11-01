package com.idnp.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String msg = intent.getExtras().getString("msg");

        Log.i("BroadcastReceiver", "Mensaje enviado desde la app 1 a la app 1");
        Toast.makeText(context, "MENSAJE RECEPCIONADO DESDE LA APP 1: "+ msg, Toast.LENGTH_LONG).show();
    }
}