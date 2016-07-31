package com.example.android.mygithubexp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Saurabhg on 31-07-2016.
 */
public class FirebaseInstanceIDService extends FirebaseInstanceIdService   {
    private static final String TAG = FirebaseMessagingService.class.getName();
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.i(TAG,"FirebaseInstanceIDService" +token);

    }
}
