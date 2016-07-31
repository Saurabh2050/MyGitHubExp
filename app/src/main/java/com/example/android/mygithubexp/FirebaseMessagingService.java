package com.example.android.mygithubexp;

import android.util.Log;

import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Saurabhg on 31-07-2016.
 */
public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private static final String TAG = FirebaseMessagingService.class.getName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.i(TAG,"onMessageReceived");
    }
}
