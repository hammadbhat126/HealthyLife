
package com.kashsoft.healthylife.WalkandStep.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;

import com.kashsoft.healthylife.R;
import com.kashsoft.healthylife.WalkandStep.utils.StepDetectionServiceHelper;



public class OnPackageReplacedBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // init preferences
        PreferenceManager.setDefaultValues(context, R.xml.pref_general, false);
        PreferenceManager.setDefaultValues(context, R.xml.pref_notification, false);

        // start all services
        StepDetectionServiceHelper.startAllIfEnabled(context);
    }
}
