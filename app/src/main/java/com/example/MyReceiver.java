package com.example;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import mysong.play.com.playmysong.R;

/**
 * Created by student on 3/17/15.
 */
public class MyReceiver extends BroadcastReceiver {
    Context c=null;

    @Override
    public void onReceive(Context context, Intent intent) {


        Toast.makeText(context, "MyReceiver Started",
                Toast.LENGTH_SHORT).show();
        Log.v("Info Message", "in Broadcast receiver");
        Intent myIntent=new Intent(context,MyService.class);
        context.startService(myIntent);


    }



}



