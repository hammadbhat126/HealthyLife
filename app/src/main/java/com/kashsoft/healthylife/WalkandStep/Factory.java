
package com.kashsoft.healthylife.WalkandStep;

import android.content.pm.PackageManager;

import com.kashsoft.healthylife.WalkandStep.services.AbstractStepDetectorService;
import com.kashsoft.healthylife.WalkandStep.services.AccelerometerStepDetectorService;
import com.kashsoft.healthylife.WalkandStep.services.HardwareStepDetectorService;
import com.kashsoft.healthylife.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}
