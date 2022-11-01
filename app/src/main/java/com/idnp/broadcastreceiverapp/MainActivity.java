package com.idnp.broadcastreceiverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputMessageInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter("com.idnp.lab04.MY_MESSAGE");
        MyBroadcastReceiver objReceiver = new MyBroadcastReceiver();
        registerReceiver(objReceiver, intentFilter);
    }

    public void sendToastBroadcast(View v){
        inputMessageInt = findViewById(R.id.inputMessageInt);

        Intent intent = new Intent();
        intent.setAction("com.idnp.lab04.MY_MESSAGE");
        intent.putExtra("msg", inputMessageInt.getText().toString());
        sendBroadcast(intent);
        // Limpiamos la caja de texto
        inputMessageInt.setText("");
    }
}